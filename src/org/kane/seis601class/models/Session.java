package org.kane.seis601class.models;

import java.util.Date;

//session login stamp and logout stamp for user
public class Session {
	//class members
	private int id;
	private int userID;
	private User user;
	private Date loginAt;
	private Date logoutAt;
	
	//constructor
	public Session() {
	}
	
	//methods
	public void loginUser(User user){
		this.user = user;
		this.loginAt = new Date();
		this.userID = this.user.getId();
	}
	public void logoutUser(){
		this.logoutAt = new Date();
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}

	public User getUser() {
		return user;
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
