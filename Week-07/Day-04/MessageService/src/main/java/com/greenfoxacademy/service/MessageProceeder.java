package com.greenfoxacademy.service;

import com.greenfoxacademy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;


public class MessageProceeder {
  @Autowired
  MessageService messageService;
  String message;
  String email;

  public MessageProceeder() {
    messageService = new MessageService() {
      @Override
      public void sendingMessage(String message, String email) {

      }
    };
  }

  public void processMessage(String message, String address) {
    messageService.sendingMessage(message, address);
  }
}
