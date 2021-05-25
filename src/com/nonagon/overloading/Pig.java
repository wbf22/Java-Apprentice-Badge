package com.nonagon.overloading;

public class Pig {
    private boolean muddy;

    public Pig (){
        muddy = true;
    }

    public Pig(boolean muddy){
        this.muddy = muddy;
    }



    public void squeal(){
        System.out.println("ERRRK!");

    }

    public void squeal(int volume){

        StringBuilder stringBuilder = new StringBuilder("");
        for(int i = 1; i < volume; i++){
            stringBuilder.append("!");
        }

        System.out.println("ERRRK!" + stringBuilder.toString());

    }




}
