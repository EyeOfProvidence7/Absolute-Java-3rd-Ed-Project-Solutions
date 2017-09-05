package com.company.CH_1;

/**
 * Created by saidf on 8/27/2017.
 */
public class P10 {
    private static final double CAFFEINE_AMOUNT_IN_DRINK = 160;
    private static final double LETHAL_DOSE = 10000;

    public static void run(){
        System.out.println("It would take " + LETHAL_DOSE/CAFFEINE_AMOUNT_IN_DRINK + " drinks to kill you.");
    }
}
