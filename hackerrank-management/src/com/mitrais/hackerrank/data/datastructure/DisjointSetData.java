package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class DisjointSetData implements Data {

    private static DisjointSetData dsSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20401, 20402, 20403, 20404);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_DS_MergingCommunities", "DS_DS_ComponentsInAGraph", "DS_DS_KunduAndTree",
            "DS_DS_SuperMaximumCostQueries");
    private final String PROBLEM_TYPE = "Disjoint Set";
    private final String TYPE_INITIAL = "DS";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 4;

    //Private constructor for singleton class.
    private DisjointSetData(){
        if(dsSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static DisjointSetData getInstance() {
        if(dsSingleton == null) dsSingleton = new DisjointSetData();
        return dsSingleton;
    }
}
