package com.nonagon.virtualMethods;

import java.util.ArrayList;

public abstract class AI {


    public abstract void think();




    public static void main(String args[]){
        Jerry jerry = new Jerry();
        Jenny jenny = new Jenny();

        ArrayList<AI> ais = new ArrayList<>();
        ais.add(jerry);
        ais.add(jenny);

        for(AI ai : ais){
            ai.think();
        }


    }


}
