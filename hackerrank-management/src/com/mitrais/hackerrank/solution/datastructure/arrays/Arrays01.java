package com.mitrais.hackerrank.solution.datastructure.arrays;

import java.util.*;

public class Arrays01 {
    
    private int[] arrayDS(int n, int[] arr){
        int temp = 0;
        int j = n-1;
        for(int i = 0; i < (n/2); i++){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        return arr;
    }

    public void solution() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        arr = arrayDS(n, arr);
        for(int i = 0; i < n; i++){
            if(i == n-1) System.out.println(arr[i]);
            else System.out.print(arr[i]+" ");
        }
    }
}
