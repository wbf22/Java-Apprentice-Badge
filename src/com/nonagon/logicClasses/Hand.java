package com.nonagon.logicClasses;

import java.util.ArrayList;

public class Hand{
    private ArrayList<Finger> fingers;
    private BrainFunction brainFunction;

    public Hand(BrainFunction brainFunction){
        fingers = new ArrayList<>();
        Finger thumb = new Finger(brainFunction);
        Finger index = new Finger(brainFunction);
        Finger middle = new Finger(brainFunction);
        Finger ring = new Finger(brainFunction);
        Finger pinky = new Finger(brainFunction);
        fingers.add(thumb);
        fingers.add(index);
        fingers.add(middle);
        fingers.add(ring);
        fingers.add(pinky);
        this.brainFunction = brainFunction;
    }

    public void openHand(){
        brainFunction.sendSensoryData("Hand opening");
        for(Finger fin : fingers){
            fin.extendFinger();
        }
        brainFunction.sendSensoryData("Hand opened");

    }


}
