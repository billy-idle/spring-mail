package com.github.billy.springmail;

import com.github.billy.springmail.service.EmailService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMailApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringMailApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(EmailService emailService) {
    return args -> {
      emailService.sendSimpleMessage("guillesupremacy@gmail.com", "First Email", "This is gonna "
          + "be great!");
    };
  }
}
