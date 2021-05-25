package com.nonagon.logicClasses;



public class Finger{

    private BrainFunction brainFunction;

    public Finger(BrainFunction brainFunction){
        this.brainFunction = brainFunction;
    }

    public void extendFinger(){

        brainFunction.sendSensoryData("Finger is now extended");
    }

}
