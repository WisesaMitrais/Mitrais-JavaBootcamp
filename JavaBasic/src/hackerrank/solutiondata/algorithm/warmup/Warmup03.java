package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup03 {
    
    private int[] compareTheTriplets(int[] arr){
        int[] result = {0, 0};
        for(int i = 0; i < 3; i++){
            if(arr[i] > arr[i+3]) result[0]++;
            else if(arr[i] < arr[i+3]) result[1]++;
        }
        return result;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int[] result = compareTheTriplets(arr);
        for (int i : result) {
            System.out.print(result[i] + (i != result.length-1 ? " " : ""));
        }
        System.out.println("");
    }
}
