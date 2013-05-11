package org.kane.seis601class.controllers;

import java.io.*;

import org.kane.seis601class.models.Session;
import org.kane.seis601class.views.*;

public class MainViewController {
	
	private ViewInterface currentView;
	private boolean shouldExit;
	private Session currentSession;
	
	public MainViewController(){
		shouldExit = false;
		currentSession = new Session();//this is a temp logic will need to create a session via sessionRepo
		currentView = new AuthView(currentSession);
	}
	
	public void run(){
		while(shouldExit == false){
			currentView.display();
			System.out.print(">> ");
			String input = readUserInput();
			checkForExit(input);
			if(!shouldExit){
				currentView.processUserInput(input);
				checkForSessionChange();
			}
		}System.out.println("exiting...");

	}
	public void checkForSessionChange(){
		if(currentSession.getUser() != null){
			System.out.println("You are currently logged in! ");
			currentView = new MainMenuView();
		}
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
