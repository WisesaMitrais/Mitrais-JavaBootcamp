package hackerrank;

public class HackerRankSolutionModel extends HackerRankProblemModel {
    
    private int solutionID;
    private boolean isSolved;
    
    public HackerRankSolutionModel(int problemID, String problemName, String problemType, 
            String problemCategory) {
        super(problemID, problemName, problemType, problemCategory);
    }

    public int getSolutionID() {
        return this.solutionID;
    }

    public void setSolutionID(int solutionID) {
        this.solutionID = solutionID;
    }
    
    public boolean getIsSolved() {
        return this.isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
    
    //Make sure the relation between problem and solution.
    @Override
    public int getProblemID(){
        return super.getProblemID();
    }
}
