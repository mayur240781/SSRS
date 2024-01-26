package com.dl.reporting.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.dl.model.ConfigModel;
import com.dl.model.SDKBusinessException;
import com.dl.model.ServerConfig;
import com.dl.model.StatusResponse;
import com.dl.reporting.service2010.ArrayOfCatalogItem;
import com.dl.reporting.service2010.ArrayOfSearchCondition;
import com.dl.reporting.service2010.ArrayOfString;
import com.dl.reporting.service2010.CatalogItem;
import com.dl.reporting.service2010.ReportingService2010Soap;
import com.dl.reporting.service2010.SearchCondition;

public class ReportingServiceProvider {
	private static final ReportingServiceProvider instance = new ReportingServiceProvider();
//	private static ReportingService2010Soap reportingService2010;

	public ReportingServiceProvider() {
//		initiateScheduler();
	}

//	public static ReportingServiceProvider getInstance(ServerConfig serverConfig) {
//
////		reportingService2010 = new ServiceFactory().getReportingService(serverConfig);
//		return instance;
//	}

	public StatusResponse generateReport(ConfigModel config) {
		StatusResponse response = StatusResponse.getFailedResponse("INVALID SubscriptionType", null);
		ServerConfig serverConfig = config.getServerConfig();
		ReportingService2010Soap client = null;
		switch (config.getSubscriptionType()) {
		case EMAIL:
			client = new ServiceFactory().getReportingService(serverConfig);
			response = new EmailSubscriptionProvider().generateReport(config, client);
			break;
		case FILE_SHARE:
			client = new ServiceFactory().getReportingService(serverConfig);
			response = new FileShareSubscriptionProvider().generateReport(config, client);
			break;
		case FILE_SHARE_AND_EMAIL:
			client = new ServiceFactory().getReportingService(serverConfig);
			response = new FileShareAndEmailSubscriptionProvider().generateReport(config, client);
			break;
		case CUSTOM_EMAIL:
			response = new CustomEmailProvider().generateReport(config);
			break;
		case RENDER:
			response = new RenderProvider().generateReport(config);
			break;
		case SUB_STATUS:
			response = new SubscriptionStatusProvider().generateReport(config);
			break;
		default:
			break;
		}
		return response;
	}

	public String getReportPath(ReportingService2010Soap client, String reportName, String reportRootFloder)
			throws SDKBusinessException {
		String reportPath = null;
		try {

			ArrayOfSearchCondition arrayOfSearchCondition = new ArrayOfSearchCondition();
			List<SearchCondition> searchCondition = arrayOfSearchCondition.getSearchCondition();

			SearchCondition nameCondition = new SearchCondition();
			nameCondition.setName("name");
			ArrayOfString arrayOfString = new ArrayOfString();
			arrayOfString.getValue().add(reportName);
			nameCondition.setValues(arrayOfString);
			searchCondition.add(nameCondition);

			if (reportRootFloder != null && !reportRootFloder.equals("")) {
				reportRootFloder = "/" + reportRootFloder;
			} else {
				reportRootFloder = "/";
			}
			ArrayOfCatalogItem items = client.findItems(reportRootFloder, null, null, arrayOfSearchCondition, null,
					null);

			if (items != null && items.getCatalogItem() != null && !items.getCatalogItem().isEmpty()) {
				List<CatalogItem> catalogItem = items.getCatalogItem();
				Iterator<CatalogItem> iterator = catalogItem.iterator();
				while (iterator.hasNext()) {
					CatalogItem next = iterator.next();
					if (next.getTypeName().equals("Report")) {
						reportPath = next.getPath();
						System.out.println("*************" + reportPath);
					}

				}
			}
		} 
		
		
		catch (Exception e) {
			throw new SDKBusinessException("Exception in find Report Path !!!", e);
		}
		return reportPath;
	}

	public String createUniqueReportName(String reportName) {
		String uniqueReportName = reportName;
		if (reportName != null && !reportName.equals("")) {
			Date currentDate = new Date();

			// Define the desired format
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");

			// Format the current timestamp
			String formattedTimestamp = dateFormat.format(currentDate);
			uniqueReportName = reportName + "_" + formattedTimestamp;

		}
		return uniqueReportName;
	}

//	public static void addSubscription(String subscriptionId) {
//		subscriptionList.put(subscriptionId, new Date());
//		logger.info("subscription Added: " + subscriptionId);
//		logger.info("#######SIZE: ##### " + subscriptionList.size());
//	}
//
//	private void deleteSubscription(String subscriptionId) {
//		subscriptionList.remove(subscriptionId);
//		logger.info("subscription Removed: " + subscriptionId);
//		logger.info("SIZE:  " + subscriptionList.size());
//	}
//
//	private void initiateScheduler() {
//		Logger logger2 = LogManager.getLogger(ReportingServiceProvider.class);
//		logger2.info("Scheduler Initiated");
//		// Create a scheduled executor service
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//
//		// Define a task to be executed periodically
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					logger2.info("inside Task " + subscriptionList.size());
//					Iterator<Entry<String, Date>> iterator = subscriptionList.entrySet().iterator();
//
//					while (iterator.hasNext()) {
//						Entry<String, Date> next = iterator.next();
//						String subscriptionId = next.getKey();
//						Date createdDate = next.getValue();
//						Date dateNow = new Date();
//						long timeDifferenceMillis  = dateNow.getTime() - createdDate.getTime();
//						long timeDifferenceMinutes = timeDifferenceMillis / (1000 * 60);
//						if (timeDifferenceMinutes > 1) {
//							iterator.remove();
////						deleteSubscription(subscriptionId);
//							logger2.info("Delete Subscription ");
//							reportingService2010.deleteSubscription(subscriptionId);
//						}
//					}
//				}
//
//				catch (Exception e) {
//					logger2.info("Exception ", e);
//				}
//			}
//		});
//
//		// Schedule the task to run every 5 seconds with an initial delay of 0 seconds
//		scheduler.scheduleAtFixedRate(thread, 12, 5, TimeUnit.SECONDS);
//
//	}

//	public static ReportingService2010Soap getReportingservice2010() {
//		return reportingService2010;
//	}
//
//	public static void setReportingService2010(ReportingService2010Soap client) {
//		reportingService2010 = client;
//	}
}
