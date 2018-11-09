package bean;

public class Problem {
    
    private final int problemID;
    private final String problemName;
    private final String problemType;
    private final String typeInitial;
    private final String problemCategory;
    private final int solutionID;
    private final boolean isCompletedSolved;

    public Problem(int problemID, String problemName, String problemType, 
            String typeInitial, String problemCategory, int solutionID, 
            boolean isCompletedSolved) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.problemType = problemType;
        this.typeInitial = typeInitial;
        this.problemCategory = problemCategory;
        this.solutionID = solutionID;
        this.isCompletedSolved = isCompletedSolved;
    }

    public int getProblemID() {
        return problemID;
    }

    public String getProblemName() {
        return problemName;
    }

    public String getProblemType() {
        return problemType;
    }

    public String getTypeInitial() {
        return typeInitial;
    }

    public String getProblemCategory() {
        return problemCategory;
    }

    public int getSolutionID() {
        return solutionID;
    }

    public boolean isCompletedSolved() {
        return isCompletedSolved;
    }
}
