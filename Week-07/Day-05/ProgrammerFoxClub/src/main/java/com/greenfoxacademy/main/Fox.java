package com.greenfoxacademy.main;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

  public void addTricks(String trick) {
    tricks.add(trick);
  }

  public String getName() {
    return name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
