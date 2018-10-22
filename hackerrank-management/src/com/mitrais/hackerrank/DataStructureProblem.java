package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.datastructure.*;
import java.util.*;

public class DataStructureProblem extends GeneralMethodProblem {

    private HackerRankProblemModel problem;
    private final List<HackerRankProblemModel> arProblem = new ArrayList();
    private final String[] problemType = {"Arrays"};
    private final ArraysData arData = new ArraysData();

    public DataStructureProblem(){
        for(int i = 0; i < arData.getTotalProblem(); i++){
            problem = new HackerRankProblemModel(arData.getOneProblemId(i),
                    arData.getOneProblemName(i), arData.getProblemType(), arData.getProblemCategory());
            arProblem.add(problem);
        }
    }

    @Override
    public void printAllProblem() {
        printProblem("AR", arProblem);
    }

    @Override
    public void printAllProblem(String problemInitial) {
        switch(problemInitial){
            case "AR":
                printProblem(problemType[0], arProblem);
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void printTotalProblem(String problemInitial) {
        switch(problemInitial){
            case "AR":
                System.out.println(arData.getTotalProblem());
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void addProblem(String problemInitial, String name) {
        switch(problemInitial){
            case "AR":
                arData.addProblem(name);
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
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ERROR, Array index out of bound!");
        }catch(NullPointerException ex){
            System.out.println("ERROR, Array index(s) is null");
        }
    }
}
