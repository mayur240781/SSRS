package com.dl.report.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import com.dl.model.ConfigModel;
import com.dl.model.ConfigModel.SubscriptionType;

public class ConfigFactory {

	public static ConfigModel getConfig(File configFile) {
		Properties properties = new Properties();
		ConfigModel config = new ConfigModel();
		FileInputStream fileInputStream = null;
		try {
			
		    fileInputStream = new FileInputStream(configFile);
		    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			properties.load(inputStreamReader);

			config.getServerConfig().setUsername(properties.getProperty("username"));
			config.getServerConfig().setPassword(properties.getProperty("password"));
			config.getServerConfig().setDomain(properties.getProperty("domain"));
			config.getServerConfig().setSSRSServer(properties.getProperty("SSRSServer"));
			config.getServerConfig().setSSRSUrl(properties.getProperty("SSRSUrl"));
			config.getServerConfig().setSSRSExecutionUrl(properties.getProperty("SSRSExecutionUrl"));

			config.setSubscriptionType(SubscriptionType.valueOf(properties.getProperty("subscriptionType")));			
			
			config.setReportPath(properties.getProperty("reportPath"));
			config.setReportRootFolder(properties.getProperty("REPORT_ROOT_FOLDER"));
			config.setDescription(properties.getProperty("description"));
			config.setEventType(properties.getProperty("eventType"));
			String storeReportFlag = properties.getProperty("STORE_REPORT_FLAG");
			
			if (storeReportFlag != null && "YES".equals(storeReportFlag))
			{
				config.setStoreReportFlag(true);
			}
			else
			{
				config.setStoreReportFlag(false);
			}
			
			config.setRenderFormat(properties.getProperty("RENDER_FORMAT"));
			config.setReportFormat(properties.getProperty("REPORT_FORMAT"));
			

			config.setSubscriptionId(properties.getProperty("subscriptionId"));
			
			config.getFileConfig().setPath(properties.getProperty("PATH"));
//			config.getFileConfig().setRENDER_FORMAT(properties.getProperty("RENDER_FORMAT"));
//			config.getFileConfig().setFILENAME(properties.getProperty("FILESHARE_FILENAME"));
			config.setReportName(properties.getProperty("REPORT_NAME"));
			config.getFileConfig().setFileShareuserName(properties.getProperty("fileShareuserName"));
			config.getFileConfig().setFileShareuserPwd(properties.getProperty("fileShareuserPwd"));
//			config.getFileConfig().setReportFormat(properties.getProperty("reportFormat"));

			config.getEmailConfig().setEmailSender(properties.getProperty("EMAIL_SENDER"));
			config.getEmailConfig().setEmailRecipient(properties.getProperty("EMAIL_TO"));
			config.getEmailConfig().setEmailSubject(properties.getProperty("EMAIL_SUBJECT"));
			config.getEmailConfig().setEmailBody(properties.getProperty("EMAIL_BODY"));
//			config.getEmailConfig().setEmailAttachmentReportName(properties.getProperty("EMAIL_ATTACHMENT_REPORTNAME"));
//			config.getEmailConfig().setEmailRenderFormat(properties.getProperty("EMAIL_RENDER_FORMAT"));
//			config.getEmailConfig().setEmailReportFormat(properties.getProperty("EMAIL_REPORT_FORMAT"));
			config.getEmailConfig().setSmtpHost(properties.getProperty("SMTP_HOST"));
			config.getEmailConfig().setSmtpPort(properties.getProperty("SMTP_PORT"));
			
			config.getEmailConfig().setSmtpUserName(properties.getProperty("SMTP_USERNAME"));
			config.getEmailConfig().setSmtpPassword(properties.getProperty("SMTP_PASSWORD"));
			config.getEmailConfig().setSmtpProps(properties.getProperty("SMTP_PROPS"));
			
			config.setScheduleDaysInterval(properties.getProperty("DaysInterval"));
			config.setScheduleStartDateTime(properties.getProperty("StartDateTime"));

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return config;
	}
}
