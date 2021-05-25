package com.nonagon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {

    public static void main(String args[]){
        //checked exceptions
        makeCheckedExceptions();

        //unchecked exceptions
        makeUncheckedExceptions();


    }



    private static void makeCheckedExceptions() {
        try{
            File file = new File("fake path");
            Scanner scanner = new Scanner(file);

        }catch (IOException e){
            System.out.println(e.getClass() + " is an checked exception");
        }




    }



    private static void makeUncheckedExceptions() {
        try{
            String s = null;
            s.charAt(1);

        }catch (NullPointerException e){
            System.out.println(e.getClass() + " is an unchecked exception");
        }

        try{
            int[] ints = new int[2];
            int t = ints[3];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass() + " is an unchecked exception");
        }



    }




}
