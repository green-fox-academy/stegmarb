package com.greencox.model;

import lombok.Getter;

@Getter
public class Ship {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

  public Ship() {
    shipStatus = "empty";
  }
}
