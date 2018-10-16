package hackerrank;

public class HackerRankProblemModel {

    private final int problemID;
    private final String problemName;
    private final String problemType;
    private final String problemCategory;
    boolean isSolved;

    public HackerRankProblemModel(int problemID, String problemName, String problemType, 
            String problemCategory) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.problemType = problemType;
        this.problemCategory = problemCategory;
        this.isSolved = false;
    }

    public int getProblemID() {
        return this.problemID;
    }

    public String getProblemName() {
        return this.problemName;
    }

    public String getProblemType() {
        return this.problemType;
    }
    
    public String getProblemCategory() {
        return this.problemCategory;
    }
    
    public boolean getIsSolved(){
        return this.isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
}
