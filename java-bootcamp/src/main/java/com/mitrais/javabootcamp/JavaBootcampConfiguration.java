package com.mitrais.javabootcamp;

import model.ModelHackerRankProblem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBootcampConfiguration {

    @Bean(name = "BeanHackerRankProblem")
    public ModelHackerRankProblem setHackerRankProblem(){
        ModelHackerRankProblem hrp = new ModelHackerRankProblem(
                11301,
                "Algorithm",
                "Warmup",
                "WU_AVeryBigSum");
        return hrp;
    }
}
