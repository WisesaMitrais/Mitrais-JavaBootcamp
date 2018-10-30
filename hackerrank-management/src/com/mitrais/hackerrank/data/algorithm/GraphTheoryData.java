package com.mitrais.hackerrank.data.algorithm;

import com.mitrais.hackerrank.data.*;
import java.util.*;

public class GraphTheoryData implements Data {

    private static GraphTheoryData ghSingleton = null; //The singleton class.
    private final List<Integer> PROBLEM_ID = Arrays.asList(
            10501, 10502, 10503, 10504, 10505, 10506, 10507, 10508, 10509, 10510,
            10511, 10512, 10513, 10514, 10515, 10516, 10517, 10518, 10519, 10520,
            10521, 10522, 10523, 10524, 10525, 10526, 10527, 10528, 10529, 10530,
            10531, 10532, 10533, 10534, 10535, 10536, 10537, 10538, 10539, 10540,
            10541, 10542, 10543, 10544, 10545, 10546, 10547, 10548, 10549, 10550,
            10551, 10552, 10553, 10554, 10555, 10556, 10557, 10558, 10559, 10560,
            10561, 10562);
    private final List<String> PROBLEM_NAME = Arrays.asList(
            "AL_GH_AlexVSFedor", "AL_GH_BeadOrnaments", "AL_GH_BreadthFirstSearch(ShortestReach)",
            "AL_GH_ByteLandianTours", "AL_GH_Clique", "AL_GH_ComputerGame",
            "AL_GH_CoprimePaths", "AL_GH_CrabGraphs", "AL_GH_DAGQueries",
            "AL_GH_DefiniteRandomWalks", "AL_GH_DemandingMoney", "AL_GH_DFSEdges",
            "AL_GH_DiameterMinimization", "AL_GH_Dijkstra(ShortestReach2)", "AL_GH_Drive",
            "AL_GH_EvanTree", "AL_GH_FavoriteSequence", "AL_GH_FindThePath",
            "AL_GH_Floyd(CityOfBlindingLights)", "AL_GH_GoingToTheOffice", "AL_GH_HackerCountry",
            "AL_GH_HackerX", "AL_GH_Huarongdao", "AL_GH_JackGoesToRapture",
            "AL_GH_JeaniesRoute", "AL_GH_JimAndHisLANParty", "AL_GH_JoggingCats",
            "AL_GH_JourneyScheduling", "AL_GH_JourneyToTheMoon", "AL_GH_JumpingRooks",
            "AL_GH_KingdomConnectivity", "AL_GH_Kruskal(MST)ReallySpecialSubtree", "AL_GH_KthAncestor",
            "AL_GH_Liars", "AL_GH_Matrix", "AL_GH_MinimumMSTGraph",
            "AL_GH_MinimumPenaltyPath", "AL_GH_Prims(MST)SpecialSubtree", "AL_GH_ProblemSolving",
            "AL_GH_QuadrantQueries", "AL_GH_RealEstateBroker", "AL_GH_RecordingEpisodes",
            "AL_GH_RepairRoads", "AL_GH_RoadNetwork", "AL_GH_RoadsAndLibraries",
            "AL_GH_RoadsInHackerLand", "AL_GH_Rust&Murderer", "AL_GH_SavitaAndFriends",
            "AL_GH_SnakesAndLadders(TheQuickestWayUp)", "AL_GH_SubsetComponent", "AL_GH_SynchronousShopping",
            "AL_GH_TheStoryOfATree", "AL_GH_TheValueOfFriendship", "AL_GH_Ticket",
            "AL_GH_TollCostDigits", "AL_GH_TrainingTheArmy", "AL_GH_TravelingSalesmanInAGrid",
            "AL_GH_TravelInHackerLand", "AL_GH_TreeFlow", "AL_GH_TreeSplitting",
            "AL_GH_TripartiteMatching", "AL_GH_VerticalPaths");
    private final String PROBLEM_TYPE = "Graph Theory";
    private final String TYPE_INITIAL = "GH";
    private final String PROBLEM_CATEGORY = "Algorithm";
    private final int TOTAL_PROBLEM = 62;

    //Private constructor for singleton class.
    private GraphTheoryData(){
        if(ghSingleton != null) throw new IllegalStateException("Singleton already created !!");
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

    public static GraphTheoryData getInstance() {
        if(ghSingleton == null) ghSingleton = new GraphTheoryData();
        return ghSingleton;
    }
}
