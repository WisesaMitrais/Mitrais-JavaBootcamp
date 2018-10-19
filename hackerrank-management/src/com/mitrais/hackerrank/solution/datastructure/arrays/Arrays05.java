package com.mitrais.hackerrank.solution.datastructure.arrays;

import java.util.*;

public class Arrays05 {
    
    private int[] sparseArray(int Q, int N, String[] strings, String[] queries, int[] counter){
        for(int idx = 0; idx < Q; idx++){
            for(int idx2 = 0; idx2 < N; idx2++){
                if(queries[idx].equals(strings[idx2])) counter[idx]++;
            }
        }
        return counter;
    }

    public void solution(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] strings = new String[N];
        for(int idx = 0; idx < N; idx++){
            strings[idx] = scan.next();
        }
        int Q = scan.nextInt();
        String[] queries = new String[Q];
        int[] counter = new int[Q];
        for(int idx = 0; idx < Q; idx++){
            queries[idx] = scan.next();
            counter[idx] = 0;
        }
        counter = sparseArray(Q, N, strings, queries, counter);
        for(int idx = 0; idx < Q; idx++){
            System.out.println(counter[idx]);
        }
    }
}
