package org.kane.seis601class.controllers;

import java.io.*;

import org.kane.seis601class.views.*;

public class MainViewController {
	
	private AuthView currentView;
	private boolean shouldExit;
	
	public MainViewController(){
		shouldExit = false;
		currentView = new AuthView();
	}
	
	public void run(){
		while(shouldExit == false){
			currentView.display();
			System.out.print(">> ");
			String input = readUserInput();
			checkForExit(input);
		}System.out.println("exiting...");

	}
	public void checkForExit(String input){
		if(input.equals("q")||input.equals("Q"))
			shouldExit = true;
		
	}
	public String readUserInput(){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return input;
	}
}
