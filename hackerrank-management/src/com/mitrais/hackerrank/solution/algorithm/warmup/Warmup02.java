package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup02 {
    
    private int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += ar[i];
        }
        return sum;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = simpleArraySum(n, arr);
        System.out.println(result);
    }
}
