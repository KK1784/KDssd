package org.kane.seis601class.controllers;

import org.kane.seis601class.models.User;

public interface SessionControllerInterface {
public void startSession(User user);
public void stopSession();
}
