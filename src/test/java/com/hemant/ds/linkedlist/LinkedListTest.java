package com.hemant.ds.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void append() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(3);
        list.printList();


    }

    @Test
    void removeLast() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(3);
        list.append(5);
        list.printList();
        System.out.println("==================");
        list.reverse();
        list.printList();
    }

    @Test
    void preAppend() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.preAppend(6);
    }

    @Test
    void removeFirst() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
      //  list.append(3);
       // list.append(5);
        list.printList();
        System.out.println("==================");
        list.printList();
    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void insert() {
    }

    @Test
    void remove() {
    }

    @Test
    void reverse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.printList();
        System.out.println("============after reverse============");
        list.reverse();
        list.printList();
    }
}