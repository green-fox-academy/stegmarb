package com.greenfox.ArrayHandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayHandler {
  private String what;
  private int[] numbers;

  public ArrayHandler() {
  }

  public ArrayHandler(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }
}
