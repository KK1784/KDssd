package org.kane.seis601class.controllers;

import java.io.*;

import org.kane.seis601class.models.Session;
import org.kane.seis601class.models.User;
import org.kane.seis601class.views.*;

public class MainViewController implements SessionControl_Interface{
	//class members
	private View_Interface currentView;
	private boolean shouldExit;
	private Session currentSession;
	
	//constructor
	public MainViewController(){
		shouldExit = false;
		currentView = new AuthView(this);
	}
	
	@Override//from SessionControllerInterface
	public void startSession(User user) {
		currentSession = new Session();//TODO this is a temp logic will need to create a session via sessionRepo
		currentSession.loginUser(user);
		currentView = new MainMenuView();
		System.out.println("You are currently logged in! ");
	}

	@Override//from SessionControllerInterface
	public void stopSession() {
		// TODO Auto-generated method stub
		
	}
	
	//methods
	public void run(){
		while(shouldExit == false){
			currentView.display();
			System.out.print(">> ");
			String input = readUserInput();
			checkForExit(input);
			if(!shouldExit){
				currentView.processUserInput(input);
		
			}
		}System.out.println("exiting...");

	}
		
	//checking for exit if user input is q or Q
	public void checkForExit(String input){
		if(input.equals("q")||input.equals("Q"))
			shouldExit = true;
		
	}
	//interprets or reads user input
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
