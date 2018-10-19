package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup08 {
    
    private long[] miniMaxSum(int[] arr){
        long temp = 0;
        long[] result = {0, 0};
        for(int i = 0; i < 5; i++){
            temp = 0;
            for(int j = 0; j < 5; j++){
                if(j != i) temp += arr[j];
            }
            if(i == 0){
                result[0] = temp;
                result[1] = temp;
            }else{
                if(result[0] > temp) result[0] = temp;
                if(result[1] < temp) result[1] = temp;
            }
        }
        return result;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long[] result = miniMaxSum(arr);
        System.out.print(result[0]+" "+result[1]);
        System.out.println();
    }
}
