package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup01 {
    
    private int solveMeFirst(int a, int b) {
        return a += b;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
    
}
