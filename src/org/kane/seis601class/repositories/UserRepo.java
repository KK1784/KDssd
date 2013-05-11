package org.kane.seis601class.repositories;

import java.io.*;
import java.util.*;

import org.kane.seis601class.models.User;

public class UserRepo {
	private ArrayList<User> userlist;
	private String filename = "/Users/kanenelson/POS/601ClassProject/Data/Users.txt";
	private boolean fileExist(){
		File f = new File(filename);
		return f.exists();
	}
	public String toString() {
		return "UserRepo [userlist=" + userlist + "]";
	}

	public UserRepo() {
		this.userlist = new ArrayList<User>();
		open();
	}
	public void open(){
		if(!fileExist()){
			return;
		}
		try {
			FileInputStream filein = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(filein);
			userlist = (ArrayList<User>) in.readObject();
			in.close();
			filein.close();
			
		} catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void save(){
		try {
			FileOutputStream fileout = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(userlist);
			out.close();
			fileout.close();
			
		} catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*public void save() {
		BufferedWriter w = null;
		try {
			w = new BufferedWriter(new FileWriter(
					"/Users/kanenelson/POS/601ClassProject/Data/Users.txt"));
			w.write("test string");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (w != null) {
				try {
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}*/

	public void addUser(User u) {
		this.userlist.add(u);
	}
}
