package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class GreedyData implements Data {

    private static GreedyData grSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10601, 10602, 10603, 10604, 10605, 10606, 10607, 10608, 10609, 10610,
            10611, 10612, 10613, 10614, 10615, 10616, 10617, 10618, 10619, 10620,
            10621, 10622);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_GR_AccessoryCollection", "AL_GR_BeautifulPairs", "AL_GR_ChiefHopper",
            "AL_GR_CuttingBoards", "AL_GR_FightingPits", "AL_GR_GoodlandElectricity",
            "AL_GR_GreedyFlorist", "AL_GR_GridChallenge", "AL_GR_JimAndTheOrders",
            "AL_GR_LargestPermutation", "AL_GR_LuckBalance", "AL_GR_MarcsCakewalk",
            "AL_GR_MarkAndToys", "AL_GR_MaximumPerimeterTriangle", "AL_GR_MaxMin",
            "AL_GR_MinimumAbsoluteDifferenceInAnArray", "AL_GR_PermutingTwoArrays", "AL_GR_PriyankaAndToys",
            "AL_GR_ReverseShuffleMerge", "AL_GR_SherlockAndMiniMax", "AL_GR_SherlockAndTheBeast",
            "AL_GR_TeamFormation");
    private final String PROBLEM_TYPE = "Greedy";
    private final String TYPE_INITIAL = "GR";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 22;

    //Private constructor for singleton class.
    private GreedyData(){
        if(grSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static GreedyData getInstance() {
        if(grSingleton == null) grSingleton = new GreedyData();
        return grSingleton;
    }
}
