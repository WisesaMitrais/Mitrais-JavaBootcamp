package hackerrank.training.algorithm.warmup;

import java.util.*;

public class WarmupProblem10 {

    public String timeConversion(String s) {
        int len = s.length();
        String hourDigit = s.charAt(0)+""+s.charAt(1);
        String formatDigit = s.charAt(len-2)+""+s.charAt(len-1);
        String sameDigit = s.charAt(2)+""+s.charAt(3)+""+s.charAt(4)+""+s.charAt(5)+""+s.charAt(6)+""+s.charAt(7);

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
                return s.charAt(0) + "" + s.charAt(1) + "" + sameDigit;
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
