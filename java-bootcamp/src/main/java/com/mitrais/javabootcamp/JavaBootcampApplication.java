package com.mitrais.javabootcamp;

import model.ModelHackerRankProblem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import service.ServiceAlgorithmCategory;

@SpringBootApplication
@ComponentScan
public class JavaBootcampApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JavaBootcampApplication.class, args);
		System.out.println("Java-Bootcamp running...");

		ServiceAlgorithmCategory serviceAlgorithmCategory = new ServiceAlgorithmCategory(
				applicationContext.getBean("BeanHackerRankProblem", ModelHackerRankProblem.class));
		System.out.println(serviceAlgorithmCategory.getProblemCategory());
	}
}
