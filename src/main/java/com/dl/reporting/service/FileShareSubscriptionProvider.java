package com.dl.reporting.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dl.model.ConfigModel;
import com.dl.model.SDKBusinessException;
import com.dl.model.StatusResponse;
import com.dl.reporting.service2010.ArrayOfChoice1;
import com.dl.reporting.service2010.ArrayOfParameterValue;
import com.dl.reporting.service2010.ExtensionSettings;
import com.dl.reporting.service2010.ParameterValue;
import com.dl.reporting.service2010.ReportingService2010Soap;

public class FileShareSubscriptionProvider {

	private static final Logger logger = LogManager.getLogger(FileShareSubscriptionProvider.class);
	public StatusResponse generateReport(ConfigModel config, ReportingService2010Soap client) 
	{
		StatusResponse response = null;
		try 
		{
			if (client == null)
			{
				client = new ServiceFactory().getReportingService(config.getServerConfig());
			}
			String reportPath = new ReportingServiceProvider().getReportPath(client, config.getReportPath(), config.getReportRootFolder());
//			String reportPath = config.getReportPath(); // "/Sample/Report Execution";
			String description = config.getDescription();
			String eventType = config.getEventType(); // "TimedSubscription";
			ExtensionSettings extensionSettings = new ExtensionSettings();
			extensionSettings.setExtension("Report Server FileShare");

			ArrayOfChoice1 parameterValues = new ArrayOfChoice1();
			extensionSettings.setParameterValues(parameterValues);

			ParameterValue pval1 = new ParameterValue();
			pval1.setName("PATH");
			pval1.setValue(config.getFileConfig().getPath());

			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval1);

			ParameterValue pval2 = new ParameterValue();
			pval2.setName("RENDER_FORMAT");
			pval2.setValue(config.getRenderFormat());

			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval2);

			//TODO: set reportPath as reportName
			String reportName = new ReportingServiceProvider().createUniqueReportName(config.getReportName());
//			String reportName = new ReportingServiceProvider().createUniqueReportName(config.getReportPath());
			
			ParameterValue pval3 = new ParameterValue();
			pval3.setName("FILENAME");
			pval3.setValue(reportName);
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval3);

			ParameterValue pval4 = new ParameterValue();
			pval4.setName("USERNAME");
			pval4.setValue(config.getFileConfig().getFileShareuserName());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval4);

			ParameterValue pval5 = new ParameterValue();
			pval5.setName("PASSWORD");
			pval5.setValue(config.getFileConfig().getFileShareuserPwd());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval5);

			String matchData = "<ScheduleDefinition><StartDateTime>" + config.getScheduleStartDateTime()
			+ "</StartDateTime><DailyRecurrence><DaysInterval>" + config.getScheduleDaysInterval()
			+ "</DaysInterval></DailyRecurrence></ScheduleDefinition>";

			ArrayOfParameterValue paramValue = new ArrayOfParameterValue();
			List<ParameterValue> parameterValue = paramValue.getParameterValue();
			if (parameterValue == null) {
				parameterValue = new ArrayList<ParameterValue>();
			}

			Map<String, String> reportParameters = config.getReportParameters();
			if (reportParameters != null && !reportParameters.isEmpty())
			{
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
			}

			String subscriptionId = client.createSubscription(reportPath, extensionSettings, description, eventType,
					matchData, paramValue,null,null);
			logger.info("FileShare Subscription Created successfully - ID: " + subscriptionId);

			response = StatusResponse.getSuccessResponse("FileShare Subscription Created successfully",subscriptionId);
			
			client.fireEvent("TimedSubscription", subscriptionId, null,null,null);
			logger.info("Event Fired successfully for subscriptionId: " + subscriptionId);
			
		} 
		catch (SDKBusinessException e) 
		{
			response = StatusResponse.getFailedResponse(e.getMessage(), e);
			logger.error(e.getMessage(), e);
		}
		catch (Exception e) 
		{
			response = StatusResponse.getFailedResponse("Exception in Creating FileShare Subscription", e);
			logger.error("Exception in FileShareClient.generateReport() for Request - " + config , e);
		}
		return response;
	}
	

}
