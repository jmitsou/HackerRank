package com.company.ThirtyDayOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            if(n == 0){
                System.out.println(0);
            }
            int global = 0;
            int local = 0;
            //convert to base2
            String count = Integer.toBinaryString(n);
            //count consective 1 values
            for (int i = 0; i < count.length(); i++) {
                if(count.charAt(i) == '1'){
                    local++;
                }else if (count.charAt(i) == '0'){
                    local = 0;
                }
                if(local > global){
                    global = local;
                }
            }
            //sout that number
            System.out.println(global);
            bufferedReader.close();
        }
    }
}
