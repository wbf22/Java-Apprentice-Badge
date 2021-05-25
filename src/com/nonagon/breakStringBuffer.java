package com.nonagon;

public class breakStringBuffer {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        int counter = 0;

        try {
            while(true){
                stringBuffer.append('a');
                counter++;
            }
        } catch (VirtualMachineError e) {
            System.out.println("Broke after adding " + counter + " characters");
        }
        //603979774


    }

}
