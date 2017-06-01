package com.greenfoxacademy.service;

import com.greenfoxacademy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;


public class MessageProceeder {
  @Autowired
  EmailService emailService;

  @Autowired
  TwitterService twitterService;

  public MessageProceeder() {
  }

  public void processMessage(String message, String address) {
    String[] strings = address.split("@");
    if (strings[0].equals("")) {
      twitterService.sendingMessage(message,address);
    } else {
      emailService.sendingMessage(message, address);
    }
  }
}
