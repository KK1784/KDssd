package org.kane.seis601class.models;

import java.util.Date;

//session login stamp and logout stamp for user
public class Session {
	private int id;
	private int userID;
	private Date loginAt;
	private Date logoutAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Date getLoginAt() {
		return loginAt;
	}
	public void setLoginAt(Date loginAt) {
		this.loginAt = loginAt;
	}
	public Date getLogoutAt() {
		return logoutAt;
	}
	public void setLogoutAt(Date logoutAt) {
		this.logoutAt = logoutAt;
	}
	
	
}
