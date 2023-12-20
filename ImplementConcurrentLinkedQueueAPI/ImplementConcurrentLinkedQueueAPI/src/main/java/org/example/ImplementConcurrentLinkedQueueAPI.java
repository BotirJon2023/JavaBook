package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementConcurrentLinkedQueueAPI<E> {
    private ImplementConcurrentLinkedQueueAPI<E> concurrentLinkedQueue;

    /**
     * Creates a ConcurrentLinkedQueue that is initially empty.
     **/
    public ImplementConcurrentLinkedQueueAPI() {
        concurrentLinkedQueue = new ImplementConcurrentLinkedQueueAPI<>();
    }

    /**
     * Creates a ConcurrentLinkedQueue initially containing the elements of the
     * given collection, added in traversal order of the collection's iterator.
     **/
    public ImplementConcurrentLinkedQueueAPI(Collection<? extends E> c) {
        concurrentLinkedQueue = new ImplementConcurrentLinkedQueueAPI<>(c);
    }

    /**
     * Inserts the specified element at the tail of this queue.
     **/
    public boolean add(E e) {
        return concurrentLinkedQueue.add(e);
    }

    /**
     * Returns true if this queue contains the specified element.
     **/
    public boolean contains(Object o) {
        return concurrentLinkedQueue.contains(o);
    }

    /**
     * Returns an iterator over the elements in this queue in proper sequence.
     **/
    public Iterator<E> iterator() {
        return concurrentLinkedQueue.iterator();
    }

    /**
     * Inserts the specified element at the tail of this queue.
     **/
    public boolean offer(E e) {
        return concurrentLinkedQueue.offer(e);
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null
     * if this queue is empty.
     **/
    public E peek() {
        return concurrentLinkedQueue.peek();
    }

    /**
     * Retrieves and removes the head of this queue, or returns null if this
     * queue is empty.
     **/
    public E poll() {
        return concurrentLinkedQueue.poll();
    }

    /**
     * Removes a single instance of the specified element from this queue, if it
     * is present.
     **/
    public boolean remove(Object o) {
        return concurrentLinkedQueue.remove(o);
    }

    /**
     * Returns the number of elements in this queue.
     **/
    public int size() {
        return concurrentLinkedQueue.size();
    }


    public Object[] toArray() {
        return concurrentLinkedQueue.toArray();
    }


    public <T> T[] toArray(T[] a) {
        return concurrentLinkedQueue.toArray(a);
    }

    public static void main(String... arg) {
        ImplementConcurrentLinkedQueueAPI<Integer> concurrentLinkedQueue = new ImplementConcurrentLinkedQueueAPI<Integer>();
        concurrentLinkedQueue.add(100);
        concurrentLinkedQueue.add(200);
        concurrentLinkedQueue.add(300);
        concurrentLinkedQueue.add(400);
        concurrentLinkedQueue.add(500);

        System.out.println("the elements of the arrayblockingqueue is ");
        Iterator<Integer> itr = concurrentLinkedQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        concurrentLinkedQueue.offer(600);
        concurrentLinkedQueue.offer(700);
        System.out.println("the peak element of the concurrentLinkedQueue is(by peeking) "
                + concurrentLinkedQueue.peek());
        System.out.println("the peak element of the concurrentLinkedQueue is(by polling) "
                + concurrentLinkedQueue.poll());
        System.out.println("element 300 removed " + concurrentLinkedQueue.remove(300));
        System.out.println("the concurrentLinkedQueue contains 400 :"
                + concurrentLinkedQueue.contains(400));
        System.out.println("the hash concurrentLinkedQueue contains 100 :"
                + concurrentLinkedQueue.contains(100));
        System.out.println("the size of the concurrentLinkedQueue is "
                + concurrentLinkedQueue.size());
    }
}