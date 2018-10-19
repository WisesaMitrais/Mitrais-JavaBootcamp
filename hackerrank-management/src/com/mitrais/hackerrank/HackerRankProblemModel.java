package com.mitrais.hackerrank;

public class HackerRankProblemModel {

    private final int problemID;
    private final String problemName;
    private final String problemType;
    private final String problemCategory;
    private int solutionID;
    private boolean isSolved;

    public HackerRankProblemModel(int problemID, String problemName, String problemType,
                                  String problemCategory) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.problemType = problemType;
        this.problemCategory = problemCategory;
        this.solutionID = 99;
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

    public int getSolutionID() {
        return solutionID;
    }

    public void setSolutionID(int solutionID) {
        this.solutionID = solutionID;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
