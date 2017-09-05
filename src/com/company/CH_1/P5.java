package com.company.CH_1;

/**
 * Created by saidf on 8/27/2017.
 */
public class P5 {
    private static final String SENTENCE = "I hate you.";
    private static final String REPLACEE = "hate";
    private static final String REPLACER = "love";

    public static void run(){
        int position = SENTENCE.indexOf(REPLACEE);
        System.out.println(SENTENCE.substring(0, position) + REPLACER + SENTENCE.substring(position + REPLACEE.length()));
    }
}
