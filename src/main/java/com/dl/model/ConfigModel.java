package com.dl.model;

import java.util.HashMap;
import java.util.Map;

public class ConfigModel 
{
	public static enum SubscriptionType{FILE_SHARE, EMAIL, CUSTOM_EMAIL, RENDER, SUB_STATUS, FILE_SHARE_AND_EMAIL};
	private SubscriptionType subscriptionType;
	
	String reportRootFolder;
	String reportPath;
	Map<String, String> reportParameters = new HashMap<String, String>();
	String description;
	String eventType;

	private String subscriptionId;
	String ScheduleDaysInterval;
	String ScheduleStartDateTime;
	
	ServerConfig serverConfig;
	FileShareConfig fileConfig;
	EmailConfig emailConfig;
	private Boolean storeReportFlag;
	
	private String reportName;
	private String renderFormat; // PDF, EXCELOPENXML 
	private String reportFormat; // RPL


	
	public ConfigModel()
	{
		serverConfig = new ServerConfig();
		fileConfig = new FileShareConfig();
		emailConfig = new EmailConfig();
		
	}
	public String getReportPath() {
		return reportPath;
	}
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
	
	public String getReportRootFolder() 
	{
		return reportRootFolder;
	}
	public void setReportRootFolder(String reportRootFolder) 
	{
		this.reportRootFolder = reportRootFolder;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getScheduleDaysInterval() {
		return ScheduleDaysInterval;
	}
	public void setScheduleDaysInterval(String scheduleDaysInterval) {
		ScheduleDaysInterval = scheduleDaysInterval;
	}
	public String getScheduleStartDateTime() {
		return ScheduleStartDateTime;
	}
	public void setScheduleStartDateTime(String scheduleStartDateTime) {
		ScheduleStartDateTime = scheduleStartDateTime;
	}
	public ServerConfig getServerConfig() {
		return serverConfig;
	}

	public FileShareConfig getFileConfig() {
		return fileConfig;
	}

	public EmailConfig getEmailConfig() {
		return emailConfig;
	}
	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Map<String, String> getReportParameters() {
		return reportParameters;
	}
	public Boolean getStoreReportFlag() {
		return storeReportFlag;
	}
	public void setStoreReportFlag(Boolean storeReportFlag) {
		this.storeReportFlag = storeReportFlag;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getRenderFormat() {
		return renderFormat;
	}
	public void setRenderFormat(String renderFormat) {
		this.renderFormat = renderFormat;
	}
	public String getReportFormat() {
		return reportFormat;
	}
	public void setReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
	}

}

