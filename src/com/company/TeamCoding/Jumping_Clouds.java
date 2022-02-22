package com.company.TeamCoding;

//create HashMap with 2 keys
//create variable for energy lvl set to 100
//loop through int array by var k (jump length) and minus energy by 1 for cumulus clouds and 2 for thunderclouds

public class Jumping_Clouds {


    public int jumpingOnClouds(int[] c, int k) {
        int energyLvl = 100;

        for (int i = 0; i < c.length ; i++) {
            int n = c.length;
            int move = (i + k) % n;
            System.out.println("move " + move + " | i " + i + " | c " + c[i] );

            if (c[i] == 0){
                energyLvl--;
            } if(c[i] == 1){
                energyLvl = energyLvl - 2;
            }
            System.out.println(energyLvl);
        }
       return energyLvl;
    }
}
