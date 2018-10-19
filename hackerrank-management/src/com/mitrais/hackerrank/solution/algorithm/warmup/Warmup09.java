package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup09 {
    
    public int birthdayCakeCandles(int n, int[] arr) {
        int tallestValue = arr[0];
        for(int i = 1; i < n; i++){
            if(tallestValue < arr[i]) tallestValue = arr[i];
        }
        int sumTallestValue = 0;
        for(int i = 0; i < n; i++){
            if(tallestValue == arr[i]){
                sumTallestValue++;
            }
        }
        return sumTallestValue;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, arr);
        System.out.println(result);
    }
}
