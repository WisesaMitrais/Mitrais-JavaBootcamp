package hackerrank;

import hackerrank.dummydata.*;

public class AlgorithmProblem extends GeneralMethodProblem {
    
    AlgorithmWarmupData awd = new AlgorithmWarmupData();
    AlgorithmConstructiveAlgorithmsData acad = new AlgorithmConstructiveAlgorithmsData();
    HackerRankProblemModel[] awdProblem = new HackerRankProblemModel[10];
    HackerRankProblemModel[] acadProblem = new HackerRankProblemModel[11];
    
    public AlgorithmProblem(){
        for(int index = 0; index < awd.getTotalProblem(); index++){
            this.awdProblem[index] = new HackerRankProblemModel(this.awd.getOneProblemId(index),
            this.awd.getOneProblemName(index), this.awd.getProblemType(), this.awd.getProblemCategory());
        }
        for(int index = 0; index < acad.getTotalProblem(); index++){
            this.acadProblem[index] = new HackerRankProblemModel(this.acad.getOneProblemId(index),
            this.acad.getOneProblemName(index), this.acad.getProblemType(), this.acad.getProblemCategory());
        }
    }
    
    @Override
    public void printAllProblem() {
        System.out.println("Problem List of Algorithm Warmup:");
        for(HackerRankProblemModel hrpm: awdProblem){
            System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
        }
        System.out.println("Problem List of Algorithm Constructive Algorithms:");
        for(HackerRankProblemModel hrpm: acadProblem){
            System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
        }
    }

    @Override
    public void printAllProblem(String problemType) {
        System.out.println("Problem List of Algorithm "+problemType+":");
        switch(problemType){
            case "Warmup":
                for(HackerRankProblemModel hrpm: awdProblem){
                    System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
                }
                break;
            case "Constructive Algorithms":
                for(HackerRankProblemModel hrpm: acadProblem){
                    System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
                }
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }

    @Override
    public void printTotalProblem(String problemType) {
        switch(problemType){
            case "Warmup":
                System.out.println(awdProblem.length);
                break;
            case "Constructive Algorithms":
                System.out.println(acadProblem.length);
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }
}
