package com.greenfox.doubled;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubled {
  private int received;
  private int result;

  public Doubled(int input) {
    this.received = input;
  }

  public void doubleValue() {
    result = received*2;
  }
}
