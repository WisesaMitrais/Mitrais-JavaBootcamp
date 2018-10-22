package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class AlgorithmProblem extends GeneralMethodProblem {

    private ProblemData problemData = ProblemData.getInstance();
    private ProblemModel problemModel;
    private final List<ProblemModel> wuProblemList = new ArrayList();
    private final List<ProblemModel> imProblemList = new ArrayList();

    public AlgorithmProblem(){
        injectData(problemData.getInstanceObject("WU"), wuProblemList);
        injectData(problemData.getInstanceObject("IM"), imProblemList);
    }

    @Override
    public void printAllProblem() {
        printProblem(wuProblemList);
        printProblem(imProblemList);
    }

    @Override
    public void printAllProblem(String problemInitial) {
        switch(problemInitial){
            case "WU":
                printProblem(wuProblemList);
                break;
            case "IM":
                printProblem(imProblemList);
                break;
            default: System.out.println("Problem type not found !!");
        }
    }

    @Override
    public void printTotalProblem(String problemInitial) {
        switch(problemInitial){
            case "WU":
                System.out.println(wuProblemList.size());
                break;
            case "IM":
                System.out.println(imProblemList.size());
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
