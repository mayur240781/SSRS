package com.dl.model;

public class FileShareConfig 
{
	String path;
//	String renderFormat;
	String fileName;
	String fileShareuserName;
	String fileShareuserPwd;
//	String reportFormat;

	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
//	public String getRenderFormat() {
//		return renderFormat;
//	}
//	public void setRENDER_FORMAT(String renderFormat) {
//		this.renderFormat = renderFormat;
//	}
//	public String getFileName() {
//		return fileName;
//	}
//	public void setFILENAME(String fileName) {
//		this.fileName = fileName;
//	}
	public String getFileShareuserName() {
		return fileShareuserName;
	}
	public void setFileShareuserName(String fileShareuserName) {
		this.fileShareuserName = fileShareuserName;
	}
	public String getFileShareuserPwd() {
		return fileShareuserPwd;
	}
	public void setFileShareuserPwd(String fileShareuserPwd) {
		this.fileShareuserPwd = fileShareuserPwd;
	}
//	public String getReportFormat() {
//		return reportFormat;
//	}
//	public void setReportFormat(String reportFormat) {
//		this.reportFormat = reportFormat;
//	}
	
	@Override
	public String toString() {
		return "FileShareConfig [PATH=" + path +  ", FILENAME=" + fileName + "]";
	}

}
