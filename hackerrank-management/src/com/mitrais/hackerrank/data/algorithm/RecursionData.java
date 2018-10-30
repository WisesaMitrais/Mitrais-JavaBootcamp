package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class RecursionData implements Data {

    private static RecursionData rcSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10901, 10902, 10903, 10904, 10905, 10906, 10907, 10908, 10909, 10910,
            10911);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_RC_ArithmeticExpressions", "AL_RC_BowlingPins", "AL_RC_CrosswordPuzzle",
            "AL_RC_KFactorization", "AL_RC_PasswordCracker", "AL_RC_RecursiveDigitSum",
            "AL_RC_RepetitiveKSums", "AL_RC_SimplifiedChessEngine", "AL_RC_SimplifiedChessEngineII",
            "AL_RC_StoneDivision(Revisited)", "AL_RC_ThePowerSum");
    private final String PROBLEM_TYPE = "Recursion";
    private final String TYPE_INITIAL = "RC";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 11;

    //Private constructor for singleton class.
    private RecursionData(){
        if(rcSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static RecursionData getInstance() {
        if(rcSingleton == null) rcSingleton = new RecursionData();
        return rcSingleton;
    }
}
