package com.greenfoxacademy.controller;


import com.greenfoxacademy.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Exercise1 {

  @RequestMapping("/exercise1")
  public String createBankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "bankaccount";
  }

  @RequestMapping("/exercise4")
  public String stringInsert(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }

  @RequestMapping("/exercise5")
  public String array(Model model){
    List<BankAccount> clients = new ArrayList<>();
    clients.add(new BankAccount("Simba", 2000, "lion"));
    clients.add(new BankAccount("Nana", 1400, "female lion"));
    clients.add(new BankAccount("Rafiki", 200, "monkey"));
    clients.add(new BankAccount("Zordon", 1800, "bad lion"));
    clients.add(new BankAccount( "Timon", 400, "meerkats"));
    clients.add(new BankAccount("Pumba", 350, "warthog"));
    model.addAttribute("clients", clients);
    return "clientlist";
  }
}
