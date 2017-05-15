package com.greenfox.Model;

public class Groot {
  private String received;
  private String translated;

  public Groot(String message) {
    received = message;
    translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
}
