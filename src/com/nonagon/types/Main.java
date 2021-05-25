package com.nonagon.types;

public class Main {

    public static void main(String args[]){
        Grizzly grizzly = new Grizzly();
        System.out.println("A grizzly is a bear: " + (grizzly instanceof Bear));
        Bear bear = new Bear();
        System.out.println("A bear is a grizzly: " + (bear instanceof Grizzly));

        Bear bear2 = grizzly;
        System.out.println(bear2.getClass());

        //Narrow Casting
        byte b = (byte) (short) (char) (int) (long) (float) (double) 1;
        System.out.println(b);


        //widening casting
        double d = (double) (float) (long) (int) (char) (short) (byte) b;
        System.out.println(d);


    }


}
