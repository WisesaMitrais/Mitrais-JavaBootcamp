package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ArraysData implements Data {

    private static final List<Integer> problemId =
            Arrays.asList(20201, 20202, 20203, 20204, 20205, 20206);
    private static final List<String> problemName =
            Arrays.asList("DS_AR_ArrayDS", "DS_AR_2DArrayDS", "DS_AR_DynamicArray",
                    "DS_AR_LeftRotation", "DS_AR_SparseArrays", "DS_AR_ArrayManipulation");
    private static final String PROBLEM_TYPE = "Arrays";
    private static final String PROBLEM_CATEGORY = "Data Structure";
    private static int totalProblem = 6;
    private List<ArraysData> newArrayData;

    public ArraysData(){
        newArrayData = new ArrayList<ArraysData>();
    }

    @Override
    public int getTotalProblem() {
        return totalProblem;
    }

    @Override
    public int getOneProblemId(int idx) {
        idx = (idx >= 0 && idx < totalProblem) ? problemId.get(idx) : 99;
        return idx;
    }

    @Override
    public String getOneProblemName(int idx) {
        String result = (idx >= 0 && idx < totalProblem) ? problemName.get(idx) : "Not Found";
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
    public int addProblem(String name) {
        problemId.add(problemId.get(totalProblem - 1) + 1);
        problemName.add(name);
        totalProblem++;
        return totalProblem;
    }

    public void addArrayList(ArraysData arData) {
        newArrayData.add(arData);
    }

    public void remove(ArraysData arData) {
        newArrayData.remove(arData);
    }

    public List<ArraysData> getNewArrayData(){
        return newArrayData;
    }
}
