package org.kane.seis601class.models;

import java.util.Date;

//like a shopping cart of items
public class Order {
	//public enum Status {NEW, CANCELLED, COMPLETED}
	public static int NEW=0; //CHANGE TO ENUM
	public static int CANCEL=1; //CHANGE TO ENUM
	public static int COMPLETED=2; //CHANGE TO ENUM
	
	private int id;
	private int sessionID;
	private Date createdAt;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSessionID() {
		return sessionID;
	}
	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
