package hackerrank;

import hackerrank.problemdata.algorithm.ImplementationData;
import hackerrank.problemdata.algorithm.WarmupData;

public class AlgorithmProblem extends GeneralMethodProblem {
    
    private final WarmupData awd = new WarmupData();
    private final ImplementationData acad = new ImplementationData();
    private final HackerRankProblemModel[] awdProblem = new HackerRankProblemModel[10];
    private final HackerRankProblemModel[] acadProblem = new HackerRankProblemModel[11];
    
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
        printProblem("Warmup", awdProblem);
        printProblem("Constructive Algorithms", acadProblem);
    }

    @Override
    public void printAllProblem(String problemType) {
        switch(problemType){
            case "Warmup":
                printProblem(problemType, awdProblem);
                break;
            case "Constructive Algorithms":
                printProblem(problemType, acadProblem);
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
    
    private void printProblem(String problemType, HackerRankProblemModel[] hrpmList){
        try{
            System.out.println("Problem List of Algorithm "+problemType+":");
            for(HackerRankProblemModel hrpm: hrpmList){
                System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
            } 
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index out of bound!");
        }catch(NullPointerException ex){
            System.out.println("ERROR, Array index(s) is null");
        }
    }
}
