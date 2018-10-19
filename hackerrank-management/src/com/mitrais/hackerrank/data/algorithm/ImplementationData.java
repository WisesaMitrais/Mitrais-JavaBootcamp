package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ImplementationData implements Data {

    private static final List<Integer> PROBLEM_ID =
            Arrays.asList(10201, 10202, 10203);
    private static final List<String> PROBLEM_NAME =
            Arrays.asList("AL_IM_GradingStudents", "AL_IM_AppleAndOrange", "AL_IM_Kangaroo");
    private static final String PROBLEM_TYPE = "Implementation";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private static int totalProblem = 3;

    @Override
    public int getTotalProblem() {
        return totalProblem;
    }

    @Override
    public int getOneProblemId(int idx) {
        idx = (idx >= 0 && idx < totalProblem) ? PROBLEM_ID.get(idx) : 99;
        return idx;
    }

    @Override
    public String getOneProblemName(int idx) {
        String result = (idx >= 0 && idx < totalProblem) ? PROBLEM_NAME.get(idx) : "Not Found";
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
    public void addProblem(String name) {
        PROBLEM_ID.add(PROBLEM_ID.get(totalProblem - 1) + 1);
        PROBLEM_NAME.add(name);
        totalProblem++;
    }
}
