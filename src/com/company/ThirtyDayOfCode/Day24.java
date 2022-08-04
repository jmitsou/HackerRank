package com.company.ThirtyDayOfCode;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}

public class Day24 {
        public static Node removeDuplicates(Node head) {
            Node trav = head;
            while (trav.next != null){
                if(trav == trav.next){
                    trav = trav.next.next;
                }else {
                    trav = trav.next;
                }
            }

            return trav;
        }

}

//1,1,2
