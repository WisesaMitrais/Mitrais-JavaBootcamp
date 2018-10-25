package com.mitrais.hackerrank.data.datastructure;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class AdvancedData implements Data {

    private static AdvancedData avSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            20101, 20102, 20103, 20104, 20105, 20106, 20107, 20108, 20109, 20110,
            20111, 20112, 20113, 20114, 20115, 20116, 20117, 20118, 20119, 20120,
            20121, 20122, 20123, 20124, 20125, 20126, 20127, 20128, 20129, 20130,
            20131, 20132, 20133, 20134, 20135, 20136, 20137, 20138, 20139, 20140,
            20141, 20142, 20143, 20144, 20145, 20146, 20147, 20148, 20149, 20150,
            20151, 20152, 20153);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "DS_AV_KindergartenAdventures", "DS_AV_CubeSummation", "DS_AV_MrXAndHisShots",
            "DS_AV_DirectConnections", "DS_AV_SubsequenceWeighting", "DS_AV_JimAndTheSkyscrapers",
            "DS_AV_PalindromicSubsets", "DS_AV_CountingOnATree", "DS_AV_PolynomialDivision",
            "DS_AV_CostlyIntervals", "DS_AV_TheStrangeFunction", "DS_AV_SelfDrivingBus",
            "DS_AV_UniqueColors", "DS_AV_FibonacciNumbersTree", "DS_AV_PairSums",
            "DS_AV_FunctionalPalindromes", "DS_AV_LazyWhiteFalcon", "DS_AV_TicketToRide",
            "DS_AV_HeavyLightWhiteFalcon", "DS_AV_SumOfTheMaximums", "DS_AV_NumberGameOnATree",
            "DS_AV_HeavyLight2WhiteFalcon", "DS_AV_LibraryQuery", "DS_AV_Starfleet",
            "DS_AV_AlmostEqualAdvanced", "DS_AV_AlmostSortedInterval", "DS_AV_BurgerHappiness",
            "DS_AV_RoyAndAlphaBetaTrees", "DS_AV_ColoringTree", "DS_AV_RecallingEarlyDaysGPWithTrees",
            "DS_AV_SwapsAndSum", "DS_AV_ArithmeticProgressions", "DS_AV_CoolguyAndTwoSubsequences",
            "DS_AV_WhiteFalconAndTree", "DS_AV_SubstreesAndPaths", "DS_AV_Triplets",
            "DS_AV_BeautifulSegments", "DS_AV_Divisibility", "DS_AV_BSTMaintenance",
            "DS_AV_FindMaximumIndexProduct", "DS_AV_TaxicabDriversProblem", "DS_AV_JagguPlayingWithBalloons",
            "DS_AV_DynamicSummation", "DS_AV_TwoArrayProblem", "DS_AV_RootedTree",
            "DS_AV_TheCrazyHelix", "DS_AV_NetworkAdministration", "DS_AV_EasyAddition",
            "DS_AV_FindThePermutation", "DS_AV_CompanyRetreat", "DS_AV_BoxOperations",
            "DS_AV_MaxTransform", "DS_AV_ArrayAndQueries");
    private final String PROBLEM_TYPE = "Advanced";
    private final String TYPE_INITIAL = "AV";
    private final String PROBLEM_CATEGORY = "Data Structure";
    private final int TOTAL_PROBLEM = 53;

    //Private constructor for singleton class.
    private AdvancedData(){
        if(avSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static AdvancedData getInstance() {
        if(avSingleton == null) avSingleton = new AdvancedData();
        return avSingleton;
    }
}
