package com.dl.report.client;

import java.io.File;
import java.util.Map;

import com.dl.model.ConfigModel;
import com.dl.model.ConfigModel.SubscriptionType;
import com.dl.model.StatusResponse;
import com.dl.reporting.service.ReportingServiceProvider;

public class SOAClient {
	public static void main(String[] args) throws InterruptedException {
		ConfigModel config = ConfigFactory.getConfig(new File("c:\\pbirs\\config1.properties")); // SOA logic
		setReportParameters(config);

		ReportingServiceProvider service = new ReportingServiceProvider();
//
//		config.setSubscriptionType(SubscriptionType.EMAIL);
//		StatusResponse generateReport = service.generateReport(config);
//		System.out.println("Completed");
		
//		config.setSubscriptionType(SubscriptionType.FILE_SHARE);
//		StatusResponse generateReport = service.generateReport(config);
//		System.out.println("Completed");
		
		config.setSubscriptionType(SubscriptionType.FILE_SHARE_AND_EMAIL);
		StatusResponse response = service.generateReport(config);
		System.out.println(response);
		System.out.println("Completed");

		
//		config.setSubscriptionType(SubscriptionType.CUSTOM_EMAIL);
//		config.setStoreReportFlag(true);
//		StatusResponse generateReport = service.generateReport(config);
//		System.out.println("Completed");
//		
//		config.setSubscriptionType(SubscriptionType.RENDER);
//		StatusResponse generateReport = service.generateReport(config);
//
//		config.setSubscriptionType(SubscriptionType.SUB_STATUS);
//		config.setSubscriptionId("cebd0213-ca01-4636-80b2-29fb8d41af22");
//		StatusResponse generateReport = service.generateReport(config);
//		System.out.println(generateReport.getResult());
		System.exit(0);

	}

	private static void setReportParameters(ConfigModel config) 
	{
		Map<String, String> reportParameters = config.getReportParameters();
		reportParameters.put("format", "RPL");
		reportParameters.put("UserName", "DGSL\\pbirs.service");
		reportParameters.put("startDate","11/16/2023");
	}
}
