package com.nonagon;

public class ParamTypesToMethod {


    public void method(int value, Box reference, final String superBox){
        value = value - 1;
        reference.setSize(reference.getSize() / 2);
        //superBox = new Box(1);
        //superBox = "daddle";

    }



    public static void main(String args[]){
        int value = 1;
        Box reference = new Box(10);
        final Box superBox =  new Box(20);
        String diddle =  "diddle";

        ParamTypesToMethod paramTypesToMethod = new ParamTypesToMethod();
        paramTypesToMethod.method(value, reference, diddle);
        System.out.println(value);
        System.out.println(reference);
        System.out.println(superBox);

    }


}

class Box{
    int size;

    public Box(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }
}