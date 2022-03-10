package com.company.TeamCoding_2;

import java.util.ArrayList;
import java.util.List;

public class Jumping_on_the_Clouds {

    public static int jumpingOnClouds(List<Integer> c){
        int numOfJumps = -1;

        for (int pos = 0; pos < c.size(); ){
            if ( pos + 2 < c.size() && c.get(pos + 2) == 0 ){
                pos = pos + 2;
            } else {
                pos++;
            }
            //System.out.println("Number of Jumps " + numOfJumps);
            System.out.println("Position " + pos);
            numOfJumps = numOfJumps + 1;
        }


        System.out.println("The safe number of jumps is " + numOfJumps);
        return numOfJumps;
    }

    public static void main(String[] args) {
        List<Integer> c = new ArrayList<Integer>();
        //0, 0, 1, 0, 0, 1, 0
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        //c.add(1);
        c.add(0);
        System.out.println("ArrayList : " + c.toString());
        jumpingOnClouds(c);
    }

}
