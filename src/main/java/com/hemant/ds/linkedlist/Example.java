package com.hemant.ds.linkedlist;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.printList();
        list.append("hemant");
        list.append("sahu");
        list.printList();
        list.printRecursive();
        list.preAppend("Mr.");
        list.printRecursive();
    }
}
