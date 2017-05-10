package com.greenfox.AppendA;

import lombok.Getter;

@Getter
public class Appended {
  private String appended;

  public Appended(String appended) {
    this.appended = appended;
  }

  public void appendWord() {
    appended = appended + "a";
  }
}
