package com.greenfox.DoUntil;

import lombok.Getter;

@Getter
public class GetResult {
  private int result;

  public GetResult(String what, int until) {
    if (what.equals("sum")) {
      sum(until);
    } else {
      result = factorial(until);
    }
  }

  public void sum(int number) {
    this.result = 0;
    for (int i = number; i >= 0 ; i--) {
      this.result += i;
    }
  }

  public int factorial(int number) {
    if (number == 1) {
      return 1;
    } else {
      return number*factorial(number-1);
    }
  }
}
