/*
 * HackerRank Training (www.hackerrank.com)
 * spesify for documenting result code that already solved in HackerRank
 * last updated -> July 23th 2018
 * @Author: Wisesa Priya Fentika
 */

package hackerrank.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTraining {
    
    public static void getProblemAlgorithmSection(String problemType, int stage){
        AlgorithmSection as = new AlgorithmSection();
        switch(problemType){
            case "warmup":
                as.callWarmupProblem(stage);
                break;
            case "implementation":
                as.callImplementationProblem(stage);
                break;
            default: 
                System.out.println("There is no problem type like " + problemType);
                break;
        }
    }
    
    public static void getProblemDataStructureSection(String problemType, int stage){
        DataStructureSection dss = new DataStructureSection();
        switch(problemType){
            case "arrays":
                dss.callArraysProblem(stage);
                break;
            default: 
                System.out.println("There is no problem type like " + problemType);
                break;
        }
    }

    public static void useDataStructure(String algo){
        DataStructureAlgorithm dsa = new DataStructureAlgorithm();
        switch(algo){
            case "array":
                break;
            case "stack":
                break;
            case "queue":
                break;
            case "singlelinkedlist":
                break;
            case "doublelinkedlist":
                break;
            case "skiplist":
                break;
            case "hashtable":
                break;
            case "binarysearchtree":
                break;
            case "cartesiantree":
                break;
            case "btree":
                break;
            case "redblacktree":
                break;
            case "splaytree":
                break;
            case "avltree":
                break;
            case "kdtree":
                break;
            default:
                System.out.println("There is no algorithm like " + algo);
                break;
        }
    }
    
    public static int[] useSortingAscending(String algo){
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};
        switch(algo){
            case "quick":
                data = sa.quickSort(data);
                break;
            case "merge":
                data = sa.mergeSort(data);
                break;
            case "tim":
                data = sa.timSort(data);
                break;
            case "heap":
                data = sa.heapSort(data);
                break;
            case "bubble":
                data = sa.bubbleSort(data);
                break;
            case "insertion":
                data = sa.insertionSort(data);
                break;
            case "selection":
                data = sa.selectionSort(data);
                break;
            case "tree":
                data = sa.treeSort(data);
                break;
            case "shell":
                data = sa.shellSort(data);
                break;
            case "bucket":
                data = sa.bucketSort(data);
                break;
            case "radix":
                data = sa.radixSort(data);
                break;
            case "counting":
                data = sa.countingSort(data);
                break;
            case "cube":
                data = sa.cubeSort(data);
                break;
            default:
                System.out.println("There is no algorithm like " + algo);
                break;
        }
        return data;
    }
    
    public static void callOtherLogicExercise(String exercise, String value){
        OtherLogicExercise ole = new OtherLogicExercise();
        switch(exercise){
            case "star1":
                ole.starChallenge1(Integer.parseInt(value));
                break;
            case "star2":
                ole.starChallenge2(Integer.parseInt(value));
                break;
            case "palindrome":
                System.out.println(ole.isPalindrome(value));
                break;
            case "prime":
                System.out.println(ole.generatePrime(Integer.parseInt(value)));
                break;
            default:
                System.out.println("There is no exercise like " + exercise);
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for(int result : useSortingAscending("bubble")){
            System.out.print(result + " ");
        }
    }
}
