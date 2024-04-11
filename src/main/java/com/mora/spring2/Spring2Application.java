package com.mora.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
// @ComponentScan("com.mora") // Tambien funciona o de esta manera
// @ComponentScan({"com.mora.spring2","com.mora.controllers"}) // otra manera
@ComponentScans({
		@ComponentScan("com.mora.spring2"),
		@ComponentScan("com.mora.controllers"),
		@ComponentScan("com.mora.models"),
		@ComponentScan("com.mora.validation"),
})
public class Spring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

}
