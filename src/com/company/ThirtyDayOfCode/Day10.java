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
            //convert to base2
            int cont = 1;
            int num = 1;
            String count = Integer.toBinaryString(n);
            // System.out.println(count);
            //count consective 1 values
            for (int i = 0; i < count.length()-1; i++) {
                if(count.charAt(i) == '1' && count.charAt(i+1) != '0'){
                    num++;
                    //System.out.println(true);
                }else if (num > cont){
                    cont = num;
                    num = 1;
                }else{
                    num = 1;
                }
            }

            //sout that number
            System.out.println(cont);


            bufferedReader.close();
        }
    }
}
