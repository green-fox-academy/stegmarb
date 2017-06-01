package com.greenfoxacademy.service;

public class TwitterService implements MessageService {

  @Override
  public void sendingMessage(String message, String address) {
    System.out.println("Tweet Sent to " + address + " with Message= " + message);
  }
}
