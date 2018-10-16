package hackerrank.solutiondata.algorithm.implementation;

import java.util.Scanner;

public class Implementation02 {
    
    public void solution(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int appleResult = 0;
        for(int i = 0; i < m; i++){
            apple[i]  = a + apple[i];
            if(apple[i] >= s && apple[i] <= t){
                appleResult++;
            }
        }
        int orangeResult = 0;
        for(int i = 0; i < n; i++){
            orange[i] = b + orange[i];
            if(orange[i] >= s && orange[i] <= t){
                orangeResult++;
            }
        }
        System.out.println(appleResult);
        System.out.print(orangeResult);
    }
}
