package hackerrank.solutiondata.datastructure.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays03 {

    public void solution(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int Query[][] = new int[Q][3];
        for(int idx = 0; idx < Q; idx++){
            Query[idx][0] = scan.nextInt();
            Query[idx][1] = scan.nextInt();
            Query[idx][2] = scan.nextInt();
        }

        int lastAnswer = 0;
        ArrayList[] seqList = new ArrayList[N];
        int seq, value;
        for(int idx = 0; idx < N; idx++){
            seqList[idx] = new ArrayList<Integer>();
        }
        for(int idx = 0; idx < Q; idx++){
            seq = (Query[idx][1] ^ lastAnswer) % N;
            if(Query[idx][0] == 1){
                seqList[seq].add(Query[idx][2]);
            }else{
                value = Query[idx][2] % seqList[seq].size();
                lastAnswer = (Integer) seqList[seq].get(value);
                System.out.println(lastAnswer);
            }
        }
    }
}
