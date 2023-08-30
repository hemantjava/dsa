package com.hemant.gfg.dsa.queue;

import com.hemant.gfg.dsa.stack.MyStack;

public class MyQueue<T> {

    Node<T> front, rear;
    int size;

    MyQueue() {}



    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (size() == 0){
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear  = newNode;
        }
        size++;
    }

    public Node<T> dequeue(){
        if (size == 0) return null;
        Node<T> temp = front;
       if (size == 1){
           front = rear = null;
       }else {
           front = temp.next;
           temp.next = null;
       }
       size--;
        return temp;
    }

    class Node<T> {
        T data; //store value
        Node<T> next; //store reference

        Node(T data) {
            this.data = data;
            //  next = null; // this one is optional
        }

    }
}
