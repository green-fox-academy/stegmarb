package com.greenfoxacademy.controller;

import com.greenfoxacademy.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Exercise10 {
  @RequestMapping("/exercise10")
  public String arrayList(Model model){
    List<BankAccount> clients = new ArrayList<>();
    clients.add(new BankAccount("Simba", 2000, "lion"));
    clients.add(new BankAccount("Nana", 1400, "female lion"));
    clients.add(new BankAccount("Rafiki", 200, "monkey"));
    clients.add(new BankAccount("Zordon", 1800, "bad lion"));
    clients.add(new BankAccount( "Timon", 400, "meerkats"));
    clients.add(new BankAccount("Pumba", 350, "warthog"));
    model.addAttribute("clients", clients);
    return "buttons";
  }
}
