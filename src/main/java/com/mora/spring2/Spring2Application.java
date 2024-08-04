package com.mora.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mora.spring2")
@ComponentScan("com.mora.controllers")
@ComponentScan("com.mora.models")
@ComponentScan("com.mora.validation")
@ComponentScan("com.mora.services")
@ComponentScan("com.mora.")
public class Spring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

}
