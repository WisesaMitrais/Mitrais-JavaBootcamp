package hackerrank.training.algorithm.warmup;

import java.util.*;

public class WarmupProblem5 {

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int i = 0, j = n - 1;
        int diagRight = 0, diagLeft = 0;
        while(i < n){
            diagRight += a[i][i];
            diagLeft += a[i][j];
            i++;
            j--;
        }

        int result = diagRight - diagLeft;
        if(result < 0) result *= (-1);
        System.out.println(result);
    }
}
