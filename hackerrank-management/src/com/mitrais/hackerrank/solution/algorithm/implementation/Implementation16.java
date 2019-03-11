package com.mitrais.hackerrank.solution.algorithm.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Implementation16 {

    private int[] breakingRecords(int[] scores) {
        int minScore = scores[0], maxScore = scores[0];
        int[] maxminSum = {0, 0};
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > maxScore) {
                maxScore = scores[i];
                maxminSum[0]++;
            }else if(scores[i] < minScore){
                minScore = scores[i];
                maxminSum[1]++;
            }
        }
        return maxminSum;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public void solution() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
