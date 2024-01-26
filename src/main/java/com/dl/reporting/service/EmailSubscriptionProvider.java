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

public class EmailSubscriptionProvider {
	private static final Logger logger = LogManager.getLogger(EmailSubscriptionProvider.class);

	public StatusResponse generateReport(ConfigModel config, ReportingService2010Soap client) {

		StatusResponse response = null;
		try {
				if (client == null)
				{
					client = new ServiceFactory().getReportingService(config.getServerConfig());
				}
			
			String reportPath = new ReportingServiceProvider().getReportPath(client, config.getReportPath(), config.getReportRootFolder());
//			String reportPath = config.getReportPath(); // "/Sample/Report Execution";
			String description = config.getDescription();
			String eventType = config.getEventType(); // "TimedSubscription";

			ExtensionSettings extensionSettings = new ExtensionSettings();
			extensionSettings.setExtension("Report Server Email");
			ArrayOfChoice1 parameterValues = new ArrayOfChoice1();
			extensionSettings.setParameterValues(parameterValues);

			ParameterValue pval1 = new ParameterValue();
			pval1.setName("TO");
			pval1.setValue(config.getEmailConfig().getEmailRecipient());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval1);

			ParameterValue pval2 = new ParameterValue();
			pval2.setName("IncludeReport");
			pval2.setValue("true");
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval2);

			ParameterValue pval3 = new ParameterValue();
			pval3.setName("RenderFormat");
			pval3.setValue(config.getRenderFormat());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval3);

			ParameterValue pval4 = new ParameterValue();
			pval4.setName("Subject");
			pval4.setValue(config.getEmailConfig().getEmailSubject());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval4);

			ParameterValue pval5 = new ParameterValue();
			pval5.setName("Comment");
			pval5.setValue(config.getEmailConfig().getEmailBody());
			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval5);


//			ParameterValue pval6 = new ParameterValue();
//			pval6.setName("FILENAME");
//			pval6.setValue(config.getReportName());
//			parameterValues.getParameterFieldReferenceOrParameterValue().add(pval6);
			
			String matchData = "<ScheduleDefinition><StartDateTime>" + config.getScheduleStartDateTime()
					+ "</StartDateTime><DailyRecurrence><DaysInterval>" + config.getScheduleDaysInterval()
					+ "</DaysInterval></DailyRecurrence></ScheduleDefinition>";

			ArrayOfParameterValue paramValue = new ArrayOfParameterValue();
			List<ParameterValue> parameterValue = paramValue.getParameterValue();
			if (parameterValue == null) {
				parameterValue = new ArrayList<ParameterValue>();
			}

			Map<String, String> reportParameters = config.getReportParameters();
			if (reportParameters != null && !reportParameters.isEmpty()) {
				Iterator<Entry<String, String>> iterator = reportParameters.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<String, String> param = iterator.next();
					ParameterValue p1 = new ParameterValue();
					p1.setName(param.getKey());
					p1.setValue(param.getValue());
					p1.setLabel(param.getValue());
					parameterValue.add(p1);
				}
			}



			String subscriptionId = client.createSubscription(reportPath, extensionSettings, description, eventType,
					matchData, paramValue, null, null);
//			ReportingServiceProvider.addSubscription(subscriptionId);
			logger.info("Email Subscription Created successfully - ID: " + subscriptionId);
			response = StatusResponse.getSuccessResponse("Email Subscription Created successfully", subscriptionId);

			client.fireEvent("TimedSubscription", subscriptionId, null, null, null);
			logger.info("Event Fired successfully for Email subscriptionId: " + subscriptionId);

//			Holder<String> owner = new Holder<>();
//			Holder<String> status = new Holder<>();
//			client.getSubscriptionProperties(subscriptionId, owner, null, null, null, status, null, null, null);
//			logger.info("Owner = " + owner + ", Status = " +  status);

//			Thread.sleep(10000, 0);
//			client.deleteSubscription(subscriptionId);
//			logger.info("Email Subscription Deleted Successfully - subscriptionId: " + subscriptionId);
		} 
		catch (SDKBusinessException ex) 
		{
			response = StatusResponse.getFailedResponse(ex.getMessage(), ex);
			logger.error("Exception occured in EmailSubscriptionProvider.generateReport() in report search ", ex);
		}
		catch (Exception e) {
			response = StatusResponse.getFailedResponse("Exception in Creating Email Subscription", e);
			logger.error("Exception in EmailSubscriptionProvider.generateReport() for Request - " + config, e);
		}
		return response;
	}

}
