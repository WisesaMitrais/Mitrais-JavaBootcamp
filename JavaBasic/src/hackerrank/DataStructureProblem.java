package hackerrank;

import hackerrank.problemdata.datastructure.ArraysData;

public class DataStructureProblem extends GeneralMethodProblem {
    
    private final ArraysData dsad = new ArraysData();
    private final HackerRankProblemModel[] dsadProblem = new HackerRankProblemModel[5];
    
    public DataStructureProblem(){
        for(int index = 0; index < dsad.getTotalProblem(); index++){
            this.dsadProblem[index] = new HackerRankProblemModel(this.dsad.getOneProblemId(index),
            this.dsad.getOneProblemName(index), this.dsad.getProblemType(), this.dsad.getProblemCategory());
        }
    }
    
    @Override
    public void printAllProblem() {
        printProblem("Arrays", dsadProblem);
    }

    @Override
    public void printAllProblem(String problemType) {
        switch(problemType){
            case "Arrays":
                printProblem(problemType, dsadProblem);
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
    
    private void printProblem(String problemType, HackerRankProblemModel[] hrpmList){
        try{
            System.out.println("Problem List of Data Structure "+problemType+":");
            for(HackerRankProblemModel hrpm: hrpmList){
                System.out.println(hrpm.getProblemID()+" - "+hrpm.getProblemName());
            } 
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ERROR, Array index out of bound!");
        }catch(NullPointerException ex){
            System.out.println("ERROR, Array index(s) is null");
        }
    }
}
