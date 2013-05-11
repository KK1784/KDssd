package org.kane.seis601class;

import java.io.File;

import org.kane.seis601class.controllers.MainViewController;
import org.kane.seis601class.models.*;
import org.kane.seis601class.repositories.*;

public class Main {
	public static void runTest(){
		UserRepo r = new UserRepo();
		User result = r.auth("username", "12345");
		System.out.println("Logging in with legit cred: " + result);
		User result2 = r.auth("username", "1234");
		System.out.println("Logging in with bad cred: " + result2);
	}
	
	public static void createFixtures(){	System.out.println("creating fixtures");
		UserRepo r = new UserRepo();
		User u = new User();
		u.setPassword("12345");
		u.setUsername("username");
		u.setId(123);
		r.addUser(u);
		r.save();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//createFixtures();//
		runTest();//populate user
		MainViewController vc = new MainViewController();
		vc.run();
		
	

	}

}
