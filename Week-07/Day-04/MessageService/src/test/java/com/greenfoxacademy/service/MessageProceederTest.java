package com.greenfoxacademy.service;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class MessageProceederTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  @Autowired
  MessageProceeder messageProceeder;


  @Test
  public void testSendingMessageIfItIsEmail() {
    messageProceeder.processMessage("Test message", "stegmarb@gmail.com");
    assertEquals("Email Sent to stegmarb@gmail.com with Message= Test message", outContent.toString());
  }
}