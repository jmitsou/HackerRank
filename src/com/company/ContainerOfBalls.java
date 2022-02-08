package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContainerOfBalls {

    public static String queries(List<List<Integer>> queries){
        String answer = null;

        for (int container = 0 ; container < queries.size(); container++){

           List<Integer> cont = queries.get(container);
           //HashMap to contain the number of balls in each container
           HashMap<Integer, Integer> ballContainer = new HashMap<Integer, Integer>();

            for (int cap = 0; cap < cont.size(); cap++ ){
                //System.out.println(container + ":" + cont.get(cap));

                if (!ballContainer.containsKey(container)){
                    ballContainer.put(container,cont.get(cap));
                }
                else ballContainer.put(container,ballContainer.get(container) + cont.get(cap));

            }
            System.out.println("Bin: " + ballContainer);

        }

        return answer;
    }

}


/*        3
        1 3 1
        2 1 2
        3 3 3
        3
        0 2 1
        1 1 1
        2 0 0
        */
