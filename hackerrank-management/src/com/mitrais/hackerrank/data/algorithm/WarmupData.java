package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class WarmupData implements Data {

    private static WarmupData wuSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            11301, 11302, 11303, 11304, 11305, 11306, 11307, 11308, 11309, 11310);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_WU_SolveMeFirst", "AL_WU_SimpleArraySum", "AL_WU_CompareTheTriplets",
            "AL_WU_AVeryBigSum", "AL_WU_DiagonalDifference", "AL_WU_PlusMinus",
            "AL_WU_Staircase", "AL_WU_MiniMaxSum", "AL_WU_TimeConversion",
            "AL_WU_BirthdayCakeCandles");
    private final String PROBLEM_TYPE = "Warmup";
    private final String TYPE_INITIAL = "WU";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 10;

    //Private constructor for singleton class.
    private WarmupData(){
        if(wuSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static WarmupData getInstance() {
        if(wuSingleton == null) wuSingleton = new WarmupData();
        return wuSingleton;
    }
}
