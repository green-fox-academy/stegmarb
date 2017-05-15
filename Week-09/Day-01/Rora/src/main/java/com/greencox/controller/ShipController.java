package com.greencox.controller;

import com.greencox.model.Ship;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {
  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Ship getShip() {
    return new Ship();
  }
}
