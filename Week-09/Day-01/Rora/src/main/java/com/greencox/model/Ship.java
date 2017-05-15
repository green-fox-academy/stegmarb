package com.greencox.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

public class Ship {

  private String received;
  private int amount;
  private String ShipStatus;
  private boolean ready;

  public Ship(String caliber, int amount, Cargo cargo) {
    this.received = caliber;
    this.amount = amount;
    cargo.addAmmo(amount, caliber);
    cargo.setReady(cargo.ready());
    cargo.setShipStatus(cargo.shipStatus());
    ShipStatus = cargo.getShipStatus();
    ready = cargo.isReady();
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public String getShipStatus() {
    return ShipStatus;
  }

  public boolean isReady() {
    return ready;
  }
}
