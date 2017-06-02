package com.greenfox.ArrayHandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntResult extends Result {
  private int result;

  public IntResult(int result) {
    this.result = result;
  }
}
