package com.greenfoxacademy;

import com.greenfoxacademy.configuration.MessageConfiguration;
import com.greenfoxacademy.configuration.MessageProceeder;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MessageservicesApplication implements CommandLineRunner {

	@Autowired
  MessageProceeder messageProceeder;

  public static void main(String[] args) {
		SpringApplication.run(MessageservicesApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
  }
}
