package com.mitrais.hackerrank.data;

import com.mitrais.hackerrank.data.algorithm.*;
import com.mitrais.hackerrank.data.datastructure.*;

public class ProblemData {

    private static ProblemData problemSingleton = null; //The singleton class.

    private ProblemData(){
        if(problemSingleton != null) throw new IllegalStateException("Singleton already created !!");
    }

    //Create a factory for problem data.
    public Data getInstanceObject(String problemInitial){
        Data data = null;
        problemInitial = problemInitial.toUpperCase();
        switch (problemInitial){
            case "BM": data = BitManipulationData.getInstance();
                break;
            case "CA": data = ConstructiveAlgorithmsData.getInstance();
                break;
            case "DP": data = DynamicProgrammingData.getInstance();
                break;
            case "GT": data = GameTheoryData.getInstance();
                break;
            case "GH": data = GraphTheoryData.getInstance();
                break;
            case "GR": data = GreedyData.getInstance();
                break;
            case "IM": data = ImplementationData.getInstance();
                break;
            case "NP": data = NPCompleteData.getInstance();
                break;
            case "RC": data = RecursionData.getInstance();
                break;
            case "SR": data = SearchData.getInstance();
                break;
            case "ST": data = SortingData.getInstance();
                break;
            case "SG": data = StringsData.getInstance();
                break;
            case "WU": data = WarmupData.getInstance();
                break;
            case "AV": data = AdvancedData.getInstance();
                break;
            case "AR": data = ArraysData.getInstance();
                break;
            case "BT": data = BalancedTreesData.getInstance();
                break;
            case "DS": data = DisjointSetData.getInstance();
                break;
            case "HP": data = HeapData.getInstance();
                break;
            case "LL": data = LinkedListsData.getInstance();
                break;
            case "QU": data = QueuesData.getInstance();
                break;
            case "SC": data = StacksData.getInstance();
                break;
            case "TE": data = TreesData.getInstance();
                break;
            case "TR": data = TrieData.getInstance();
                break;
            default: System.out.println("Problem not found !!");
        }
        return data;
    }

    public static ProblemData getInstance() {
        if(problemSingleton == null) problemSingleton = new ProblemData();
        return problemSingleton;
    }
}
