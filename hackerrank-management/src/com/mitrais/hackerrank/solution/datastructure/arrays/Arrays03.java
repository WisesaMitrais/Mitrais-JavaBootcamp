package com.mitrais.hackerrank.solution.datastructure.arrays;

import java.util.*;

public class Arrays03 {
    
    private void dynamicArray(int N, int Q, int[][] Query){
        int lastAnswer = 0;
        ArrayList[] seqList = new ArrayList[N];
        int seq, value;
        for(int idx = 0; idx < N; idx++){
            seqList[idx] = new ArrayList<Integer>();
        }
        for(int idx = 0; idx < Q; idx++){
            seq = (Query[idx][1] ^ lastAnswer) % N;
            if(Query[idx][0] == 1){
                seqList[seq].add(Query[idx][2]);
            }else{
                value = Query[idx][2] % seqList[seq].size();
                lastAnswer = (Integer) seqList[seq].get(value);
                System.out.println(lastAnswer);
            }
        }
    }

    public void solution(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int[][] Query = new int[Q][3];
        for(int i = 0; i < Q; i++){
            for(int j = 0; j < 3; j++){
                Query[i][j] = scan.nextInt();
            }
        }
        dynamicArray(N, Q, Query);
    }
}
