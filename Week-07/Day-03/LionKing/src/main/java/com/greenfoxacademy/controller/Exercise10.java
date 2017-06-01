package com.greenfoxacademy.controller;

import com.greenfoxacademy.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Exercise10 {

  private List<BankAccount> clients = new ArrayList<>(Arrays.asList(
    new BankAccount("Simba", 2000, "lion"),
    new BankAccount("Nana", 1400, "female lion"),
    new BankAccount("Rafiki", 200, "monkey"),
    new BankAccount("Zordon", 1800, "bad lion"),
    new BankAccount( "Timon", 400, "meerkats"),
    new BankAccount("Pumba", 350, "warthog")));

  @RequestMapping("/exercise10")
  public String arrayList(Model model){
    model.addAttribute("clients", clients);
    return "buttons";
  }

  @RequestMapping("/exercise10/addTen")
  public String addTenZebras(@RequestParam("name") String name) {
    for (int i = 0; i < clients.size(); i++) {
      if (name.equals(clients.get(i).getName())) {
        clients.get(i).setBalance(clients.get(i).getBalance()+10);
      }
    }
    return "redirect:/exercise10/";
  }

  @RequestMapping("/exercise10/addNewElement")
  public String addNewElement(@RequestParam("name") String name,
                              @RequestParam("balance") int balance,
                              @RequestParam("type") String type) {
    clients.add(new BankAccount(name, balance, type));
    return "redirect:/exercise10/";
  }
}
