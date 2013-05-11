package org.kane.seis601class.views;

import org.kane.seis601class.controllers.SessionControllerInterface;
import org.kane.seis601class.models.Session;
import org.kane.seis601class.models.User;
import org.kane.seis601class.repositories.UserRepo;

public class AuthView implements ViewInterface {
	public enum AuthState{WAITING_FOR_USERNAME, WAITING_FOR_PASSWORD}
	private AuthState currentState;
	private String enteredUsername;
	private String enteredPassword;
	private UserRepo userRepo;
	private SessionControllerInterface sessionController;
	
	
	public AuthView(SessionControllerInterface s){
		sessionController = s;
		currentState = AuthState.WAITING_FOR_USERNAME;
		userRepo = new UserRepo();
	}
	
	public void display(){
		if(currentState == AuthState.WAITING_FOR_USERNAME){
		System.out.println("***Welcome to the POS Registration System*** \n");
		System.out.println("Please enter your username: ");
		}else {
			System.out.println("Please enter your password: ");
		}
		
	}
	public void processUserInput(String input){
		if(currentState == AuthState.WAITING_FOR_USERNAME){
			this.enteredUsername = input;
			currentState = AuthState.WAITING_FOR_PASSWORD;
			}else {
				this.enteredPassword = input;
				authUser();
			}
	}
	public void authUser(){
		User temp = userRepo.auth(enteredUsername, enteredPassword);
		if(temp == null){
			System.out.println("Invalid Username or Password! Please try again.");
			currentState = AuthState.WAITING_FOR_USERNAME;
			}else{
				sessionController.startSession(temp);
				
			
		}
	}
}
