package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class StacksData implements Data {

    private static StacksData scSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20801, 20802, 20803, 20804, 20805, 20806, 20807, 20808, 20809);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_SC_MaximumElement", "DS_SC_BalancedBrackets", "DS_SC_EqualStacks",
            "DS_SC_GameOfTwoStacks", "DS_SC_LargestRectangle", "DS_SC_SimpleTextEditor",
            "DS_SC_PoisonousPlants", "DS_SC_ANDXOROR", "DS_SC_Waiter");
    private final String PROBLEM_TYPE = "Stacks";
    private final String TYPE_INITIAL = "SC";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 9;

    //Private constructor for singleton class.
    private StacksData(){
        if(scSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static StacksData getInstance() {
        if(scSingleton == null) scSingleton = new StacksData();
        return scSingleton;
    }
}
