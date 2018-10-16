package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup04 {
    
    private long aVeryBigSum(int n, long[] ar) {
        long rslt = 0;
        for(int i = 0; i < n; i++){
            rslt += ar[i];
        }
        return rslt;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
