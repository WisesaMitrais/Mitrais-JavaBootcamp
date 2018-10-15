package hackerrank.dummydata;

public class AlgorithmConstructiveAlgorithmsData implements DummyData {
    
    private static final int[] PROBLEM_ID = {
        10201, 10202, 10203, 10204, 10205, 10206, 10207, 10208, 10209, 10210, 10211};
    private static final String[] PROBLEM_NAME = {
        "AL_CA_ArrayConstruction", "AL_CA_Beautiful3Set", "AL_CA_Bonetrousle", 
        "AL_CA_FlippingTheMatrix", "AL_CA_GamingArray", "AL_CA_InverseRMQ", 
        "AL_CA_LenaSort", "AL_CA_LovelyTriplets", "AL_CA_NewYearChaos", 
        "AL_CA_TwoSubarrays", "AL_CA_YetAnotherKMPProblem"};
    private static final String PROBLEM_TYPE = "Constructive Algorithms";
    private static final String PROBLEM_CATEGORY = "Algorithm";
    private static final int TOTAL_PROBLEM = 11;

    @Override
    public int getOneProblemId(int index) {
        index = (index >= 0 && index < TOTAL_PROBLEM) ? PROBLEM_ID[index] : 99;
        return index;
    }

    @Override
    public String getOneProblemName(int index) {
        String result = (index >= 0 && index < TOTAL_PROBLEM) ? PROBLEM_NAME[index] : "Not Found";
        return result;
    }

    @Override
    public String getProblemType() {
        return PROBLEM_TYPE;
    }

    @Override
    public String getProblemCategory() {
        return PROBLEM_CATEGORY;
    }

    @Override
    public int getTotalProblem() {
        return TOTAL_PROBLEM;
    }
}
