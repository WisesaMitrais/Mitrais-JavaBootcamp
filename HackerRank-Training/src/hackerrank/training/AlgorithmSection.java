package hackerrank.training;

import hackerrank.training.algorithm.warmup.*;
import hackerrank.training.algorithm.implementation.*;

public class AlgorithmSection {
    
    public void callWarmupProblem(int stage){
        switch(stage){
            case 1:
                //Warmup:Easy -> 'Solve Me First'
                WarmupProblem1 WP1 = new WarmupProblem1();
                WP1.solution();
                break;
            case 2:
                //Warmup:Easy -> 'Simple Array Sum'
                WarmupProblem2 WP2 = new WarmupProblem2();
                WP2.solution();
                break;
            case 3:
                //Warmup:Easy -> 'Compare The Triplets'
                WarmupProblem3 WP3 = new WarmupProblem3();
                WP3.solution();
                break;
            case 4:
                //Warmup:Easy -> 'A Very Big Sum'
                WarmupProblem4 WP4 = new WarmupProblem4();
                WP4.solution();
                break;
            case 5:
                //Warmup:Easy -> 'Diagonal Difference'
                WarmupProblem5 WP5 = new WarmupProblem5();
                WP5.solution();
                break;
            case 6:
                //Warmup:Easy -> 'Plus Minus'
                WarmupProblem6 WP6 = new WarmupProblem6();
                WP6.solution();
                break;
            case 7:
                //Warmup:Easy -> 'Staircase'
                WarmupProblem7 WP7 = new WarmupProblem7();
                WP7.solution();
                break;
            case 8:
                //Warmup:Easy -> 'Mini-Max Sum'
                WarmupProblem8 WP8 = new WarmupProblem8();
                WP8.solution();
                break;
            case 9:
                //Warmup:Easy -> 'Birthday Cake Candles'
                WarmupProblem9 WP9 = new WarmupProblem9();
                WP9.solution();
                break;
            case 10:
                //Warmup:Easy -> 'Time Conversion'
                WarmupProblem10 WP10 = new WarmupProblem10();
                WP10.solution();
                break;
        }
    }
    
    public void callImplementationProblem(int stage){
        switch(stage){
            case 1:
                //Implementation:Easy -> 'Grading Students'
                ImplementationProblem1 IP1 = new ImplementationProblem1();
                IP1.solution();
                break;
            case 2:
                //Implementation:Easy -> 'Apple and Orange'
                ImplementationProblem2 IP2 = new ImplementationProblem2();
                IP2.solution();
                break;
            case 3:
                //Implementation:Easy -> 'Kangaroo'
                ImplementationProblem3 IP3 = new ImplementationProblem3();
                IP3.solution();
                break;
            case 4:
                //Implementation:Easy -> 'Between Two Sets'
                ImplementationProblem4 IP4 = new ImplementationProblem4();
                IP4.solution();
                break;
            case 5:
                //Implementation:Easy -> 'Breaking the Records'
                break;
            case 6:
                //Implementation:Easy -> 'Birthday Chocolate'
                break;
            case 7:
                //Implementation:Easy -> 'Divisible Sum Pairs'
                break;
            case 8:
                //Implementation:Easy -> 'Migratory Birds'
                break;
            case 9:
                //Implementation:Easy -> 'Day of the Programmer'
                break;
            case 10:
                //Implementation:Easy -> 'Bon Appetit'
                break;
        }
    }
}
