package com.greenfox.Model;

public class Groot {
  private String recieved;
  private String translated;

  public Groot(String message) {
    recieved = message;
    translated = "I am Groot!";
  }

  public String getRecieved() {
    return recieved;
  }

  public String getTranslated() {
    return translated;
  }
}
