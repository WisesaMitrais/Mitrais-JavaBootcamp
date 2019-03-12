package com.mitrais.hackerrank.solution.algorithm.strings;

import java.io.*;
import java.util.*;

public class Strings46 {

    private int strongPassword(int n, String password) {
        String[] patterns = {".*[0-9]+.*", ".*[A-Z]+.*", ".*[a-z]+.*", ".*\\W+.*"};
        int minNumber = 0;
        for(int idx = 0; idx < 4; idx++){
            if(password.matches(patterns[idx]) == false) minNumber++;
        }
        if(n < 6){
            int remains = 6 - n;
            if(remains > minNumber) minNumber = remains;
        }
        return minNumber;
    }

    public void solution() throws IOException {
        final Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String password = scanner.nextLine();
        int answer = strongPassword(n, password);
        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
