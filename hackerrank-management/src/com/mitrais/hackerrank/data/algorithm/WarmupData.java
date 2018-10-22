package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;

import java.util.*;

public class WarmupData implements Data {

    private List<Integer> problemId = new ArrayList<>();
    private List<String> problemName = new ArrayList<>();
    private static final String PROBLEM_TYPE = "Warmup";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private int totalProblem = 10;
    private static int lastIdx = 0;

    public WarmupData(){
        int id = 11301;
        while(id <= 11310){
            problemId.add(id);
            id++;
        }
        problemName.add("AL_WU_SolveMeFirst"); problemName.add("AL_WU_SimpleArraySum");
        problemName.add("AL_WU_CompareTheTriplets"); problemName.add("AL_WU_AVeryBigSum");
        problemName.add("AL_WU_DiagonalDifference"); problemName.add("AL_WU_PlusMinus");
        problemName.add("AL_WU_Staircase"); problemName.add("AL_WU_MiniMaxSum");
        problemName.add("AL_WU_TimeConversion"); problemName.add("AL_WU_BirthdayCakeCandles");
    }

    @Override
    public int getTotalProblem() {
        return totalProblem;
    }

    @Override
    public int getOneProblemId(int idx) {
        idx = (idx >= 0 && idx < totalProblem) ? problemId.get(idx) : 99;
        return idx;
    }

    @Override
    public String getOneProblemName(int idx) {
        String result = (idx >= 0 && idx < totalProblem) ? problemName.get(idx) : "Not Found";
        return result;
    }

    @Override
    public String getProblemType() {
        return PROBLEM_TYPE;
    }

    @Override
    public String getProblemCategory() {
        return PROBLEM_CATEGORY;
    }

    @Override
    public int addProblem(String name) {
        lastIdx = problemId.get(totalProblem - 1);
        problemId.add(lastIdx);
        problemName.add(name);
        totalProblem++;
        return totalProblem;
    }
}
