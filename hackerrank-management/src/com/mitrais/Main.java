package com.mitrais;

import com.mitrais.hackerrank.*;
import com.mitrais.hackerrank.data.*;
import com.mitrais.hackerrank.procedure.multithreading.*;

import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.concurrent.*;
import java.util.stream.*;

interface Consumer<T> {
    void accept(T t);
}

interface Function<T, R>{
    R apply(T t);
}

class Java8ProcessWithoutThread {

    private AlgorithmProblem algorithmProblem = new AlgorithmProblem();
    private DataStructureProblem dataStructureProblem = new DataStructureProblem();
    private List<List<ProblemModel>> listOfProblemLists = new ArrayList<>();
    private List<ProblemModel> problemList = new ArrayList<>();
    private ProblemModel problemModel = null;
    private ImplementJava8 implementJava8 = new ImplementJava8();
    private int idxInitial = -1;

    public void setProblemCategory(int category){
        if(category == 1) listOfProblemLists = algorithmProblem.getAllProblem();
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
    private class ImplementJava8 {

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
                if(algorithmProblem.INITIAL.contains(initial) == true){
                    temp = algorithmProblem.INITIAL.indexOf(initial);
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
                    ex.printStackTrace();
                }
            };
            pSP.accept(name);
        }
    }
}

class AlgorithmProblemWithThread implements Runnable {

    private AlgorithmProblem algorithmProblem = new AlgorithmProblem();
    private List<List<ProblemModel>> listOfALProblemLists = new ArrayList<>();
    private List<ProblemModel> problemList = new ArrayList<>();
    private ProblemModel problemModel = null;
    private Thread algorithmThread;

    public void start(){
        algorithmThread = new Thread(this);
        algorithmThread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread Testing.");
        listOfALProblemLists = algorithmProblem.getAllProblem();
        printAllProblem(listOfALProblemLists);
    }

    private void printAllProblem(List<List<ProblemModel>> listOfProblemLists){
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
                        algorithmThread.sleep(1500);
                    }
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
        };
        pAP.accept(listOfProblemLists);
    }
}

class DataStructureProblemWithThread implements Runnable {

    private DataStructureProblem dataStructureProblem = new DataStructureProblem();
    private List<List<ProblemModel>> listOfDSProblemLists = new ArrayList<>();
    private List<ProblemModel> problemList = new ArrayList<>();
    private ProblemModel problemModel = null;
    private Thread dataStructureThread;

    public void start(){
        dataStructureThread = new Thread(this);
        dataStructureThread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread Testing.");
        listOfDSProblemLists = dataStructureProblem.getAllProblem();
        printAllProblem(listOfDSProblemLists);

    }

    private void printAllProblem(List<List<ProblemModel>> listOfProblemLists){
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
                        dataStructureThread.sleep(1000);
                    }
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
        };
        pAP.accept(listOfProblemLists);
    }
}

public class Main {

    public static Date date = new Date();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static Java8ProcessWithoutThread java8ProcessWithoutThread = new Java8ProcessWithoutThread();
    public static AlgorithmProblemWithThread alThread = new AlgorithmProblemWithThread();
    public static DataStructureProblemWithThread dsThread = new DataStructureProblemWithThread();
    public static ExecutorService taskList;
    public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
    public static SimpleCalculationForkJoin simpleCalculationForkJoin;
    public static Database database = new Database();

    public static void main(String[] args) throws SQLException, Exception{
        System.out.println(dateFormat.format(date) + " | Java-Basic running..");
        runningExperiment();
    }

    //Logic begin here.
    public static void runningExperiment() throws SQLException, Exception{
//        java8Experiment();
//        multithreadExperiment();
//        forkJoinExperiment();
        databaseExperiment();
    }

    public static void java8Experiment(){
        java8ProcessWithoutThread.setProblemCategory(1);
        java8ProcessWithoutThread.callPrintAllProblem();
        java8ProcessWithoutThread.callPrintAllProblem("WU");
        java8ProcessWithoutThread.callPrintSingleProblem("WU", "AL_WU_MiniMaxSum");
        java8ProcessWithoutThread.setProblemCategory(2);
        java8ProcessWithoutThread.callPrintAllProblem();
        java8ProcessWithoutThread.callPrintAllProblem("AR");
        java8ProcessWithoutThread.callPrintSingleProblem("AR", "DS_AR_LeftRotation");
    }

    public static void multithreadExperiment(){
        int poolSize = 2; //Number of simultaneous threads.
        taskList = Executors.newFixedThreadPool(poolSize);
        taskList.execute(() -> alThread.start());
        taskList.execute(() -> dsThread.start());
    }

    public static void forkJoinExperiment(){
        simpleCalculationForkJoin = new SimpleCalculationForkJoin(1, 100);
        System.out.println(FORK_JOIN_POOL.invoke(simpleCalculationForkJoin));
    }

    public static void databaseExperiment() throws SQLException, Exception{
        database.showAllTables();
    }
}
