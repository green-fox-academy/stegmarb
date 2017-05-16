package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class Drax {
  private List<Food> calories = new ArrayList<>();

  public Drax() {
  }

  public void addFoodToList(Food food) {
    calories.add(food);
  }
}
