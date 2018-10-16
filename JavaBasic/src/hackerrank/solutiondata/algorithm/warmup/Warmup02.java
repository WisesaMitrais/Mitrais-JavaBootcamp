package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup02 {
    
    private int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += ar[i];
        }
        return sum;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
