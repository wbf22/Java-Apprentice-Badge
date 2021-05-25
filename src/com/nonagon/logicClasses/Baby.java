package com.nonagon.logicClasses;

import static com.nonagon.logicClasses.HeavenlyFather.pray;

public class Baby extends Person{

    public void cry(){
        System.out.println("baby is crying");
    }

    @Override
    public void prayToHeavenlyFather(){
        cry();
        pray("I feel sad");
    }

}


