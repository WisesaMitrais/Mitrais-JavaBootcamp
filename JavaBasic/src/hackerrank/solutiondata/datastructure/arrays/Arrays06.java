package hackerrank.solutiondata.datastructure.arrays;

import java.util.Scanner;

public class Arrays06 {
    
    private int arrayManipulation(int a, int b, int k, int[] list, int biggestValue){
        for(int idx = a; idx <= b; idx++){
            list[idx-1] += k;
            if(list[idx-1] > biggestValue) biggestValue = list[idx-1];
        }
        return biggestValue;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] list = new int[n];
        int a, b, k;
        int biggestValue = 0;
        for(int i = 0; i < m; i++){
            a = in.nextInt();
            b = in.nextInt();
            k = in.nextInt();
            biggestValue = arrayManipulation(a, b, k, list, biggestValue);
        }
        in.close();
        System.out.println(biggestValue);
    }
}
