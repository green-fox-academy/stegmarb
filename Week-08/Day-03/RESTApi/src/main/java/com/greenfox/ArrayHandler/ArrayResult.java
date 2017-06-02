package com.greenfox.ArrayHandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayResult extends Result {
  private int[] result;

  public ArrayResult(int[] result) {
    this.result = result;
  }
}
