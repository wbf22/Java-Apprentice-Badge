package com.nonagon.overriding;


import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        ArrayList<Bird> birds = new ArrayList<>();

        birds.add(bird);
        birds.add(chicken);

        for(Bird b : birds){
            b.makeANoise();
        }



    }


}
