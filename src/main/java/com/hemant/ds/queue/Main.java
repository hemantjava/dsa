package com.hemant.ds.queue;

public class Main {

    public static void main(String[] args) {

        Queue<Character> queue = new Queue<>('A');
        queue.enqueue('G');
        queue.enqueue('C');
        System.out.println("=======enqueue()========== ");
        System.out.println(queue);
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println("=======dequeue()========== ");
        System.out.println(queue);
        queue.printQueue();

    }
}
