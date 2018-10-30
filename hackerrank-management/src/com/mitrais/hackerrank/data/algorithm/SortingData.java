package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class SortingData implements Data {

    private static SortingData stSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            11101, 11102, 11103, 11104, 11105, 11106, 11107, 11108, 11109, 11110,
            11111, 11112, 11113, 11114, 11115);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_ST_BigSorting", "AL_ST_ClosestNumbers", "AL_ST_CorrectnessAndTheLoopInvariant",
            "AL_ST_CountingSort1", "AL_ST_CountingSort2", "AL_ST_FindTheMedian",
            "AL_ST_FraudulentActivityNotifications", "AL_ST_InsertionSortAdvancedAnalysis", "AL_ST_InsertionSortPart1",
            "AL_ST_InsertionSortPart2", "AL_ST_IntroToTutorialChallenges", "AL_ST_LilysHomework",
            "AL_ST_Quicksort1Partition", "AL_ST_RunningTimeOfAlgorithms", "AL_ST_TheFullCountingSort");
    private final String PROBLEM_TYPE = "Sorting";
    private final String TYPE_INITIAL = "ST";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 15;

    //Private constructor for singleton class.
    private SortingData(){
        if(stSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static SortingData getInstance() {
        if(stSingleton == null) stSingleton = new SortingData();
        return stSingleton;
    }
}
