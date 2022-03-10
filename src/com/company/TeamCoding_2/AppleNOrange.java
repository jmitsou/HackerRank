package com.company.TeamCoding_2;

import java.util.List;

public class AppleNOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesThatHit = 0;
        int orangesThatHit = 0;

        for (int i = 0; i < apples.size(); i++) {
            if ((apples.get(i) + a) >= s && (apples.get(i) + a) <= t ){
                applesThatHit++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            if ((oranges.get(i) + b) >= s && (oranges.get(i) + b) <= t ){
                orangesThatHit++;
            }
        }

        System.out.println( applesThatHit);
        System.out.println( orangesThatHit);
    }

    public static void main(String[] args) {

    }
}
