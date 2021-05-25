package com.nonagon.logging;

import com.nonagon.Sauce;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Main {

    final static Logger log = Logger.getLogger(Main.class);

    public static void main(String args[]){

        log.error("error baby");
        log.warn("warn baby");
        log.info("info baby");
        log.debug("debug baby");


        Sauce hotSauce = new Sauce(7,"Utah");
        log.error("culprit=\"" + hotSauce.toString() + "\"");
        log.warn("culprit=\"" + hotSauce.toString() + "\"");
        log.info("culprit=\"" + hotSauce.toString() + "\"");
        log.debug("culprit=\"" + hotSauce.toString() + "\"");

    }


}
