package hackerrank;

public class HackerRankProblem {
    
    private final int problemID;
    private final String problemCategory;
    private final String problemType;
    private final String pdfName;

    public HackerRankProblem(int problemID, String problemCategory, String problemType, String pdfName) {
        this.problemID = problemID;
        this.problemCategory = problemCategory;
        this.problemType = problemType;
        this.pdfName = pdfName;
    }

    public int getProblemID() {
        return problemID;
    }

    public String getProblemCategory() {
        return problemCategory;
    }

    public String getProblemType() {
        return problemType;
    }

    public String getPdfName() {
        return pdfName;
    }
}
