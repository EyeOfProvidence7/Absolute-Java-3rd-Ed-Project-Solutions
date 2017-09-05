package com.company.CH_1;

/**
 * Created by saidf on 8/25/2017.
 */
public class P2 {
    private static final int CANDY_BAR_COST = 10;
    private static final int GUMBALL_COST = 3;
    private static final int COUPONS = 75;

    public static void run(){
        System.out.println("You can buy " + COUPONS /CANDY_BAR_COST + " candy bars, ");
        System.out.println("and then " + (COUPONS % 10)/GUMBALL_COST + " more gumballs.");
    }

}
