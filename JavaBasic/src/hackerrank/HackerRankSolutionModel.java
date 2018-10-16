package hackerrank;

public class HackerRankSolutionModel extends HackerRankProblemModel {
    
    private int solutionID = 99;
    
    public HackerRankSolutionModel(int problemID, String problemName, String problemType, String problemCategory) {
        super(problemID, problemName, problemType, problemCategory);
    }

    public int getSolutionID() {
        return this.solutionID;
    }

    public void setSolutionID(int solutionID) {
        this.solutionID = solutionID;
    }
    
    public String getProblemName(){
        return super.getProblemName();
    }
}
