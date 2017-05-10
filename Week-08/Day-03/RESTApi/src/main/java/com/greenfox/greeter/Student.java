package com.greenfox.greeter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
  private String welcome_message;

  public Student(String welcomeMessage) {
    this.welcome_message = welcomeMessage;
  }
}
