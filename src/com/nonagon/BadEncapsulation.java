package com.nonagon;

import java.util.ArrayList;
import java.util.Random;

public class BadEncapsulation {
    public double squareWidth = 4;
    public double radius = squareWidth/2;
    public ArrayList<Point> pointsTotal;
    public ArrayList<Point> pointInCircle;


    public double calculatePie(int numSamples){
        Long lastPrintTime = System.currentTimeMillis();

        pointsTotal = new ArrayList<>();
        pointInCircle = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numSamples; i++){
            double x =  squareWidth * random.nextDouble() - radius;
            double y =  squareWidth * random.nextDouble() - radius;
            Point p = new Point(x, y);
            double dist = p.calcDistFromOrigin();
            if (dist <= radius){
                pointInCircle.add(p);
            }
            pointsTotal.add(p);

            //shows progress of calculation
            if((System.currentTimeMillis() - lastPrintTime) > 1000){
                lastPrintTime = System.currentTimeMillis();
                System.out.println(Math.round((new Double(i) / numSamples) * 100) + "%" );
            }

        }


        return 4 * (new Double(pointInCircle.size())/new Double(pointsTotal.size()));

    }

    public boolean calculatePoint(){
        return false;
    }


    public class Point {
        public double x;
        public double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double calcDistFromOrigin(){
            return Math.sqrt(x*x + y*y);
        }

    }

    public static void main(String args[]){
        BadEncapsulation goodEncapsulation = new BadEncapsulation();
        System.out.println(goodEncapsulation.calculatePie(10000000));
    }

}
