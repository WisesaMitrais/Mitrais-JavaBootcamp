package hackerrank.solutiondata.algorithm.implementation;

import java.util.Scanner;

public class Implementation02 {
    
    private int[] appleAndOrange(int[] apple, int[] orange, int[] data){
        int[] result = {0, 0};
        for(int i = 0; i < data[4]; i++){
            apple[i]  += data[2];
            if(apple[i] >= data[0] && apple[i] <= data[1]) result[0]++;
        }
        for(int i = 0; i < data[5]; i++){
            orange[i] += data[3];
            if(orange[i] >= data[0] && orange[i] <= data[1]) result[1]++;
        }
        return result;
    }
    
    public void solution(){
        Scanner in = new Scanner(System.in); 
        //s = data[0], t = data[1], a = data[2]. b = data[3], m = data[4], n = data[5].
        int[] data = new int[6];
        for(int i = 0; i < data.length; i++){
            data[i] = in.nextInt();
        }
        int[] apple = new int[data[4]];
        for(int apple_i=0; apple_i < data[4]; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[data[5]];
        for(int orange_i=0; orange_i < data[5]; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(apple, orange, data); 
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
