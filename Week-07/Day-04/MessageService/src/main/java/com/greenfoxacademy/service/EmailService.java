package com.greenfoxacademy.service;

public class EmailService implements MessageService {

  @Override
  public void sendingMessage(String message, String address) {
    System.out.println("Email Sent to " + address +  " with Message= " + message);
  }
}
