package com.nonagon;

import java.util.ArrayList;
import java.util.List;

public class Sauce {
    private int spiceLevel;
    private List<String> herbs;
    private boolean milkBased;
    private String origin;

    public Sauce(int spiceLevel, List<String> herbs, boolean milkBased, String origin) {
        this.spiceLevel = spiceLevel;
        this.herbs = herbs;
        this.milkBased = milkBased;
        this.origin = origin;
    }

    //spiceLevel
    public Sauce(int spiceLevel){
        this(spiceLevel, null, false, null);
    }
    public Sauce(int spiceLevel, List<String> herbs){
        this(spiceLevel, herbs, false, null);
    }
    public Sauce(int spiceLevel, boolean milkBased){
        this(spiceLevel, null, milkBased, null);
    }
    public Sauce(int spiceLevel, String origin){
        this(spiceLevel, null, false, origin);
    }
    public Sauce(int spiceLevel, List<String> herbs, boolean milkBased){
        this(spiceLevel, herbs, milkBased, null);
    }
    public Sauce(int spiceLevel, boolean milkBased, String origin){
        this(spiceLevel, null, milkBased, origin);
    }
    public Sauce(int spiceLevel, List<String> herbs, String origin){
        this(spiceLevel, herbs, false, origin);
    }

    //herbs
    public Sauce(List<String> herbs){
        this(0, herbs, false, null);
    }
    public Sauce(List<String> herbs, boolean milkBased){
        this(0, herbs, milkBased, null);
    }
    public Sauce(List<String> herbs, String origin){
        this(0, herbs, false, origin);
    }
    public Sauce(List<String> herbs, boolean milkBased, String origin){
        this(0, herbs, milkBased, origin);
    }

    //milkBase
    public Sauce(boolean milkBased){
        this(0, null, milkBased, null);
    }
    public Sauce(boolean milkBased, String origin){
        this(0, null, milkBased, origin);
    }

    //origin
    public Sauce(String origin){
        this(0, null, false, origin);
    }


    @Override
    public String toString() {
        return "Sauce{" +
                "spiceLevel=" + spiceLevel +
                ", herbs=" + herbs +
                ", milkBased=" + milkBased +
                ", origin='" + origin + '\'' +
                '}';
    }

    public static void main(String args[]){
        ArrayList<String> srirachaHerbs = new ArrayList<>();
        srirachaHerbs.add("garlic");
        srirachaHerbs.add("red chilis");
        Sauce sriracha = new Sauce(4, srirachaHerbs, "Si Racha, Thailand");
        System.out.println(sriracha.toString());

        ArrayList<String> ranchHerbs = new ArrayList<>();
        ranchHerbs.add("onion");
        Sauce ranch = new Sauce(ranchHerbs, true);
        System.out.println(ranch.toString());

        Sauce water = new Sauce("clouds");
        System.out.println(water.toString());



    }


}
