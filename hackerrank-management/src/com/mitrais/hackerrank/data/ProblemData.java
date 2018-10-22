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
            case "WU":
                data = WarmupData.getInstance();
                break;
            case "IM":
                data = ImplementationData.getInstance();
                break;
            case "AR":
                data = ArraysData.getInstance();
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
