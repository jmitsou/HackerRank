package com.company.ThirtyDayOfCode;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String even = "";
        String odd = "";

        for (int i = 0; i < num; i++) {
            even = "";
            odd = "";
            String value = scan.next();

            for (int j = 0; j < value.length(); j++) {
                // get current index compare to modulus to see if the index is even or odd
                // then concatenate to even string value or odd string value
                if (j % 2 == 0){
                    even = even.concat(String.valueOf(value.charAt(j)));
                } else {
                    odd = odd.concat(String.valueOf(value.charAt(j)));
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
