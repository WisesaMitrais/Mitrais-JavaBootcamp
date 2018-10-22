package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class DataStructureProblem extends GeneralMethodProblem {

    private ProblemData problemData = ProblemData.getInstance();
    private ProblemModel problemModel;
    private final List<ProblemModel> arProblemList = new ArrayList();

    public DataStructureProblem(){
        injectData(problemData.getInstanceObject("AR"), arProblemList);
    }

    @Override
    public void printAllProblem() {
        printProblem(arProblemList);
    }

    @Override
    public void printAllProblem(String problemInitial) {
        switch(problemInitial){
            case "AR":
                printProblem(arProblemList);
                break;
            default: System.out.println("Problem type not found !!");
        }
    }

    @Override
    public void printTotalProblem(String problemInitial) {
        switch(problemInitial){
            case "AR":
                System.out.println(arProblemList.size());
                break;
            default: System.out.println("Problem type not found !!");
        }
    }

    private void printProblem(List<ProblemModel> problemList){
        try{
            problemModel = problemList.get(0);
            System.out.println("Problem List of " + problemModel.getProblemCategory() + " " + problemModel.getProblemType() + ":");
            for(int idx = 0; idx < problemList.size(); idx++){
                problemModel = problemList.get(idx);
                System.out.println(problemList.get(idx).getProblemID() + " - " + problemList.get(idx).getProblemName());
            }
            System.out.println();
        }catch(IndexOutOfBoundsException ex){
            System.out.println("ERROR, Array index out of bound !!");
            System.out.println("Detail: " + ex);
        }catch(ClassCastException ex){
            System.out.println("ERROR, Array index(s) is null !!");
            System.out.println("Detail: " + ex);
        }
    }

    private void injectData(Data data, List<ProblemModel> problemList){
        for(int i = 0; i < data.getTotalProblem(); i++){
            problemModel = new ProblemModel(data.getOneProblemId(i), data.getOneProblemName(i), data.getProblemType(),
                    data.getProblemCategory());
            problemList.add(problemModel);
        }
    }
}
