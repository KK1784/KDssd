package org.kane.seis601class;

import org.kane.seis601class.models.*;
import org.kane.seis601class.repositories.*;

public class Main {
	public static void runTest(){
		UserRepo r = new UserRepo();
		User u = new User();
		u.setId(123);
		r.addUser(u);
		System.out.println(r);
		r.save();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		runTest();
		
		
	

	}

}
