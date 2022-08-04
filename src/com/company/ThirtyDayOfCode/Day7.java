package com.company.ThirtyDayOfCode;


import java.util.ArrayList;
import java.util.List;

public class Day7 {

    public static void inReverse(List<Integer> arr){
        for (int i = arr.size() -1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
