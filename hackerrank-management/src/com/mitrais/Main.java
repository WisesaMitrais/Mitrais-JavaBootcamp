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
        AlgorithmProblem algorithmProblem = new AlgorithmProblem();
        algorithmProblem.printAllProblem();
        DataStructureProblem dataStructureProblem = new DataStructureProblem();
        dataStructureProblem.printAllProblem();
    }

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date) + " | Java-Basic running..\n");
        runningExperiment();
    }
}
