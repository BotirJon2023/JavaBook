package org.example;

public class Main {

    public static void main(String[] args) {

        ImplementTheQueueDataStructure.Queue q = new ImplementTheQueueDataStructure.Queue();

        q.deQueue();


        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }


        q.enQueue(6);

        q.display();


        q.deQueue();

        q.display();

    }

}