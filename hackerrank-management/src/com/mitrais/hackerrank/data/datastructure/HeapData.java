package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class HeapData implements Data {

    private static HeapData hpSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20501, 20502, 20503, 20504);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_HP_QHEAP1", "DS_HP_JesseAndCookies", "DS_HP_FindTheRunningMedian",
            "DS_HP_MinimumAverageWaitingTime");
    private final String PROBLEM_TYPE = "Heap";
    private final String TYPE_INITIAL = "HP";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 4;

    //Private constructor for singleton class.
    private HeapData(){
        if(hpSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static Data getInstance() {
        if(hpSingleton == null) hpSingleton = new HeapData();
        return hpSingleton;
    }
}