package com.mitrais.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
		System.out.println("Spring JDBC is running...");
	}

}
