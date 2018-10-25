package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class TrieData implements Data {

    private static TrieData trSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            21001, 21002);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_TR_Contacts", "DS_TR_NoPrefixSet");
    private final String PROBLEM_TYPE = "Trie";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final String TYPE_INITIAL = "TR";
    private final int TOTAL_PROBLEM = 2;

    //Private constructor for singleton class.
    private TrieData(){
        if(trSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static TrieData getInstance() {
        if(trSingleton == null) trSingleton = new TrieData();
        return trSingleton;
    }
}
