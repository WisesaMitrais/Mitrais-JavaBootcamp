package hackerrank.training.datastructure.arrays;

import java.util.*;

public class ArraysProblem1 {

    public void solution() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int temp = 0;
        if(n % 2 == 0){
            int j = n-1;
            for(int i = 0; i < (n/2); i++){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            }
        }else{
            int j = n-1;
            for(int i = 0; i < (n/2); i++){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            }
        }

        for(int i = 0; i < n; i++){
            if(i == n-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+" ");
        }
    }
}
