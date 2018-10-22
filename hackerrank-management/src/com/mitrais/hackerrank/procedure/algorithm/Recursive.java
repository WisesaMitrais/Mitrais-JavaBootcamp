package com.mitrais.hackerrank.procedure.algorithm;

import com.mitrais.hackerrank.procedure.*;

public class Recursive implements Strategy {


    @Override
    public int intRecursive(int n) {
        if(n == 0 || n == 1) return 1;
        else return n + intRecursive(n - 1);
    }
}
