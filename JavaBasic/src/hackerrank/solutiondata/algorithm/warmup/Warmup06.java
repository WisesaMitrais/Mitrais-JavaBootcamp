package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup06 {
    
    private int[] plusMinus(int n, int[] arr){
        int[] type = {0, 0, 0};
        for(int i = 0; i < n; i++){
            if(arr[i] > 0) type[0]++;
            else if(arr[i] < 0) type[1]++;
            else type[2]++;
        }
        return type;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] type = plusMinus(n, arr);
        double result;
        for(int i = 0; i < 3; i++){
            result = (double) type[i] / n;
            System.out.println(result);
        }
    }
}
