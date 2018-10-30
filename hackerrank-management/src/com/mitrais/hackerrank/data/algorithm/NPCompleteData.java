package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class NPCompleteData implements Data {

    private static NPCompleteData npSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10801, 10802, 10803, 10804);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_NP_SamsPuzzle(Approximate)", "AL_NP_SpiesRevised", "AL_NP_TBSProblem",
            "AL_NP_WalkingTheApproximateLongestPath");
    private final String PROBLEM_TYPE = "NP Complete";
    private final String TYPE_INITIAL = "NP";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 4;

    //Private constructor for singleton class.
    private NPCompleteData(){
        if(npSingleton != null) throw new IllegalStateException("Singleton already created !!");
    }

    @Override
    public int getTotalProblem() {
        return TOTAL_PROBLEM;
    }

    @Override
    public int getOneProblemId(int idx) {
        idx = (idx >= 0 && idx < TOTAL_PROBLEM) ? PROBLEM_ID.get(idx) : 99;
        return idx;
    }

    @Override
    public String getOneProblemName(int idx) {
        String result = (idx >= 0 && idx < TOTAL_PROBLEM) ? PROBLEM_NAME.get(idx) : "Not Found";
        return result;
    }

    @Override
    public String getProblemType() {
        return PROBLEM_TYPE;
    }

    @Override
    public String getTypeInitial() {
        return TYPE_INITIAL;
    }

    @Override
    public String getProblemCategory() {
        return PROBLEM_CATEGORY;
    }

    public static NPCompleteData getInstance() {
        if(npSingleton == null) npSingleton = new NPCompleteData();
        return npSingleton;
    }
}
