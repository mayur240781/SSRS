package com.dl.reporting.service;

import com.dl.model.ConfigModel;
import com.dl.model.StatusResponse;
import com.dl.reporting.service2010.ReportingService2010Soap;

public class FileShareAndEmailSubscriptionProvider {

	public StatusResponse generateReport(ConfigModel config, ReportingService2010Soap client) 
	{
		if (client == null)
		{
			client = new ServiceFactory().getReportingService(config.getServerConfig());
		}
		StatusResponse emailResponse = null;
		StatusResponse finalResponse = null;
		StatusResponse fileShareResponse = new FileShareSubscriptionProvider().generateReport(config, client);
		
		if (fileShareResponse.getStatus() != null && fileShareResponse.getStatus() == "Sucessful")
		{
			emailResponse = new EmailSubscriptionProvider().generateReport(config, client);
			
			if (emailResponse.getStatus() != null && emailResponse.getStatus() == "Sucessful")
			{
				finalResponse = StatusResponse.getSuccessResponse("FileShare & Email Subscriptions Created successfully", fileShareResponse.getResult() + "," + emailResponse.getResult());
			}
			else
			{
				finalResponse = StatusResponse.getFailedResponse("FileShare Subscription Created successfully, but failed to create Email Subscription", emailResponse.getException());
				finalResponse.setResult(fileShareResponse.getResult());
			}
		}
		else
		{
			finalResponse = fileShareResponse;
		}

		return finalResponse;
	}

}
