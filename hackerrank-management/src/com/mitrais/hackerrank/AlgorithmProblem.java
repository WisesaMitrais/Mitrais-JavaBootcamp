package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.algorithm.*;
import java.util.*;

public class AlgorithmProblem extends GeneralMethodProblem {

    //Singleton class, singleton design pattern.
    private static AlgorithmProblem singletonAP = new AlgorithmProblem();

    private HackerRankProblemModel problem;
    private final List<HackerRankProblemModel> wuProblem = new ArrayList();
    private final List<HackerRankProblemModel> imProblem = new ArrayList();
    private final String[] problemType = {"Warmup", "Implementation"};
    private final WarmupData wuData = new WarmupData();
    private final ImplementationData imData = new ImplementationData();
    private int lastIdx = 0;

    private AlgorithmProblem(){
        for(int i = 0; i < wuData.getTotalProblem(); i++){
            problem = new HackerRankProblemModel(wuData.getOneProblemId(i),
                    wuData.getOneProblemName(i), wuData.getProblemType(),
                    wuData.getProblemCategory());
            wuProblem.add(problem);
        }
        for(int idx = 0; idx < imData.getTotalProblem(); idx++){
            problem = new HackerRankProblemModel(imData.getOneProblemId(idx),
                    imData.getOneProblemName(idx), imData.getProblemType(),
                    imData.getProblemCategory());
            imProblem.add(problem);
        }
    }

    @Override
    public void printAllProblem() {
        printProblem("WU", wuProblem);
        printProblem("IM", imProblem);
    }

    @Override
    public void printAllProblem(String problemInitial) {
        switch(problemInitial){
            case "WU":
                printProblem(problemType[0], wuProblem);
                break;
            case "IM":
                printProblem(problemType[1], imProblem);
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void printTotalProblem(String problemInitial) {
        switch(problemInitial){
            case "WU":
                System.out.println(wuData.getTotalProblem());
                break;
            case "IM":
                System.out.println(imData.getTotalProblem());
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void addProblem(String problemInitial, String name) {
        switch(problemInitial){
            case "WU":
                lastIdx = wuData.addProblem(name);
                problem = new HackerRankProblemModel(wuData.getOneProblemId(lastIdx - 1),
                        wuData.getOneProblemName(lastIdx - 1), wuData.getProblemType(),
                        wuData.getProblemCategory());
                wuProblem.add(problem);
                break;
            case "IM":
                imData.addProblem(name);
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    private void printProblem(String problemType, List<HackerRankProblemModel> problemList){
        try{
            System.out.println("Problem List of Algorithm " + problemType + ":");
            for(int idx = 0; idx < problemList.size(); idx++){
                problem = problemList.get(idx);
                System.out.println(problemList.get(idx).getProblemID()+" - "
                        +problemList.get(idx).getProblemName());
            }
        }catch(UnsupportedOperationException ex){
            System.out.println("Array index out of bound!");
            System.out.println("Detail: " + ex);
        }catch(ClassCastException ex){
            System.out.println("ERROR, Array index(s) is null");
            System.out.println("Detail: " + ex);
        }
    }

    public static AlgorithmProblem getSingletonAP(){
        return singletonAP;
    }
}
