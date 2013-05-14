package org.kane.seis601class.views;

import org.kane.seis601class.controllers.SessionControl_Interface;
import org.kane.seis601class.models.Session;
import org.kane.seis601class.models.User;
import org.kane.seis601class.repositories.UserRepository;

public class AuthView implements View_Interface {
	//class members
	public enum AuthState{WAITING_FOR_USERNAME, WAITING_FOR_PASSWORD}
	
	private AuthState currentState;
	private String enteredUsername;
	private String enteredPassword;
	private UserRepository userRepo;
	private SessionControl_Interface sessionController;
	
	//constructor that sets the state and waits for user input
	public AuthView(SessionControl_Interface s){
		sessionController = s;
		currentState = AuthState.WAITING_FOR_USERNAME;
		userRepo = new UserRepository();
	}
	
	//method brings up the authorization view display
	public void display(){
		if(currentState == AuthState.WAITING_FOR_USERNAME){
		System.out.println("*****************Please Login*****************\n"
                         + "*                                            *\n"
                         + "**********************************************\n");
		System.out.println("Please enter your username");
		}else {
			System.out.println("Please enter your password");
		}
		
	}
	
	//processes or reads the user input
	public void processUserInput(String input){
		if(currentState == AuthState.WAITING_FOR_USERNAME){
			this.enteredUsername = input;
			currentState = AuthState.WAITING_FOR_PASSWORD;
			}else {
				this.enteredPassword = input;
				authUser();
			}
	}
	
	//if this is an authorized user then it starts the session or tells user that username or password is wrong
	public void authUser(){
		User temp = userRepo.auth(enteredUsername, enteredPassword);
		if(temp == null){
			System.out.println("**Invalid Username or Password! Please try again.**\n");
			currentState = AuthState.WAITING_FOR_USERNAME;
			}else{
				sessionController.startSession(temp);
				
			
		}
	}
}
