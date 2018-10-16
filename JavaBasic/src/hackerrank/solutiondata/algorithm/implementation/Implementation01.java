package hackerrank.solutiondata.algorithm.implementation;

import java.util.Scanner;

public class Implementation01 {

    public int[] solve(int[] grades, int n){
        for(int i = 0; i < n; i++){
            if(grades[i] >= 38){
                if((grades[i] - 3) % 5 == 0){
                    grades[i] += 2;
                }else if((grades[i] - 4) % 5 == 0){
                    grades[i] += 1;
                }
            }
        }
        return grades;
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
