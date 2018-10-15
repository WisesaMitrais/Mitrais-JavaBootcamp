package hackerrank;

import hackerrank.dummydata.AlgorithmWarmupData;

public class AlgorithmProblem implements GeneralMethodProblem {
    
    AlgorithmWarmupData awd = new AlgorithmWarmupData();
    HackerRankProblemModel[] awdProblem = new HackerRankProblemModel[10];
    
    public AlgorithmProblem(){
        for(int index = 0; index < awd.getTotalProblem(); index++){
            this.awdProblem[index] = new HackerRankProblemModel(this.awd.getOneProblemId(index),
            this.awd.getOneProblemName(index), this.awd.getProblemType(), this.awd.getProblemCategory());
        }
    }

    @Override
    public void printAllProblem(String problemType) {
        System.out.println("Problem List of Algorithm "+problemType+":");
        switch(problemType){
            case "Warmup":
                for(int index = 0; index < awdProblem.length; index++){
                    System.out.println(awdProblem[index].getProblemID()+
                            " - "+awdProblem[index].getProblemName());
                }
                break;
            default: System.out.println("Problem Type Not Found!");
        }
    }
}
