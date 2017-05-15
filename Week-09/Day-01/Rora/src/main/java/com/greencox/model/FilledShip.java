package com.greencox.model;

import lombok.Getter;

@Getter
public class FilledShip {
  private String recieved;
  private int amount;
  private String ShipStatus;
  private boolean ready;


  public FilledShip(String caliber, int amount) {
    recieved = caliber;
    this.amount = amount;
    ShipStatus = "empty";
    ready = false;
  }

  public void setStatusAndReadyness() {
    if (amount == 12500) {
      ShipStatus = "full";
      ready = true;
    } else if (amount > 12500) {
      ShipStatus = "overload";
    } else {
      ShipStatus = Integer.toString((amount*100)/12500) + "%";
    }
  }
}
