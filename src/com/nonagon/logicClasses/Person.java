package com.nonagon.logicClasses;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.nonagon.logicClasses.HeavenlyFather.pray;

public class Person {

    private BrainFunction brainFunction;
    private Hand leftHand;

    public Person(){
        brainFunction = new BrainFunction();
        leftHand = new Hand(brainFunction);
        Thread thread = new Thread(brainFunction);
        thread.start();
    }

    public void prayToHeavenlyFather(){
        pray("Please bless baby Tolby");
    }



    public Hand getLeftHand() {
        return leftHand;
    }
}


class BrainFunction implements Runnable {
    private Queue<String> sensoryDataQueue = new ArrayDeque<>();
    private boolean alive = true;

    @Override
    public void run() {
        while(alive){
            if(sensoryDataQueue.size() > 0){
                processSensoryData(sensoryDataQueue.remove());
            }
        }
    }

    public void sendSensoryData(String data){
        sensoryDataQueue.add(data);
    }


    private void processSensoryData(String data){
        System.out.println(data);
    };
}