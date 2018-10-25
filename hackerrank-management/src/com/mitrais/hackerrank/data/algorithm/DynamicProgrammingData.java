package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class DynamicProgrammingData implements Data {

    private static DynamicProgrammingData dpSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10301, 10302, 10303, 10304, 10305, 10306, 10307, 10308, 10309, 10310,
            10311, 10312, 10313, 10314, 10315, 10316, 10317, 10318, 10319, 10320,
            10321, 10322, 10323, 10324, 10325, 10326, 10327, 10328, 10329, 10330,
            10331, 10332, 10333, 10334, 10335, 10336, 10337, 10338, 10339, 10340,
            10341, 10342, 10343, 10344, 10345, 10346, 10347, 10348, 10349, 10350,
            10351, 10352, 10353, 10354, 10355, 10356, 10357, 10358, 10359, 10360,
            10361, 10362, 10363, 10364, 10365, 10366, 10367, 10368, 10369, 10370,
            10371, 10372, 10373, 10374, 10375, 10376, 10377, 10378, 10379, 10380,
            10381, 10382, 10383, 10384, 10385, 10386, 10387, 10388, 10389, 10390,
            10391, 10392, 10393, 10394, 10395, 10396, 10397);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_DP_Abbreviation", "AL_DP_AlienLanguages", "AL_DP_AngryChildren2",
            "AL_DP_ASuperHero", "AL_DP_BeautifulStrings", "AL_DP_BestSpot",
            "AL_DP_Billboards", "AL_DP_BlackAndWhiteTree", "AL_DP_BricksGame",
            "AL_DP_BrickTiling", "AL_DP_Candies", "AL_DP_CandlesCounting",
            "AL_DP_ChoosingWhiteBalls", "AL_DP_CluesOnABinaryPath", "AL_DP_CoinOnTheTable",
            "AL_DP_CountingRoadNetworks", "AL_DP_CountingSpecialSubCubes", "AL_DP_CountingTheWays",
            "AL_DP_CountScoredcards", "AL_DP_CoveringTheStains", "AL_DP_CutTree",
            "AL_DP_DecibinaryNumbers", "AL_DP_DivisibleNumbers", "AL_DP_DorseyThief",
            "AL_DP_DortmundDilemma", "AL_DP_Equal", "AL_DP_ExtremumPermutations",
            "AL_DP_FairCut", "AL_DP_FairyChess", "AL_DP_FarVertices",
            "AL_DP_FibonacciModified", "AL_DP_FindTheSeed", "AL_DP_GCDMatrix",
            "AL_DP_GridWalking", "AL_DP_HackerRankCity", "AL_DP_HardDiskDrives",
            "AL_DP_HexagonalGrid", "AL_DP_HyperStrings", "AL_DP_IntervalSelection",
            "AL_DP_KingAndFourSons", "AL_DP_KingdomDivision", "AL_DP_Knapsack",
            "AL_DP_LCSReturns", "AL_DP_LegoBlocks", "AL_DP_LongestModPath",
            "AL_DP_LongestPalindromeSubsequence", "AL_DP_LuckyNumbers", "AL_DP_MandragoraForest",
            "AL_DP_Mining", "AL_DP_ModifyTheSequence", "AL_DP_MrKMarsh",
            "AL_DP_NewYearPresent", "AL_DP_NikitaAndTheGame", "AL_DP_OilWell",
            "AL_DP_OnesAndTwos", "AL_DP_PlayWithWords", "AL_DP_PointsInAPlane",
            "AL_DP_PoliceOperation", "AL_DP_PrimeDigitSums", "AL_DP_PrimeXOR",
            "AL_DP_PSequences", "AL_DP_QueensOnBoard", "AL_DP_RedJohnIsBack",
            "AL_DP_Requirement", "AL_DP_RoadMaintenance", "AL_DP_Robot",
            "AL_DP_SamAndSubStrings", "AL_DP_SeparateTheChocolate", "AL_DP_ShashankAndThePalindromicStrings",
            "AL_DP_SherlockAndCost", "AL_DP_Sherlock'sArrayMergingAlgorithm", "AL_DP_SquareSubsequences",
            "AL_DP_StockMaximize", "AL_DP_StringReduction", "AL_DP_SubstringDiff",
            "AL_DP_SuffixRotation", "AL_DP_SummingPieces", "AL_DP_SuperKthLIS",
            "AL_DP_SupermanCelebratesDiwali", "AL_DP_SwapPermutation", "AL_DP_TarasBeautifulPermutations",
            "AL_DP_TheBlacklist", "AL_DP_TheCoinChangeProblem", "AL_DP_TheIndianJob",
            "AL_DP_TheLongestCommonSubsequence", "AL_DP_TheLongestIncreasingSubsequence", "AL_DP_TheMaximumSubarray",
            "AL_DP_TravelAroundTheWorld", "AL_DP_TreePruning", "AL_DP_TurnOffTheLights",
            "AL_DP_TwoRobots", "AL_DP_UnfairGame", "AL_DP_UniqueDivideAndConquer",
            "AL_DP_VimWar", "AL_DP_WetSharkAndTwoSubsequences", "AL_DP_XorAndSum",
            "AL_DP_ZurikelasGraph");
    private final String PROBLEM_TYPE = "Dynamic Programming";
    private final String TYPE_INITIAL = "DP";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 97;

    //Private constructor for singleton class.
    private DynamicProgrammingData(){
        if(dpSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static DynamicProgrammingData getInstance() {
        if(dpSingleton == null) dpSingleton = new DynamicProgrammingData();
        return dpSingleton;
    }
}
