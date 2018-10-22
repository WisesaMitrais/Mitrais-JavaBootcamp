package com.mitrais;

import com.mitrais.hackerrank.*;
import com.mitrais.hackerrank.solution.algorithm.warmup.*;
import com.mitrais.hackerrank.solution.algorithm.implementation.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import java.text.*;
import java.util.*;

public class Main {

    //Logic begin here.
    public static void runningExperiment(){
        AlgorithmProblem algoProblem = AlgorithmProblem.getSingletonAP();

        algoProblem.printAllProblem("WU");
        algoProblem.printTotalProblem("WU");
        algoProblem.addProblem("WU", "XXX");

        System.out.println("\n");

        algoProblem.printAllProblem("WU");
        algoProblem.printTotalProblem("WU");
    }

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date) + " | Java-Basic running..\n");
        runningExperiment();
    }
}
