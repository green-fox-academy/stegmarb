package com.greenfox.doubled;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubled {
  private int recieved;
  private int doubled;

  public Doubled(int input) {
    this.recieved = input;
  }

  public void doubleValue() {
    doubled = recieved*2;
  }
}
