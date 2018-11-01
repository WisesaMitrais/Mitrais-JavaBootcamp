package com.mitrais.hackerrank.procedure.multithreading;

import java.util.*;

public class SimpleTimeThread implements Runnable {

    private final Thread timeThread;
    int[] time = {0, 0, 0, 0, 0, 0}; //For hh:mm:ss, ex: 08:23:12.

    public SimpleTimeThread(){
        this.timeThread = new Thread(this);
    }

    public void start(){
        timeThread.start();
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.print("\rTime " + time[0] + time[1] + ":" + time[2] + time[3] + ":" + time[4] + time[5]);
                time[5]++;
                for(int idx = 5; idx > 0; idx--) updateTime(idx);
                if((time[0] == 2) && (time[1] == 4)){
                    System.out.print("\rTime 24:00:00");
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }

    private void updateTime(int idx){
        if(idx % 2 != 0){
            if(time[idx] == 10){
                time[idx] = 0;
                time[idx - 1]++;
            }
        }else{
            if(time[idx] == 6){
                time[idx] = 0;
                time[idx - 1]++;
            }
        }
    }
}
