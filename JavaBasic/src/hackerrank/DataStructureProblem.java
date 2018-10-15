package hackerrank;

import hackerrank.dummydata.DataStructureArraysData;

public class DataStructureProblem extends GeneralMethodProblem {
    
    DataStructureArraysData dsad = new DataStructureArraysData();
    HackerRankProblemModel[] dsadProblem = new HackerRankProblemModel[5];
    
    public DataStructureProblem(){
        for(int index = 0; index < dsad.getTotalProblem(); index++){
            this.dsadProblem[index] = new HackerRankProblemModel(this.dsad.getOneProblemId(index),
            this.dsad.getOneProblemName(index), this.dsad.getProblemType(), this.dsad.getProblemCategory());
        }
    }
    
    @Override
    public void printAllProblem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printAllProblem(String problemType) {
        System.out.println("Problem List of Data Structure "+problemType+":");
        switch(problemType){
            case "Arrays":
                for(HackerRankProblemModel hrpm: dsadProblem){
                    System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
                }
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void printTotalProblem(String problemType) {
        switch(problemType){
            case "Arrays":
                System.out.println(dsadProblem.length);
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }
}
