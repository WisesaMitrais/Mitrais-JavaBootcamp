package com.mitrais.hackerrank.solution.algorithm.warmup;

import java.util.*;

public class Warmup10 {
    
    private String timeConversion(String s) {
        String hourDigit = s.substring(0, 2);
        String formatDigit = s.substring(s.length()-2, s.length());
        String sameDigit = s.substring(2, 8);
        int hourDigitInt = Integer.parseInt(hourDigit);
        if(formatDigit.equals("PM")){
            if(hourDigitInt == 12){
                return "12" + sameDigit;
            }else{
                hourDigitInt += 12;
                return hourDigitInt + "" + sameDigit;
            }
        }else{
            if(hourDigitInt == 12){
                return "00" + sameDigit;
            }else{
                return hourDigit + "" + sameDigit;
            }
        }
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
