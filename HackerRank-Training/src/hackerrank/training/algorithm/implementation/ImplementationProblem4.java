package hackerrank.training.algorithm.implementation;

import java.util.Scanner;

public class ImplementationProblem4 {

    public int getTotalX(int[] a, int[] b){
        int result = a[0] + b[0];
        return result;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
