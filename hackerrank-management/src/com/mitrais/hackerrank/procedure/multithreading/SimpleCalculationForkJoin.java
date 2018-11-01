package com.mitrais.hackerrank.procedure.multithreading;

import java.util.concurrent.*;

public class SimpleCalculationForkJoin extends RecursiveTask<Long> {

    private long result = 0;
    private int start, iteration, counter, parallelCutOff = 50;

    public SimpleCalculationForkJoin(int start, int iteration) {
        this.start = start;
        this.iteration = iteration;
    }

    @Override
    protected Long compute() {
        if((iteration - start) <= parallelCutOff){
            result = additionRecursive(start, iteration);
            return result;
        }else{
            int middleIteration = getMiddleIteration(start, iteration);
            System.out.println(start + " - " + (middleIteration - 1) + " AND " + (middleIteration) + " - " + iteration);
            SimpleCalculationForkJoin leftTask = new SimpleCalculationForkJoin(start, middleIteration - 1);
            SimpleCalculationForkJoin rightTask = new SimpleCalculationForkJoin(middleIteration, iteration);
            leftTask.fork();
            result = leftTask.join() + rightTask.compute();
            return result;
        }
    }

    public long additionRecursive(int start, int iteration){
        if(start == iteration) return start;
        else return start + additionRecursive(start + 1, iteration);
    }

    public int getMiddleIteration(int start, int iteration){
        counter = 0;
        for(int i = start; i <= iteration; i++) counter++;
        counter /= 2;
        return start + counter;
    }
}
