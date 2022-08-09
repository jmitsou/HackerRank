package com.company.ThirtyDayOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int row = 0;
        int column = 0;
        int sum = 0;
        //find the all of hourglasses
        for (int i = 0; i < arr.get(row).size(); i++) {
            int pos = 0;
            //when pos reaches 3 reset sum
            if (pos == 3 ){

            }
            //for (int j = 1; j < arr.get(row).get(column).size()-1; j++) {

            //}
        }

        //sum = arr.get(row).get(column) + arr.get(row).get(column+1) + arr.get(row).get(column+2) + arr.get(row+1).get(column+1)+arr.get(row+2).get(column) + arr.get(row+2).get(column+1) + arr.get(row+2).get(column+2);

        //find the sum of each of the hour glasses

        //compare all the sums and print out the largest
        System.out.println(sum);
    }
}
