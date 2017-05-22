package com.greenfoxacademy.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trick {
  List<String> tricks;

  public Trick() {
    tricks = new ArrayList<>();
    tricks.add("Do back flip");
    tricks.add("Cook");
    tricks.add("Write program in Java");
    tricks.add("Transparent vision");
    tricks.add("Run like Ussain Bolt");
  }

  public List<String> getTricks() {
    return tricks;
  }
}
