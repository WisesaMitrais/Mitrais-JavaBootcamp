package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ArraysData implements Data {

    private static ArraysData arSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20201, 20202, 20203, 20204, 20205, 20206);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_AR_ArrayDS", "DS_AR_2DArrayDS", "DS_AR_DynamicArray",
            "DS_AR_LeftRotation", "DS_AR_SparseArrays", "DS_AR_ArrayManipulation");
    private final String PROBLEM_TYPE = "Arrays";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 6;

    //Private constructor for singleton class.
    private ArraysData(){
        if(arSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static ArraysData getInstance() {
        if(arSingleton == null) arSingleton = new ArraysData();
        return arSingleton;
    }
}
