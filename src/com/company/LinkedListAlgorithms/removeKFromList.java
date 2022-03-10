package com.company.LinkedListAlgorithms;

public class removeKFromList {
    int n= 4;

    static int solution(int n) {
        int temp[] =  new int[n + 2];

        temp[0] = 0;
        temp[1] = 1;

        int total = 1;

        for(int i = 2; i <= n; i++){
            temp[i] = temp[i -1] + temp[i-2];
            total += temp[i];
        }
        System.out.println(total);
        return total;

    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
