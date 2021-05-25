package com.nonagon;

import java.util.Random;

public class breakStringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        try {
            while(true){
                stringBuilder.append('a');
                counter++;
            }
        } catch (VirtualMachineError e) {
            System.out.println("Broke after adding " + counter + " characters");
        }
        //603979774


    }
}
