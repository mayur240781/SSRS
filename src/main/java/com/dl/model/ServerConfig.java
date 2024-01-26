package com.dl.model;

public class ServerConfig {
	String username;
	String password;
	String domain;
	String ssrsServer;
	String ssrsUrl;
	String ssrsExecutionUrl;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getSSRSServer() {
		return ssrsServer;
	}
	public void setSSRSServer(String sSRSServer) {
		ssrsServer = sSRSServer;
	}
	public String getSSRSUrl() {
		return ssrsUrl;
	}
	public void setSSRSUrl(String ssrsUrl) {
		this.ssrsUrl = ssrsUrl;
	}
	public String getSSRSExecutionUrl() {
		return ssrsExecutionUrl;
	}
	public void setSSRSExecutionUrl(String ssrsExecutionUrl) {
		this.ssrsExecutionUrl = ssrsExecutionUrl;
	}

}
