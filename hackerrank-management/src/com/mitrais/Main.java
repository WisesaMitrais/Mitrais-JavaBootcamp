package com.mitrais;

import com.mitrais.hackerrank.*;
import com.mitrais.hackerrank.solution.algorithm.warmup.*;
import com.mitrais.hackerrank.solution.algorithm.implementation.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import java.text.*;
import java.util.*;

interface PrintString {
    void print(List<String> n);
}

public class Main {

    //Logic begin here.
    public static void runningExperiment(){
//        AlgorithmProblem algorithmProblem = new AlgorithmProblem();
        DataStructureProblem dataStructureProblem = new DataStructureProblem();

        List<ProblemModel> tes = dataStructureProblem.getAllProblem("AR");
        List<String> tes2 = new ArrayList<>();
        for(int i = 0; i < tes.size(); i++){
            tes2.add(tes.get(i).getProblemName());
        }
        /*Java 8*/
        Collections.sort(tes2, (s1, s2) -> s1.compareTo(s2));
        tes2.forEach(System.out::println); //Method reference
        PrintString ps = (s) -> s.forEach(System.out::println); //Lambda expression
        ps.print(tes2);
    }

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date) + " | Java-Basic running..\n");
        runningExperiment();
    }
}
