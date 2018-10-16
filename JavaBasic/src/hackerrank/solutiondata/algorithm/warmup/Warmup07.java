package hackerrank.solutiondata.algorithm.warmup;

import java.util.Scanner;

public class Warmup07 {

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n; j++){
                if(j >= i) System.out.print("#");
                else System.out.print(" ");
            }
            if(i != 1) System.out.println("");
        }
    }
}
