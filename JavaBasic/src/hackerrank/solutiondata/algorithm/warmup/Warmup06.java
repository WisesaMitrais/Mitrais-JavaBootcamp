package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup06 {
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int[] type = new int[3];
        type[0] = 0; type[1] = 0; type[2] = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0) type[0]++;
            else if(arr[i] < 0) type[1]++;
            else type[2]++;
        }

        double[] result = new double[3];
        result[0] = (double) type[0] / n;
        result[1] = (double) type[1] / n;
        result[2] = (double) type[2] / n;
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
