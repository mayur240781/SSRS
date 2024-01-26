package com.dl.model;

public class EmailConfig {
	
	String emailSender;
	String emailRecipient;
	String emailSubject;
	String emailBody;
	String emailAttachmentReportName;
//	String emailRenderFormat;
//	String emailReportFormat;
	String smtpHost;
	String smtpPort;

	String smtpUserName;
	String smtpPassword;
	String smtpProps;



	public String getSmtpProps() {
		return smtpProps;
	}
	public void setSmtpProps(String smtpProps) {
		this.smtpProps = smtpProps;
	}


	

	
	public String getEmailRecipient() {
		return emailRecipient;
	}
	public void setEmailRecipient(String emailRecipient) {
		this.emailRecipient = emailRecipient;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
//	public String getEmailRenderFormat() {
//		return emailRenderFormat;
//	}
//	public void setEmailRenderFormat(String emailRenderFormat) {
//		this.emailRenderFormat = emailRenderFormat;
//	}
//	public String getEmailReportFormat() {
//		return emailReportFormat;
//	}
//	public void setEmailReportFormat(String emailReportFormat) {
//		this.emailReportFormat = emailReportFormat;
//	}
	public String getEmailSender() {
		return emailSender;
	}
	public void setEmailSender(String emailSender) {
		this.emailSender = emailSender;
	}
	public String getSmtpPort() {
		return smtpPort;
	}
	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}
	public String getSmtpHost() {
		return smtpHost;
	}
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}
	public String getEmailBody() {
		return emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
	
	public String getSmtpUserName() {
		return smtpUserName;
	}
	public void setSmtpUserName(String smtpUserName) {
		this.smtpUserName = smtpUserName;
	}
	
	public String getSmtpPassword() {
		return smtpPassword;
	}
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	
//	public String getEmailAttachmentReportName() {
//		return emailAttachmentReportName;
//	}
//	public void setEmailAttachmentReportName(String emailAttachmentReportName) {
//		this.emailAttachmentReportName = emailAttachmentReportName;
//	}
	

	
	@Override
	public String toString() {
		return "EmailConfig [emailSender=" + emailSender + ", emailRecipient=" + emailRecipient + ", emailSubject="
				+ emailSubject + ", emailBody=" + emailBody + ", emailAttachmentReportName=" + emailAttachmentReportName + ", emailRenderFormat=" 
				+  ", smtpHost=" + smtpHost + ", smtpPort=" + smtpPort
				+ "]";
	}



}
