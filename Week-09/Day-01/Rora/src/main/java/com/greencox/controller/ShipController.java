package com.greencox.controller;

import com.greencox.model.FilledShip;
import com.greencox.model.Ship;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class ShipController {
  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Ship getShip() {
    return new Ship();
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public FilledShip filledShip(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {
    FilledShip filledShip = new FilledShip(caliber, amount);
    filledShip.setStatusAndReadyness();
    return filledShip;
  }
}

