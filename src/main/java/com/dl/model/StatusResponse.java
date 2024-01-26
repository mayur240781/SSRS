package com.dl.model;

public class StatusResponse {
	

	public StatusResponse(String status, String message, Exception e) {
		Status = status;
		Message = message;
		this.e = e;
	}

	private String Status;
	String Message;
	Exception e;
	private String result;

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Exception getException() {
		return e;
	}

	public void setException(Exception e) {
		this.e = e;
	}

	public static StatusResponse getSuccessResponse(String message, String result) {
		StatusResponse statusResponse = new StatusResponse("Sucessful", message, null);
		statusResponse.setResult(result);
		return statusResponse;
	}

	public static StatusResponse getFailedResponse(String message, Exception e) {
		return new StatusResponse("Failed", message, e);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	public String toString() {
		return "StatusResponse [Status=" + Status + ", Message=" + Message + ", result=" + result + "]";
	}
}
