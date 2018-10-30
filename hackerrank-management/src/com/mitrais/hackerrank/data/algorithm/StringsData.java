package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class StringsData implements Data {

    private static StringsData sgSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            11201, 11202, 11203, 11204, 11205, 11206, 11207, 11208, 11209, 11210,
            11211, 11212, 11213, 11214, 11215, 11216, 11217, 11218, 11219, 11220,
            11221, 11222, 11223, 11224, 11225, 11226, 11227, 11228, 11229, 11230,
            11231, 11232, 11233, 11234, 11235, 11236, 11237, 11238, 11239, 11240,
            11241, 11242, 11243, 11244, 11245);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_SG_AlternatingCharacters", "AL_SG_Anagram", "AL_SG_AshtonAndString",
            "AL_SG_BearAndSteadyGene", "AL_SG_BeautifulBinaryString", "AL_SG_BuildAPalindrome",
            "AL_SG_BuildAString", "AL_SG_CaesarCipher", "AL_SG_CamelCase",
            "AL_SG_CircularPalindromes", "AL_SG_CommonChild", "AL_SG_CountStrings",
            "AL_SG_DeterminingDNAHealth", "AL_SG_FindStrings", "AL_SG_FunnyString",
            "AL_SG_GameOfThronesI", "AL_SG_Gemstones", "AL_SG_GridlandProvinces",
            "AL_SG_HackerRankInAString!", "AL_SG_HowManySubstrings", "AL_SG_LetterIslands",
            "AL_SG_MakingAnagrams", "AL_SG_MarsExploration", "AL_SG_MorganAndAString",
            "AL_SG_PalindromeIndex", "AL_SG_PalindromicBorder", "AL_SG_Pangrams",
            "AL_SG_PseudoIsomorphicSubstrings", "AL_SG_RichieRich", "AL_SG_SaveHumanity",
            "AL_SG_SeparateTheNumbers", "AL_SG_SherlockAndAnagrams", "AL_SG_SherlockAndTheValidString",
            "AL_SG_SimilarStrings", "AL_SG_StringConstruction", "AL_SG_StringFunctionCalculation",
            "AL_SG_StringSimilarity", "AL_SG_SuperFunctionalStrings", "AL_SG_SuperReducedString",
            "AL_SG_TheLoveLetterMystery", "AL_SG_TwoCharacters", "AL_SG_TwoStrings",
            "AL_SG_TwoStringsGame", "AL_SG_TwoTwo", "AL_SG_WeightedUniformStrings");
    private final String PROBLEM_TYPE = "Strings";
    private final String TYPE_INITIAL = "SG";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 45;

    //Private constructor for singleton class.
    private StringsData(){
        if(sgSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static StringsData getInstance() {
        if(sgSingleton == null) sgSingleton = new StringsData();
        return sgSingleton;
    }
}
