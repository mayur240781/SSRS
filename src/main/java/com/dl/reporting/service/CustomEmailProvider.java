package com.dl.reporting.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.mail.MessagingException;
import javax.xml.ws.Holder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dl.model.ConfigModel;
import com.dl.model.SDKBusinessException;
import com.dl.model.StatusResponse;
import com.dl.reporting.execution2005.ArrayOfParameterValue;
import com.dl.reporting.execution2005.ArrayOfString;
import com.dl.reporting.execution2005.ArrayOfWarning;
import com.dl.reporting.execution2005.ExecutionHeader;
import com.dl.reporting.execution2005.ExecutionInfo;
import com.dl.reporting.execution2005.ObjectFactory;
import com.dl.reporting.execution2005.ParameterValue;
import com.dl.reporting.execution2005.ReportExecutionServiceSoap;
import com.dl.reporting.service2010.ReportingService2010Soap;

public class CustomEmailProvider 
{
	private static final Logger logger = LogManager.getLogger(CustomEmailProvider.class);

	public StatusResponse generateReport(ConfigModel config) {
		StatusResponse response = null;
		try {

			ReportingService2010Soap client = new ServiceFactory().getReportingService(config.getServerConfig());
			String reportPath = new ReportingServiceProvider().getReportPath(client, config.getReportPath(), config.getReportRootFolder());

			ReportExecutionServiceSoap service = new ServiceFactory().getReportExecutionService(config);
//			String reportPath = config.getReportPath();

			String format = config.getRenderFormat();
			String historyID = null;
			String devInfo = "<DeviceInfo></DeviceInfo>";
			Holder<byte[]> result = new Holder();

			Holder<String> encoding = null;
			Holder<String> mimeType = null;
			Holder<String> extension = null;
			Holder<ArrayOfWarning> warnings = null;
			Holder<ArrayOfString> streamIDs = null;
			
		

			ExecutionInfo execInfo = service.loadReport(reportPath, historyID, null, null, null);

			ObjectFactory factory = new ObjectFactory();
			ExecutionHeader executionHeader = factory.createExecutionHeader();
			executionHeader.setExecutionID(execInfo.getExecutionID());
			
			
			Map<String, String> reportParameters = config.getReportParameters();
			if (reportParameters != null && !reportParameters.isEmpty())
			{
				ArrayOfParameterValue parameters = new ArrayOfParameterValue();
				List<ParameterValue> parameterValue = parameters.getParameterValue();

				Iterator<Entry<String, String>> iterator = reportParameters.entrySet().iterator();
				while (iterator.hasNext())
				{
					Entry<String, String> param = iterator.next();
					ParameterValue p1 = new ParameterValue();
					p1.setName(param.getKey());
					p1.setValue(param.getValue());
					p1.setLabel(param.getValue());
					parameterValue.add(p1);
				}
				service.setExecutionParameters(parameters, devInfo, executionHeader, null, null);
			}

			service.render(format, devInfo, executionHeader, null, result, extension, mimeType, encoding, warnings,
					streamIDs, null);
			logger.info("Render Service executed Successfully..");
//			logger.info("########################################" + result.value);

			
			new MailService().sendMail((byte[])result.value, config, config.getReportName());
			logger.info("Custom Email Sent Successfully..");
			
			if (config.getStoreReportFlag())
			{
				
				response = new FileShareSubscriptionProvider().generateReport(config, client);
				response.setMessage("Report will get Generated in sometime at Location --> " + config.getFileConfig().getPath() + "and also report will be shared on email" );
			}
			else
			{
				response = StatusResponse.getSuccessResponse("Report Generated successfully",null);
			}
			
			
		} 
		catch (MessagingException e) 
		{
			response = StatusResponse.getFailedResponse("Exception in Creating Email Subscription", e);
			logger.error("Exception occured in CustomEmailProvider.generateReport() for config " + config, e);
		} 
		catch (SDKBusinessException ex) 
		{
			response = StatusResponse.getFailedResponse(ex.getMessage(), ex);
			logger.error("Exception occured in CustomEmailProvider.generateReport() in report search ", ex);
		}
		return response;
	}
}
