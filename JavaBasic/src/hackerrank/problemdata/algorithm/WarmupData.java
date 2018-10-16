package hackerrank.problemdata.algorithm;

import hackerrank.problemdata.ProblemData;

public class WarmupData implements ProblemData{

    private static final int[] PROBLEM_ID = {
        11301, 11302, 11303, 11304, 11305, 11306, 11307, 11308, 11309, 11310};
    private static final String[] PROBLEM_NAME = {
        "AL_WU_SolveMeFirst", "AL_WU_SimpleArraySum", "AL_WU_CompareTheTriplets", 
        "AL_WU_AVeryBigSum", "AL_WU_DiagonalDifference", "AL_WU_PlusMinus", 
        "AL_WU_Staircase", "AL_WU_MiniMaxSum", "AL_WU_BirthdayCakeCandles", 
        "AL_WU_TimeConversion"};
    private static final String PROBLEM_TYPE = "Warmup";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private static final int TOTAL_PROBLEM = 10;
    
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
