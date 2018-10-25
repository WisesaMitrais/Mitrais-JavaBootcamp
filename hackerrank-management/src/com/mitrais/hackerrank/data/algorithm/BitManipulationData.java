package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class BitManipulationData implements Data {

    private static BitManipulationData bmSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10101, 10102, 10103, 10104, 10105, 10106, 10107, 10108, 10109, 10110,
            10111, 10112, 10113, 10114, 10115, 10116, 10117, 10118, 10119, 10120,
            10121, 10122, 10123, 10124, 10125, 10126);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_BM_2sComplement", "AL_BM_ANDProduct", "AL_BM_AOrB",
            "AL_BM_ChangingBits", "AL_BM_Cipher", "AL_BM_CounterGame",
            "AL_BM_FlippingBits", "AL_BM_HammingDistance", "AL_BM_IterateIt",
            "AL_BM_LonelyInteger", "AL_BM_ManipulativeNumbers", "AL_BM_MaximizingTheFunction",
            "AL_BM_MaximizingXOR", "AL_BM_MixingProteins", "AL_BM_SansaAndXOR",
            "AL_BM_StoneGame", "AL_BM_StringTransmission", "AL_BM_SumVSXOR",
            "AL_BM_TheGreatXOR", "AL_BM_WhatsNext", "AL_BM_XoringNinja",
            "AL_BM_XORKey", "AL_BM_XORMatrix", "AL_BM_XorSequence",
            "AL_BM_XORSubsequences", "AL_BM_YetAnotherMinimaxProblem");
    private final String PROBLEM_TYPE = "Bit Manipulation";
    private final String TYPE_INITIAL = "BM";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 26;

    //Private constructor for singleton class.
    private BitManipulationData(){
        if(bmSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static BitManipulationData getInstance() {
        if(bmSingleton == null) bmSingleton = new BitManipulationData();
        return bmSingleton;
    }
}
