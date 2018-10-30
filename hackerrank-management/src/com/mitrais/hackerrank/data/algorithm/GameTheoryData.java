package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class GameTheoryData implements Data {

    private static GameTheoryData gtSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10401, 10402, 10403, 10404, 10405, 10406, 10407, 10408, 10409, 10410,
            10411, 10412, 10413, 10414, 10415, 10416, 10417, 10418, 10419, 10420,
            10421, 10422, 10423, 10424, 10425, 10426, 10427, 10428, 10429, 10430,
            10431, 10432);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_GT_AChessboardGame", "AL_GT_AliceAndBob'sSillyGame", "AL_GT_AStonesGame",
            "AL_GT_BobAndBen", "AL_GT_ChessboardGame(Again!)", "AL_GT_ChocolateGame",
            "AL_GT_ChocolateInBox", "AL_GT_Deforestation", "AL_GT_DigitsSquareBoard",
            "AL_GT_FunGame", "AL_GT_GameOfStones", "AL_GT_IntroductionToNimGame",
            "AL_GT_KittyAndKatty", "AL_GT_ManasaAndPrimeGame", "AL_GT_MisereNim",
            "AL_GT_MoveTheCoins", "AL_GT_NewYearGame", "AL_GT_NimbleGame",
            "AL_GT_PermutationGame", "AL_GT_PlayOnBenders", "AL_GT_PokerNim",
            "AL_GT_PowersGame", "AL_GT_SimpleGame", "AL_GT_StoneDivision",
            "AL_GT_StonePiles", "AL_GT_TastesLikeWinning", "AL_GT_TowerBreakers(Again!)",
            "AL_GT_TowerBreakers(Revisited)", "AL_GT_TowerBreakers", "AL_GT_TowerBreakersTheFinalBattle",
            "AL_GT_VerticalRooks", "AL_GT_ZeroMoveNim");
    private final String PROBLEM_TYPE = "Game Theory";
    private final String TYPE_INITIAL = "GT";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 32;

    //Private constructor for singleton class.
    private GameTheoryData(){
        if(gtSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static GameTheoryData getInstance() {
        if(gtSingleton == null) gtSingleton = new GameTheoryData();
        return gtSingleton;
    }
}
