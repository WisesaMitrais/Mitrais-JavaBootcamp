package hackerrank.training.datastructure.arrays;

import java.util.*;

public class ArraysProblem4 {

    public int[] leftRotation(int[] a, int d) {
        int temp;
        int len = a.length;
        for(int idx = 1; idx <= d; idx++){
            temp = a[0];
            for(int idx2 = 1; idx2 < len; idx2++){
                a[idx2 - 1] = a[idx2];
            }
            a[len-1] = temp;
        }
        return a;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
}
