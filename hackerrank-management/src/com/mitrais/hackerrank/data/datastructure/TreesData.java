package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class TreesData implements Data {

    private static TreesData teSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20901, 20902, 20903, 20904, 20905, 20906, 20907, 20908, 20909, 20910,
            20911, 20912, 20913, 20914, 20915, 20916, 20917);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_TE_Tree(PreorderTraversal)", "DS_TE_Tree(PostorderTraversal)", "DS_TE_Tree(InorderTraversal)",
            "DS_TE_Tree(HeightOfABinaryTree)", "DS_TE_Tree(TopView)", "DS_TE_Tree(LevelOrderTraversal)",
            "DS_TE_BinarySearchTree(Insertion)", "DS_TE_Tree(HuffmanDecoding)", "DS_TE_BinarySearchTree(LowestCommonAncestor)",
            "DS_TE_SwapNodes(Algo)", "DS_TE_KittysCalculationsOnATree", "DS_TE_IsThisABinarySearchTree",
            "DS_TE_SquareTenTree", "DS_TE_BalancedForest", "DS_TE_JennysSubtrees",
            "DS_TE_TreeCoordinates", "DS_TE_ArrayPairs");
    private final String PROBLEM_TYPE = "Trees";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 17;

    //Private constructor for singleton class.
    private TreesData(){
        if(teSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static TreesData getInstance() {
        if(teSingleton == null) teSingleton = new TreesData();
        return teSingleton;
    }
}
