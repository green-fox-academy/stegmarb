package com.greenfox.controller;

import com.greenfox.model.Drax;
import com.greenfox.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DraxController {

  @Autowired
  Drax drax;

  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public List<Food> getListOfFood() {
    return drax.getCalories();
  }

  @RequestMapping(value = "/drax/add", method = RequestMethod.POST)
  public List<Food> addElementToList(@RequestParam("name") String name,
                                 @RequestParam("amount") int amount,
                                 @RequestParam("calories") int calories) {
    drax.addFoodToList(new Food(name, amount, calories));
    return drax.getCalories();
  }

  @RequestMapping(value = "/drax/remove", method = RequestMethod.DELETE)
  public List<Food> removeElementFromList(@RequestParam("name") String name) {
    for (int i = 0; i < drax.getCalories().size(); i++) {
      if (name.equals(drax.getCalories().get(i).getName())) {
        drax.getCalories().remove(i);
      }
    }
    return drax.getCalories();
  }
}
