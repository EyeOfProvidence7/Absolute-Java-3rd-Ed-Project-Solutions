package com.company.CH_1;

/**
 * Created by saidf on 8/25/2017.
 */
public class P3 {
    private static final String FIRST = "hydro";
    private static final String LAST = "carbonic";

    private static String toPigLatin(String word){
        return Character.toUpperCase(word.charAt(1)) + word.substring(2) + word.charAt(0) + "ay ";
    }

    public static void run(){

        System.out.print(toPigLatin(FIRST));
        System.out.println(toPigLatin(LAST));
    }
}
