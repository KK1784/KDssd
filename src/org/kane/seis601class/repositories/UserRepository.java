package org.kane.seis601class.repositories;

import java.util.*;

import org.kane.seis601class.models.User;

public class UserRepository extends BaseRepository {
	//class members
	private ArrayList<User> userlist;
	
	//constructor
	@SuppressWarnings("unchecked")
	public UserRepository() {
		this.filename = "Users.txt";
		ArrayList <User> list = (ArrayList<User>) this.deserializeObj();
		if(list == null){
			this.userlist = new ArrayList<User>();
		}else{
			this.userlist = list;
		}
	}
	
	//add and save methods
	public void addUser(User u) {
		this.userlist.add(u);
	}
	public void save(){
		this.serialize(this.userlist);
	}
	
	//check user array list for username and password match
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
	
	@Override
	public String toString() {
		return "UserRepository [userlist=" + userlist + "]";
	}


}
