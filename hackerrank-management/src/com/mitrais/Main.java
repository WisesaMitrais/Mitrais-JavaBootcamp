package com.mitrais;

import com.mitrais.hackerrank.*;
import com.mitrais.hackerrank.data.algorithm.StringsData;
import com.mitrais.hackerrank.solution.algorithm.warmup.*;
import com.mitrais.hackerrank.solution.algorithm.implementation.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import com.mitrais.hackerrank.solution.datastructure.arrays.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;

interface Consumer<T> {
    void accept(T t);
}

interface Function<T, R>{
    R apply(T t);
}

class Java8Process {

//    private AlgorithmProblem algorithmProblem = new AlgorithmProblem();
    private DataStructureProblem dataStructureProblem = new DataStructureProblem();
    private List<List<ProblemModel>> listOfProblemLists = new ArrayList<>();
    private List<ProblemModel> problemList = new ArrayList<>();
    private ProblemModel problemModel = null;
    private ImplementJava8 implementJava8 = new ImplementJava8();
    private int idxInitial = -1;

    public void setProblemCategory(int category){
        if(category == 1) listOfProblemLists = dataStructureProblem.getAllProblem(); //its should be algorithmProblem.
        else if(category == 2) listOfProblemLists = dataStructureProblem.getAllProblem();
        else System.out.println("Category not found !!");
    }

    public void callPrintAllProblem(){
        implementJava8.printAllProblem();
    }

    public void callPrintAllProblem(String initial){
        implementJava8.printAllProblem(initial);
    }

    public void callPrintSingleProblem(String initial, String name){
        implementJava8.printSingleProblem(initial, name);
    }

    //Inner class for lambda expression feature and stream api.
    private class ImplementJava8{

        private void printAllProblem(){
            Consumer<List<List<ProblemModel>>> pAP = (lopl) -> {
                System.out.println("### Problem in " + lopl.get(0).get(0).getProblemCategory() + " ###");
                try {
                    for(int i = 0; i < lopl.size(); i++){
                        problemList = lopl.get(i);
                        System.out.println("(" + (i+1) + ") " + problemList.get(0).getProblemType() + ":");
                        for(int j = 0; j < problemList.size(); j++){
                            problemModel = problemList.get(j);
                            System.out.println((j+1) + " | " + problemModel.getProblemID() +
                                    " | " + problemModel.getProblemName());
                        }
                        System.out.println();
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            };
            pAP.accept(listOfProblemLists);
        }

        private int getIdxInitial(String initial){
            int result;
            Function<String, Integer> gII = (init) -> {
                int temp;
                if(dataStructureProblem.INITIAL.contains(initial) == true){ //its should be algorithmProblem.
                    temp = dataStructureProblem.INITIAL.indexOf(initial); //its should be algorithmProblem.
                }else{
                    temp = dataStructureProblem.INITIAL.indexOf(initial);
                }
                return temp;
            };
            result = gII.apply(initial);
            return result;
        }

        private void printAllProblem(String initial){
            Consumer<String> pAP = (init) -> {
                try {
                    idxInitial = getIdxInitial(initial);
                    problemList = listOfProblemLists.get(idxInitial);
                    System.out.println("Problem List of " + problemList.get(0).getProblemType() + ":");
                    for(int i = 0; i < problemList.size(); i++){
                        problemModel = problemList.get(i);
                        System.out.println((i+1) + " | " + problemModel.getProblemID() +
                                " | " + problemModel.getProblemName());
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            };
            pAP.accept(initial);
        }

        private void printSingleProblem(String initial, String name){
            idxInitial = getIdxInitial(initial);
            Consumer<String> pSP = (init) -> {
                try {
                    problemList = listOfProblemLists.get(idxInitial);
                    List<ProblemModel> result = problemList.stream()
                            .filter(problem -> problem.getProblemName() == name)
                            .collect(Collectors.toList());
                    System.out.println("The Problem Result with Name '" + name + "':");
                    for(int i = 0; i < result.size(); i++){
                        System.out.println((i+1) + " | " + result.get(i).getProblemID() +
                                " | " + result.get(i).getProblemName() +
                                " | " + result.get(i).getProblemType() +
                                " | " + result.get(i).getTypeInitial() +
                                " | " + result.get(i).getProblemCategory());
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            };
            pSP.accept(name);
        }
    }
}

public class Main {

    //Logic begin here.
    public static void runningExperiment(){
        Java8Process java8Process = new Java8Process();
        java8Process.setProblemCategory(2);
        java8Process.callPrintAllProblem();
    }

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date) + " | Java-Basic running..\n");
        runningExperiment();
    }
}
