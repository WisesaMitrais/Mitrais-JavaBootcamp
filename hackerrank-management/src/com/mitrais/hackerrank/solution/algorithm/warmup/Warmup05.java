package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup05 {
    
    private int diagonalDifference(int n, int[][] arr){
        int i = 0, j = n - 1;
        int diagRight = 0, diagLeft = 0;
        while(i < n){
            diagRight += arr[i][i];
            diagLeft += arr[i][j];
            i++;
            j--;
        }
        return diagRight - diagLeft;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int arr_i=0; arr_i < n; arr_i++){
            for(int arr_j=0; arr_j < n; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(n, arr);
        if(result < 0) result *= (-1);
        System.out.println(result);
    }
}
