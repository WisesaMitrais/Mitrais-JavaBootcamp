package com.mitrais.javabootcamp;

import model.HackerRankProblem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaBootcampApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JavaBootcampApplication.class, args);
		System.out.println("Java-Bootcamp running...");

		HackerRankProblem hrp = applicationContext.getBean("HackerRankProblemBean", HackerRankProblem.class);
		System.out.println(hrp.getProblemID());
	}

	@Bean(name = "HackerRankProblemBean")
	public HackerRankProblem setHackerRankProblem(){
		HackerRankProblem hrp = new HackerRankProblem(
				11301,
				"Algorithm",
				"Warmup",
				"WU_AVeryBigSum");
		return hrp;
	}
}
