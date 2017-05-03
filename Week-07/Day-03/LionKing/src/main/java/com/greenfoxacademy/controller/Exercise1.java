package com.greenfoxacademy.controller;


import com.greenfoxacademy.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
  }
