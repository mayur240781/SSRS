package com.dl.model;

public class SDKBusinessException extends Exception 
{
	String message;
	Throwable throwable;
	
	
	public SDKBusinessException(String message, Throwable throwable) 
	{
		super();
		this.message = message;
		this.throwable = throwable;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	
}
