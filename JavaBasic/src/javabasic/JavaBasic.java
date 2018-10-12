package javabasic;

import hackerrank.HackerRankProblem;
import hackerrank.DummyData;

public class JavaBasic {

    public static void main(String[] args) {
        System.out.println("Java Basic Concept");
        
        DummyData dummyData = new DummyData();
        HackerRankProblem hackerRankProblem = new HackerRankProblem(
                dummyData.getOneProblemId(0), dummyData.getOneProblemCategory(0),
                dummyData.getOneProblemType(0), dummyData.getOnePDFName(0));
        System.out.println(hackerRankProblem.getProblemID());
        System.out.println(hackerRankProblem.getProblemCategory());
        System.out.println(hackerRankProblem.getProblemType());
        System.out.println(hackerRankProblem.getPdfName());
    }
}
