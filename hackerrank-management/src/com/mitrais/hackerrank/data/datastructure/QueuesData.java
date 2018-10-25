package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class QueuesData implements Data {

    private static QueuesData quSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20701, 20702, 20703, 20704, 20705);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_QU_QueueUsingTwoStacks", "DS_QU_CastleOnTheGrid", "DS_QU_DownToZeroII",
            "DS_QU_TruckTour", "DS_QU_QueriesWithFixedLength");
    private final String PROBLEM_TYPE = "Queues";
    private final String TYPE_INITIAL = "QU";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 5;

    //Private constructor for singleton class.
    private QueuesData(){
        if(quSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static QueuesData getInstance() {
        if(quSingleton == null) quSingleton = new QueuesData();
        return quSingleton;
    }
}
