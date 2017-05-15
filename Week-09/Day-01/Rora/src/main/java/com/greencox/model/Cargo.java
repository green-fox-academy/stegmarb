package com.greencox.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Cargo {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

  public Cargo() {
    shipStatus = "empty";
  }

  public void addAmmo(int ammo, String caliber) {
    if (caliber.equals(".25")) {
      caliber25+=ammo;
    } else if (caliber.equals(".30")) {
      caliber30+=ammo;
    } else if (caliber.equals(".50")) {
      caliber50+=ammo;
    }
  }

  public boolean ready() {
    if (caliber50+caliber25+caliber30 == 12500) {
      return true;
    } else {
      return false;
    }
  }

  public String shipStatus() {
    int allAmmo = caliber25+caliber30+caliber50;
    if (allAmmo == 0) {
      return "empty";
    } else if (allAmmo == 12500) {
      return "full";
    } else if (allAmmo > 12500) {
      return "overload";
    } else if (allAmmo < 12500 && allAmmo > 0) {
      return Integer.toString((allAmmo*100)/12500) + "%";
    }
    return "";
  }

  public int getCaliber25() {
    return caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setShipStatus(String shipStatus) {
    this.shipStatus = shipStatus;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
