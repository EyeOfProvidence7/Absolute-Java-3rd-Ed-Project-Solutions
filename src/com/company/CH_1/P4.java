package com.company.CH_1;

/**
 * Created by saidf on 8/26/2017.
 */
public class P4 {
    private static final double LETHAL_DOSE_MOUSE = 0.001;
    private static final double MOUSE_WEIGHT = 0.1;
    private static final double ENDING_WEIGHT = 70;
    private static final double SWEETNER_PERCENTAGE = 0.001;
    private static final double KILL_DOSE = (LETHAL_DOSE_MOUSE/MOUSE_WEIGHT)*ENDING_WEIGHT;

    public static void run() {
        System.out.println("Max diet coke drink volume = " + KILL_DOSE*(1/SWEETNER_PERCENTAGE) + " liters");
    }
}
