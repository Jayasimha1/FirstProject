package com.bell.b11.day1.day10;

import java.util.Arrays;

public class LetterRepeat {
    public static void main(String[] args){

        String str= "This is a java program";
        int[] counts = new int[(int) Character.MAX_VALUE];

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println("Number of " + (char) i + ": " + counts[i]);

        }
    }
}
