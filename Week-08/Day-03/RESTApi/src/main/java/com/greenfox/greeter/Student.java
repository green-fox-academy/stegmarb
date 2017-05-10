package com.greenfox.greeter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
  private String name;
  private String title;

  public Student(String name, String title) {
    this.name = name;
    this.title = title;
  }

  @Override
  public String toString() {
    return "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
