package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class BalancedTreesData implements Data {

    private static BalancedTreesData btSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20301, 20302, 20303);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_BT_SelfBalancingTree", "DS_BT_ArrayAndSimpleQueries", "DS_BT_MedianUpdates");
    private final String PROBLEM_TYPE = "Balanced Trees";
    private final String TYPE_INITIAL = "BT";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 3;

    //Private constructor for singleton class.
    private BalancedTreesData(){
        if(btSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static BalancedTreesData getInstance() {
        if(btSingleton == null) btSingleton = new BalancedTreesData();
        return btSingleton;
    }
}
