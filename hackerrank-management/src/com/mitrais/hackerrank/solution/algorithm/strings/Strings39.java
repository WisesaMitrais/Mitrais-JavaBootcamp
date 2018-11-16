package com.mitrais.hackerrank.solution.algorithm.strings;

import java.io.*;

public class Strings39 {

    private String superReducedString(String s) {
        StringBuilder strBuilder = new StringBuilder(s);
        boolean exist = false;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                strBuilder.delete(i, i+2);
                s = strBuilder.toString();
                exist = true;
            }
        }
        if(s.length() == 0 && exist == true) return "Empty String";
        else if(s.length() != 0 && exist == true) return superReducedString(s);
        else return s;
    }

    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        String result = superReducedString(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
