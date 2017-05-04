package com.greenfoxacademy.service;

public class TwitterService implements MessageService {

  @Override
  public void sendingMessage(String message, String email) {
    System.out.println("Tweet Sent to " + email + " with Message=" + message);
  }
}
