package com.mitrais.springorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringormApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringormApplication.class, args);
		System.out.println("Spring ORM is running..");
	}

}
