package com.company.CH_1;

/**
 * Created by saidf on 8/27/2017.
 */
public class P8 {
    private static final double DISTANCE = 180;
    private static final double TIME = 20.5;
    private static final double AVERAGE_SPEED = DISTANCE/TIME;

    public static void run(){
        System.out.println("This program calculates vehicle average speed given a time and distance travelled.");
        System.out.println("Car average speed is " + AVERAGE_SPEED + " miles per hour");
    }
}
