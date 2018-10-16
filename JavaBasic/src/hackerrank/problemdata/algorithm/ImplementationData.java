package hackerrank.problemdata.algorithm;

import hackerrank.problemdata.ProblemData;

public class ImplementationData implements ProblemData {
    
    private static final int[] PROBLEM_ID = {
        10201, 10202, 10203};
    private static final String[] PROBLEM_NAME = {
        "AL_IM_GradingStudents", "AL_IM_AppleAndOrange", "AL_IM_Kangaroo"};
    private static final String PROBLEM_TYPE = "Implementation";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private static final int TOTAL_PROBLEM = 3;

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
