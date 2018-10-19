package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;

import java.util.*;

public class WarmupData implements Data {

    private static List<Integer> problemId =
            Arrays.asList(11301, 11302, 11303, 11304, 11305, 11306, 11307, 11308, 11309, 11310);
    private static List<Integer> tes = new ArrayList();
    private static List<String> problemName =
            Arrays.asList("AL_WU_SolveMeFirst", "AL_WU_SimpleArraySum", "AL_WU_CompareTheTriplets",
                    "AL_WU_AVeryBigSum", "AL_WU_DiagonalDifference", "AL_WU_PlusMinus",
                    "AL_WU_Staircase", "AL_WU_MiniMaxSum", "AL_WU_BirthdayCakeCandles",
                    "AL_WU_TimeConversion");
    private static final String PROBLEM_TYPE = "Warmup";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private static int totalProblem = 10;
    private static int lastIdx = 0;

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
    public void addProblem(String name) {
        lastIdx = problemId.get(totalProblem - 1);
        //problemId.add(lastIdx);
        tes.add(lastIdx);
        System.out.println(tes);
//        System.out.println(problemId.);
//        problemId.add(problemId.get(totalProblem - 1) + 1);
//        problemName.add(name);
//        totalProblem++;
    }
}
