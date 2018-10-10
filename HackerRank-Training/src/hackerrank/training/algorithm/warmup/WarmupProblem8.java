package hackerrank.training.algorithm.warmup;

import java.util.*;

public class WarmupProblem8 {

    public void solution(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long[] result = new long[5];
        for(int i = 0; i < 5; i++){
            result[i] = 0;
            for(int j = 0; j < 5; j++){
                if(j != i){
                    result[i] += arr[j];
                }
            }
        }

        long temp = 0;
        for(int i = 0; i < 4; i++){
            if(result[i] > result[4]){
                temp = result[i];
                result[i] = result[4];
                result[4] = temp;
            }
        }
        for(int i = 1; i < 4; i++){
            if(result[i] < result[0]){
                temp = result[i];
                result[i] = result[0];
                result[0] = temp;
            }
        }

        System.out.print(result[0]+" ");
        System.out.print(result[4]);
    }
}
