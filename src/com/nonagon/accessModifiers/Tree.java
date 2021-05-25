package com.nonagon.accessModifiers;

public class Tree {
    private static int nextId = 0;
    protected int treeId;
    protected int height;
    protected String scientificName;


    public Tree(){
        treeId = nextId;
        nextId++;
    }

    public int getTreeId() {
        return treeId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
}
