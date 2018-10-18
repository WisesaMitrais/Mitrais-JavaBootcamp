package hackerrank.problemdata.datastructure;

import hackerrank.problemdata.ProblemData;

public class ArraysData implements ProblemData {
    
    private static final int[] PROBLEM_ID = {
        20201, 20202, 20203, 20204, 20205, 20206};
    private static final String[] PROBLEM_NAME = {
        "DS_AR_ArrayDS", "DS_AR_2DArrayDS", "DS_AR_DynamicArray", 
        "DS_AR_LeftRotation", "DS_AR_SparseArrays", "DS_AR_ArrayManipulation"};
    private static final String PROBLEM_TYPE = "Arrays";
    private static final String PROBLEM_CATEGORY = "Data Structure";
    private static final int TOTAL_PROBLEM = 6;

    @Override
    public int getOneProblemId(int index) {
        index = (index >= 0 && index < TOTAL_PROBLEM) ? PROBLEM_ID[index] : 99;
        return index;
    }

    @Override
    public String getOneProblemName(int index) {
        String result = (index >= 0 && index < TOTAL_PROBLEM) ? PROBLEM_NAME[index] : "Not Found";
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
    public int getTotalProblem() {
        return TOTAL_PROBLEM;
    }
}
