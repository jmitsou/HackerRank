package com.company.TeamCoding_2;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }

        return sum;
    }
}
