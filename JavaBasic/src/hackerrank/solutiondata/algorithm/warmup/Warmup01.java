package hackerrank.solutiondata.algorithm.warmup;

import java.util.*;

public class Warmup01 {
    
    private int solveMeFirst(int a, int b) {
        a += b;
        return a;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
    
}
