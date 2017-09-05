package com.company.CH_1;

/**
 * Created by saidf on 8/27/2017.
 */
public class P9 {
    private static final int FEET = 6;
    private static final int INCHES = 0;

    public static void run(){
        System.out.println("Ideal body weight: " + (110 + ((FEET-5)*12 + INCHES)*5) + " pounds.");
    }
}
