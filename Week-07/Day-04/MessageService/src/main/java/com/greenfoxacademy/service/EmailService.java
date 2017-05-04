package com.greenfoxacademy.service;

import com.greenfoxacademy.configuration.MessageService;

public class EmailService implements MessageService {

  @Override
  public void sendingMessage(String message, String email) {
    System.out.println("Email Sent to " + email +  " with Message=" + message);
  }
}
