package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ImplementationData implements Data {

    private static ImplementationData imSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10201, 10202, 10203);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_IM_GradingStudents", "AL_IM_AppleAndOrange", "AL_IM_Kangaroo");
    private final String PROBLEM_TYPE = "Implementation";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 3;

    //Private constructor for singleton class.
    private ImplementationData(){
        if(imSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static ImplementationData getInstance() {
        if(imSingleton == null) imSingleton = new ImplementationData();
        return imSingleton;
    }
}
