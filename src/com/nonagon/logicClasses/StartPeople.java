package com.nonagon.logicClasses;


public class StartPeople {
    private static Person MrJohnson;
    private static Baby babyTolby;

    public static void main(String args[]){

        MrJohnson = new Person();
        babyTolby = new Baby();

        Hand leftHandJohnson = MrJohnson.getLeftHand();
        leftHandJohnson.openHand();

        Hand leftHandTolby = babyTolby.getLeftHand();
        leftHandTolby.openHand();

        babyTolby.prayToHeavenlyFather();
        MrJohnson.prayToHeavenlyFather();

    }

}
