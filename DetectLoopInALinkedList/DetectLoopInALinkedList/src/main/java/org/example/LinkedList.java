package org.example;

public class LinkedList {


    Node head;


    static class Node {
        int value;

        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public boolean checkLoop() {


        Node first = head;
        Node second = head;

        while (first != null && first.next != null) {


            first = first.next.next;


            second = second.next;


            if (first == second) {
                return true;
            }
        }

        return false;
    }
}
