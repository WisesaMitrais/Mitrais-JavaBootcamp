package hackerrank.solutiondata.datastructure.arrays;

import java.util.Scanner;

public class Arrays02 {
    
    private int twoDArraysDS(int[][] arr){
        int biggestSumHourglass = -36, sumHourglass = -9;
        for(int height = 0; height < 4; height++){
            for(int width = 0; width < 4; width++){
                sumHourglass = arr[height][width] + arr[height][width+1] + arr[height][width+2] + arr[height+1][width+1]
                        + arr[height+2][width] + arr[height+2][width+1] + arr[height+2][width+2];
                if(sumHourglass > biggestSumHourglass){
                    biggestSumHourglass = sumHourglass;
                }
            }
        }
        return biggestSumHourglass;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        System.out.println(twoDArraysDS(arr));
    }
}
