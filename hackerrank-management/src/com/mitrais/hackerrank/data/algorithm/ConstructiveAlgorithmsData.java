package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ConstructiveAlgorithmsData implements Data {

    private static ConstructiveAlgorithmsData caSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            11301);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "");
    private final String PROBLEM_TYPE = "";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 0;

    //Private constructor for singleton class.
    private ConstructiveAlgorithmsData(){
        if(caSingleton != null) throw new IllegalStateException("Singleton already created !!");
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
    public String getProblemCategory() {
        return PROBLEM_CATEGORY;
    }

    public static ConstructiveAlgorithmsData getInstance() {
        if(caSingleton == null) caSingleton = new ConstructiveAlgorithmsData();
        return caSingleton;
    }
}
