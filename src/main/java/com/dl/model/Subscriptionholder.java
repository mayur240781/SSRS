package com.dl.model;

import java.util.Date;

public class Subscriptionholder 
{
	String subscriptionid;
	Date createdDate;

	public Subscriptionholder(String subscriptionid) {
		this.subscriptionid = subscriptionid;
		this.createdDate = new Date();
	}

	public String getSubscriptionid() {
		return subscriptionid;
	}
	public void setSubscriptionid(String subscriptionid) {
		this.subscriptionid = subscriptionid;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
