package com.nonagon.accessModifiers;

public class PineTree extends Tree{
    private int pineConeType;


    public PineTree(){

    }

    public int getPineConeType() {
        return pineConeType;
    }

    public void setPineConeType(int pineConeType) {
        this.pineConeType = pineConeType;
    }

    @Override
    public String toString() {
        return "PineTree{" +
                "pineConeType=" + pineConeType +
                ", treeId=" + treeId +
                ", height=" + height +
                ", scientificName='" + scientificName + '\'' +
                '}';
    }
}
