package hackerrank;

public class DummyData {
    
    private static final int[] PROBLEM_ID = {
        11301, 11302, 11303, 11304, 11305, 11306, 11307, 11308, 11309, 11310};
    private static final String[] PROBLEM_CATEGORY = {
        "Algorithm"};
    private static final String[] PROBLEM_TYPE = {
        "Warmup"};
    private static final String[] PDF_NAME = {
        "WU_AVeryBigSum", "WU_BirthdayCakeCandles", "WU_CompareTheTriplets", 
        "WU_DiagonalDifference", "WU_MiniMaxSum", "WU_PlusMinus", 
        "WU_SimpleArraySum", "WU_SolveMeFirst", "WU_Staircase", 
        "WU_TimeConversion"};
    protected static final int TOTAL_PROBLEM = 10;
    
    public int[] getProblemId(){
        return PROBLEM_ID;
    }
    
    public int getOneProblemId(int index){
        if(index > 9 || index < 0) return -1;
        else return PROBLEM_ID[index];
    }
    
    public String[] getProblemCategory(){
        return PROBLEM_CATEGORY;
    }
    
    public String getOneProblemCategory(int index){
        if(index != 0) return "Not Found";
        else return PROBLEM_CATEGORY[index];
    }
    
    public String[] getProblemType(){
        return PROBLEM_TYPE;
    }
    
    public String getOneProblemType(int index){
        if(index != 0) return "Not Found";
        else return PROBLEM_TYPE[index];
    }
    
    public String[] getPDFName(){
        return PDF_NAME;
    }
    
    public String getOnePDFName(int index){
        if(index > 9 || index < 0) return "Not Found";
        else return PDF_NAME[index];
    }
}
