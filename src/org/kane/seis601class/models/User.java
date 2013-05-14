package org.kane.seis601class.models;

import java.io.Serializable;

//a user is a cashier or admin
public class User implements Serializable {
	//class members
	private int id;
	private String username;
	private String password;
	
	//constructor
	public User () {
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	

	@Override//toString
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}

