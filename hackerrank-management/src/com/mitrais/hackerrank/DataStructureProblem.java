package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class DataStructureProblem extends GeneralMethodProblem {

    private ProblemData problemData = ProblemData.getInstance();
    private ProblemModel problemModel;
    private final List<List<ProblemModel>> listOfProblemLists = new ArrayList<>();
    private final List<String> initial = Arrays.asList(
            "AV", "AR", "BT", "DS", "HP", "LL", "QU", "SC", "TE", "TR");
    private int index = 0;

    public DataStructureProblem(){
        for(int i = 0; i < initial.size(); i++){
            listOfProblemLists.add(new ArrayList<>());
            injectData(problemData.getInstanceObject(initial.get(i)), listOfProblemLists.get(i));
        }
    }

    @Override
    public void printAllProblem() {
        for(int i = 0; i < initial.size(); i++){
            printProblem(listOfProblemLists.get(i));
        }
    }

    @Override
    public void printAllProblem(String problemInitial) {
        try{
            index = initial.indexOf(problemInitial);
            printProblem(listOfProblemLists.get(index));
        }catch(Exception ex){
            System.out.println("Problem initial not found !!");
        }
    }

    @Override
    public void printTotalProblem(String problemInitial) {
        try{
            index = initial.indexOf(problemInitial);
            System.out.println(listOfProblemLists.get(index).size());
        }catch(Exception ex){
            System.out.println("Problem initial not found !!");
        }
    }

    @Override
    public List<ProblemModel> getAllProblem(String problemInitial) {
        try{
            index = initial.indexOf(problemInitial);
            return listOfProblemLists.get(index);
        }catch(Exception ex){
            System.out.println("Problem initial not found !!");
            return null;
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
