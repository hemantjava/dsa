package com.hemant.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(4);
        ll.printList();
        System.out.println(ll);
        ll.append(5);
        ll.printList();
        System.out.println(ll);
        System.out.println("removed from end:"+ll.removeLast());
        ll.printList();
        System.out.println(ll);
        ll.preAppend(7);
        ll.printList();
        System.out.println(ll);
        System.out.println("removed from first:"+ll.removeFirst());
       // System.out.println("removed from first:"+ll.removeFirst());
        ll.printList();
        System.out.println(ll);
        System.out.println(ll.get(0));
        ll.preAppend(7);
        ll.preAppend(5);
        System.out.println(ll);
        ll.printList();
        System.out.println(ll.insert(1,9));
        System.out.println(ll);
        ll.printList();
        System.out.println(ll.remove(2));// Node{data=7, nextNode=null}
        System.out.println(ll.set(2,6)); //update operation
        System.out.println(ll);
        ll.printList();
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        ll.printList();
        ll.preAppend(7);
        ll.preAppend(5);
        System.out.println(ll);
        ll.printList();
        ll.reverse();
        System.out.println(ll);
        ll.printList();
    }
}
