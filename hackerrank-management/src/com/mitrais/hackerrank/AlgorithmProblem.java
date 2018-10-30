package com.mitrais.hackerrank;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class AlgorithmProblem extends GeneralMethodProblem {

    private ProblemData problemData;
    private ProblemModel problemModel;
    private final List<List<ProblemModel>> listOfProblemLists = new ArrayList<>();
    public final List<String> INITIAL = Arrays.asList(
            "BM", "CA", "DP", "GT", "GH", "GR", "IM", "NP", "RC", "SR", "ST", "SG", "WU");
    private int index, result;
    private boolean isInjected = false;

    public AlgorithmProblem(){
        problemData = ProblemData.getInstance();
        for(int i = 0; i < INITIAL.size(); i++){
            listOfProblemLists.add(new ArrayList<>());
            injectData(problemData.getInstanceObject(INITIAL.get(i)), listOfProblemLists.get(i));
        }
        if(listOfProblemLists.size() == 13) isInjected = true;
    }

    @Override
    public int getTotalProblem() {
        try{
            result = 0;
            for(int i = 0; i < listOfProblemLists.size(); i++){
                result += listOfProblemLists.get(i).size();
            }
            return result;
        }catch(Exception ex){
            System.out.println("List of problem list not fully injected !!");
            return 99;
        }
    }

    @Override
    int getTotalProblem(String problemInitial) {
        try{
            index = INITIAL.indexOf(problemInitial);
            return listOfProblemLists.get(index).size();
        }catch(Exception ex){
            System.out.println("List of problem list not fully injected !!");
            return 99;
        }
    }

    @Override
    public List<List<ProblemModel>> getAllProblem() {
        try{
            if(isInjected ==  true) return listOfProblemLists;
            else return null;
        }catch(Exception ex){
            System.out.println("List of problem list not fully injected !!");
            return null;
        }
    }

    @Override
    public List<ProblemModel> getAllProblem(String problemInitial) {
        try{
            index = INITIAL.indexOf(problemInitial);
            return listOfProblemLists.get(index);
        }catch(Exception ex){
            System.out.println("Problem initial not found !!");
            return null;
        }
    }

    private void injectData(Data data, List<ProblemModel> problemList){
        for(int i = 0; i < data.getTotalProblem(); i++){
            problemModel = new ProblemModel(data.getOneProblemId(i), data.getOneProblemName(i), data.getProblemType(),
                    data.getTypeInitial(), data.getProblemCategory());
            problemList.add(problemModel);
        }
    }
}
