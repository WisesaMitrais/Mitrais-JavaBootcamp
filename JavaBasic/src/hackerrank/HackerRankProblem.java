package hackerrank;

public class HackerRankProblem {
    
    private final int problemID;
    private final String problemCategory;
    private final String problemType;
    private final String pdfName;
    boolean isSolved;

    public HackerRankProblem(int problemID, String problemCategory, String problemType, String pdfName) {
        this.problemID = problemID;
        this.problemCategory = problemCategory;
        this.problemType = problemType;
        this.pdfName = pdfName;
        isSolved = false;
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
    
    public void printProblem(){
        System.out.println("ID: "+problemID+
                    ". Category: "+problemCategory+
                    ". Type: "+problemType+
                    ". PDF: "+pdfName);
    }
    
    public int getTotalProblem(){
        return DummyData.TOTAL_PROBLEM;
    }
}
