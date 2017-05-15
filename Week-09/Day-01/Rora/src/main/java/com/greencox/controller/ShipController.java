package com.greencox.controller;

import com.greencox.model.Ship;
import com.greencox.model.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {

  @Autowired
  Cargo cargo;

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Cargo getShip() {
    return cargo;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Ship filledShip(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {
    Ship ship = new Ship(caliber, amount, cargo);
   return ship;
  }
}

