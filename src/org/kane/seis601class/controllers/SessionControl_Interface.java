package org.kane.seis601class.controllers;

import org.kane.seis601class.models.User;

public interface SessionControl_Interface {
	
	public void startSession(User user);
	public void stopSession();
}
