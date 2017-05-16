package com.greenfox.model;


import lombok.Getter;

@Getter
public class Food {
  public String name;
  public int amount;
  public int calories;

  public Food(String name, int amount, int calories) {
    this.name = name;
    this.amount = amount;
    this.calories = calories;
  }
}
