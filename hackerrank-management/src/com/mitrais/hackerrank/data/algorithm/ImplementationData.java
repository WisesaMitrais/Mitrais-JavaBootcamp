package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class ImplementationData implements Data {

    private static ImplementationData imSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10701, 10702, 10703, 10704, 10705, 10706, 10707, 10708, 10709, 10710,
            10711, 10712, 10713, 10714, 10715, 10716, 10717, 10718, 10719, 10720,
            10721, 10722, 10723, 10724, 10725, 10726, 10727, 10728, 10729, 10730,
            10731, 10732, 10733, 10734, 10735, 10736, 10737, 10738, 10739, 10740,
            10741, 10742, 10743, 10744, 10745, 10746, 10747, 10748, 10749, 10750,
            10751, 10752, 10753, 10754, 10755, 10756, 10757, 10758, 10759, 10760,
            10761, 10762, 10763, 10764);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_IM_GradingStudents", "AL_IM_AppleAndOrange", "AL_IM_Kangaroo",
            "AL_IM_AbsolutePermutation", "AL_IM_ACMICPCTeam", "AL_IM_AlmostSorted",
            "AL_IM_AngryProfessor", "AL_IM_AppendAndDelete", "AL_IM_Queen'sAttackII",
            "AL_IM_BeautifulDaysAtTheMovies", "AL_IM_BeautifulTriplets", "AL_IM_BetweenTwoSets",
            "AL_IM_BiggerIsGreater", "AL_IM_BirthdayChocolate", "AL_IM_BonAppetit",
            "AL_IM_BreakingBestAndWorstRecords", "AL_IM_CatsAndAMouse", "AL_IM_CavityMap",
            "AL_IM_ChocolateFeast", "AL_IM_CircularArrayRotation", "AL_IM_ClimbingTheLeaderboard",
            "AL_IM_CountingValleys", "AL_IM_CutTheSticks", "AL_IM_DayOfTheProgrammer",
            "AL_IM_DesignerPDFViewer", "AL_IM_DivisibleSumPairs", "AL_IM_DrawingBook",
            "AL_IM_ElectronicsShop", "AL_IM_EmasSupercomputer", "AL_IM_Encryption",
            "AL_IM_EqualizeTheArray", "AL_IM_ExtraLongFactorials", "AL_IM_FairRations",
            "AL_IM_FindDigits", "AL_IM_FlatlandSpaceStations", "AL_IM_FormingAMagicSquare",
            "AL_IM_HappyLadybugs", "AL_IM_JumpingOnTheClouds(Revisited)", "AL_IM_JumpingOnTheClouds",
            "AL_IM_LarrysArray", "AL_IM_LibraryFine", "AL_IM_LisasWorkbook",
            "AL_IM_ManasaAndStones", "AL_IM_MatrixLayerRotation", "AL_IM_MigratoryBirds",
            "AL_IM_MinimumDistances", "AL_IM_ModifiedKaprekarNumbers", "AL_IM_NonDivisibleSubset",
            "AL_IM_OrganizingContainersOfBalls", "AL_IM_Picking Numbers", "AL_IM_RepeatedString",
            "AL_IM_SaveThePrisoner!", "AL_IM_SequenceEquation", "AL_IM_ServiceLane",
            "AL_IM_SherlockAndSquares", "AL_IM_SockMerchant", "AL_IM_StrangeCounter",
            "AL_IM_TaumAndBday", "AL_IM_TheBombermanGame", "AL_IM_TheGridSearch",
            "AL_IM_TheHurdleRace", "AL_IM_TheTimeInWords", "AL_IM_UtopianTree",
            "AL_IM_ViralAdvertising");
    private final String PROBLEM_TYPE = "Implementation";
    private final String TYPE_INITIAL = "IM";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 64;

    //Private constructor for singleton class.
    private ImplementationData(){
        if(imSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static ImplementationData getInstance() {
        if(imSingleton == null) imSingleton = new ImplementationData();
        return imSingleton;
    }
}
