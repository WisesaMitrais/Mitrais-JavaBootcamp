package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup09 {
    
    public int birthdayCakeCandles(int n, int[] ar) {
        int tallestValue = ar[0];
        for(int i = 1; i < n; i++){
            if(tallestValue < ar[i]){
                tallestValue = ar[i];
            }
        }

        int countTallestValue = 0;
        for(int i = 0; i < n; i++){
            if(tallestValue == ar[i]){
                countTallestValue++;
            }
        }

        return countTallestValue;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
