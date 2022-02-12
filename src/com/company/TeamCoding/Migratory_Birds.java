package com.company.TeamCoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Migratory_Birds {

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birdMap = new HashMap<>();

        //sets keys in HashMap and fills in values to 0
        for (int i = 1; i <= 5; i++) {
            birdMap.put(i,0);
        }

        //Loops through keys and sets value to number of sightings
        for (int birdType: arr) {
             if (birdMap.containsKey(birdType)){
                 birdMap.put(birdType,birdMap.get(birdType) + 1);
             }
        }

        Map.Entry<Integer,Integer> maxMap = null;

        for(Map.Entry<Integer, Integer> entry : birdMap.entrySet()){
            //int firstNum = entry.getValue();
            //int secNum = maxMap.getValue();
            //< = -1
            // = 0
            //> = 1

            if (maxMap == null || entry.getValue().compareTo(maxMap.getValue()) > 0)
            {
                maxMap = entry;
            }
        }

        return maxMap.getKey();
    }
}
