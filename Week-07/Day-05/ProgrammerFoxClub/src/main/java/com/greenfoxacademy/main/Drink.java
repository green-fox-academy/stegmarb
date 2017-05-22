package com.greenfoxacademy.main;

public enum Drink {
  WATER("water"), LEMONADE("lemonade"), ENERGYDRINK("energy drink"), COKE("coke");

  private final String text;

  Drink(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }

}
