package org.kane.seis601class.repositories;

import java.util.*;

import org.kane.seis601class.models.User;

public class UserRepo extends BaseRepo {
	private ArrayList<User> userlist;
	
	public User auth(String username, String password){
		User returnUser = null;
		
		for(int i = 0; i < userlist.size(); i++){
			User temp = userlist.get(i);
			System.out.println(temp);
			if(username.equals(temp.getUsername()) && password.equals(temp.getPassword())){
				returnUser = temp;
			}
		}
		
		return returnUser;
		
	}
	public String toString() {
		return "UserRepo [userlist=" + userlist + "]";
	}

	@SuppressWarnings("unchecked")
	public UserRepo() {
		this.filename = "Users.txt";
		ArrayList <User> list = (ArrayList<User>) this.deserializeObj();
		if(list == null){
			this.userlist = new ArrayList<User>();
		}else{
			this.userlist = list;
		}
	}
	
	public void addUser(User u) {
		this.userlist.add(u);
	}
	public void save(){
		this.serialize(this.userlist);
	}
}
