package com.hemant.ds.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Integer> queue = new Queue<>(1);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.printQueue();
    }

    @Test
    void dequeue() {
        Queue<Integer> queue = new Queue<>(1);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.printQueue();
        System.out.println("------------dequeue()------------");
        queue.dequeue();
        queue.printQueue();
    }
}