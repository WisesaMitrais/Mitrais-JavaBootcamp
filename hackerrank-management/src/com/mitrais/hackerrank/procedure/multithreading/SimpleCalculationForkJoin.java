package com.mitrais.hackerrank.procedure.multithreading;

import java.util.concurrent.*;

public class SimpleCalculationForkJoin extends RecursiveTask<Long> {

    private long result = 0;
    private int base, n, parallelCutOff = 50;

    public SimpleCalculationForkJoin(int base, int n) {
        this.base = base;
        this.n = n;
    }

    @Override
    protected Long compute() {
        if(n <= parallelCutOff){
            result = additionRecursive(base, n);
            return result;
        }else{
            int middleIndex = n / 2;
            SimpleCalculationForkJoin leftTask = new SimpleCalculationForkJoin(base, middleIndex);
            SimpleCalculationForkJoin rightTask = new SimpleCalculationForkJoin(middleIndex + 1, n);
            leftTask.fork();
            long leftTaskResult = leftTask.join();
            long righTaskResult = rightTask.compute();
            result = righTaskResult + leftTaskResult;
            return result;
        }
    }

    public long additionRecursive(long base, long n){
        if(n == base) return base;
        else return n + additionRecursive(base, n - 1);
    }
}
