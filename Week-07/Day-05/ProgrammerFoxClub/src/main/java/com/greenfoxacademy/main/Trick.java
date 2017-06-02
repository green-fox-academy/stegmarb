package com.greenfoxacademy.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trick {
  List<String> tricks = new ArrayList<>(Arrays.asList("Do back flip",
      "Cook",
      "Write program in Java",
      "Transparent vision",
      "Run like Ussain Bolt"));

  public Trick() {
  }

  public void addTrick(String string) {
    tricks.add(string);
  }

  public List<String> getTricks() {
    return tricks;
  }
}
