package com.dl.reporting.service;

import javax.xml.ws.Holder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dl.model.ConfigModel;
import com.dl.model.StatusResponse;
import com.dl.reporting.service2010.ReportingService2010Soap;

public class SubscriptionStatusProvider {
	private static final Logger logger = LogManager.getLogger(SubscriptionStatusProvider.class);

	public StatusResponse generateReport(ConfigModel config) {

		StatusResponse response = null;
		try {
			ReportingService2010Soap client = new ServiceFactory().getReportingService(config.getServerConfig());

			String subscriptionId = config.getSubscriptionId();
			Holder<String> owner = new Holder();
			Holder<String> status = new Holder();
			client.getSubscriptionProperties(subscriptionId,null, owner, null, null, null, status, null, null, null,null);
			logger.info("Owner = " + owner + ", Status = " +  status);
			response = StatusResponse.getSuccessResponse("Subscription Status fetched", status.value);
		} catch (Exception e) {
			response = StatusResponse.getFailedResponse("Exception in Subscription Status", e);
			logger.error("Exception in SubscriptionStatusProvider.generateReport() for Request - " + config, e);
		}
		return response;
	}
}
