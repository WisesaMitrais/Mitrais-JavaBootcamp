package javabasic;

import hackerrank.HackerRankProblem;
import hackerrank.DummyData;

public class JavaBasic {

    public static void main(String[] args) {
        System.out.println("Java Basic Concept");
        
        DummyData dummyData = new DummyData();
        HackerRankProblem[] hackerRankProblemList = new HackerRankProblem[10];
        //Insert dummy data to array.
        for(int index = 0; index <= 9; index++){
            hackerRankProblemList[index] = new HackerRankProblem(
            dummyData.getOneProblemId(index), dummyData.getOneProblemCategory(0),
                dummyData.getOneProblemType(0), dummyData.getOnePDFName(index));
        }
        //Print array data.
        int index = 0;
        do{
            System.out.println("Problem-ID: "+hackerRankProblemList[index].getProblemID()+
                    ". Problem-Category: "+hackerRankProblemList[index].getProblemCategory()+
                    ". Problem-Type: "+hackerRankProblemList[index].getProblemType()+
                    ". PDF-Name: "+hackerRankProblemList[index].getPdfName());
            index++;
        }while(index < 10);
    }
}
