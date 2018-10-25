package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class LinkedListsData implements Data {

    private static LinkedListsData llSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20601, 20602, 20603, 20604, 20605, 20606, 20607, 20608, 20609, 20610,
            20611, 20612, 20613, 20614, 20615);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_LL_PrintTheElementsOfALinkedList", "DS_LL_InsertANodeAtTheTailOfALinkedList", "DS_LL_InsertANodeAtTheHeadOfALinkedList",
            "DS_LL_InsertANodeAtASpesificPositionInALinkedList", "DS_LL_DeleteANode", "DS_LL_PrintInReverse",
            "DS_LL_ReverseALinkedList", "DS_LL_CompareTwoLinkedLists", "DS_LL_MergeTwoSortedLinkedLists",
            "DS_LL_GetNodeValue", "DS_LL_DeleteDuplicateValueNodesFromASortedLinkedList", "DS_LL_CycleDetection",
            "DS_LL_FindMergePointOfTwoLists", "DS_LL_InsertingANodeIntoASortedDoublyLinkedList", "DS_LL_ReverseADoublyLinkedList");
    private final String PROBLEM_TYPE = "Linked Lists";
    private final String TYPE_INITIAL = "LL";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 15;

    //Private constructor for singleton class.
    private LinkedListsData(){
        if(llSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static LinkedListsData getInstance() {
        if(llSingleton == null) llSingleton = new LinkedListsData();
        return llSingleton;
    }
}
