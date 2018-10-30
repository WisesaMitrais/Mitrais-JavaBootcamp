package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class SearchData implements Data {

    private static SearchData srSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            11001, 11002, 11003, 11004, 11005, 11006, 11007, 11008, 11009, 11010,
            11011, 11012, 11013, 11014, 11015, 11016, 11017, 11018, 11019, 11020,
            11021, 11022, 11023, 11024, 11025);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_SR_AbsoluteElementSums", "AL_SR_AlmostIntegerRockGarden", "AL_SR_BeautifulQuadruples",
            "AL_SR_BikeRacers", "AL_SR_ConnectedCellsInAGrid", "AL_SR_CountLuck",
            "AL_SR_CutTheTree", "AL_SR_DistantPairs", "AL_SR_GenaPlayingHanoi",
            "AL_SR_GridlandMetro", "AL_SR_HackerlandRadioTransmitters", "AL_SR_IceCreamParlor",
            "AL_SR_KingRichardsKnights", "AL_SR_KnightLOnAChessboard", "AL_SR_MakingCandies",
            "AL_SR_MaximizingMissionPoints", "AL_SR_MaximumSubarraySum", "AL_SR_MinimumLoss",
            "AL_SR_MissingNumbers", "AL_SR_Pairs", "AL_SR_SherlockAndArray",
            "AL_SR_ShortPalindrome", "AL_SR_SimilarPair", "AL_SR_SortedSubSegments",
            "AL_SR_TaskScheduling");
    private final String PROBLEM_TYPE = "Search";
    private final String TYPE_INITIAL = "SE";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 25;

    //Private constructor for singleton class.
    private SearchData(){
        if(srSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static SearchData getInstance() {
        if(srSingleton == null) srSingleton = new SearchData();
        return srSingleton;
    }
}
