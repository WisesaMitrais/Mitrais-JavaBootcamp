package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup04 {
    
    private long aVeryBigSum(int n, long[] arr) {
        long result = 0;
        for(int i = 0; i < n; i++){
            result += arr[i];
        }
        return result;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, arr);
        System.out.println(result);
    }
}
