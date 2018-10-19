package com.mitrais.hackerrank.solution.algorithm.implementation;

import java.util.*;

public class Implementation03 {

    private String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 == x2 && v1 == v2){
            return "YES";
        }else if(x1 > x2 && v1 < v2){
            do{
                x1 += v1;
                x2 += v2;
                if(x1 == x2) return "YES";
            }while(x1 > x2);
            return "NO";
        }else if(x1 < x2 && v1 > v2){
            do{
                x1 += v1;
                x2 += v2;
                if(x1 == x2) return "YES";
            }while(x1 < x2);
            return "NO";
        }else{
            return "NO";
        }
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
