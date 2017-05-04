package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

  @Autowired
  HelloWorld helloWorld;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Override
  public void run(String... args) throws Exception {
	  helloWorld.setMessage("Hello World!");
	  helloWorld.getMessage();
  }
}
