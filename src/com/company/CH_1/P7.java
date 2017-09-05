package com.company.CH_1;

/**
 * Created by saidf on 8/27/2017.
 */
public class P7 {
    private static final int SECONDS = 50391;

    public static void run(){
        System.out.println(SECONDS/3600 + " hours, " + (SECONDS % 3600)/60 + " minutes, and " + (SECONDS % 60) + " seconds. ");
    }
}
