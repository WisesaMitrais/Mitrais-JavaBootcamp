package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ConstructiveAlgorithmsData implements Data {

    private static ConstructiveAlgorithmsData caSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10201, 10202, 10203, 10204, 10205, 10206, 10207, 10208, 10209, 10210,
            10211);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_CA_ArrayConstruction", "AL_CA_Beautiful3Set", "AL_CA_Bonetrousle",
            "AL_CA_FlippingTheMatrix", "AL_CA_GamingArray", "AL_CA_InverseRMQ",
            "AL_CA_LenaSort", "AL_CA_LovelyTriplets", "AL_CA_NewYearChaos",
            "AL_CA_TwoSubarrays", "AL_CA_YetAnotherKMPProblem");
    private final String PROBLEM_TYPE = "Constructive Algorithms";
    private final String TYPE_INITIAL = "CA";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 11;

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
    public String getTypeInitial() {
        return TYPE_INITIAL;
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
