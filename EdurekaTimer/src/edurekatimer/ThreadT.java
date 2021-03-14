/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edurekatimer;

import java.util.Random;

/**
 *
 * @author Andre
 */
public class ThreadT implements Runnable {

    private boolean stopRequested = false;

    public synchronized void requestStop() {
        this.stopRequested = true;
    }

    public synchronized boolean isStopRequested() {
        return this.stopRequested;
    }

    int count = 0;
    String name;//thread name
    int time;//time sleeping
    Random r = new Random(); //gen random time to sleep

    //constructor
    public ThreadT() {
        
    }

    public void run() {
        try {
            
            while(!isStopRequested()){
                count++;
            }

            setCount(count);
            
        } catch (Exception e) {
        }
    }
    
    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
