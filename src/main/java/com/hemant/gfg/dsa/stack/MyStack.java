package com.hemant.gfg.dsa.stack;

public class MyStack<T> {

    private Node<T> head;
    private int size;

    MyStack() {
        //head = null;
       // size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head; // 1st data head is null -> newNode.next = null
        head = newNode;
        size++;
    }

    public T peek() {
        return (head == null) ? null : head.data;
    }

    public T pop() {
        if (head == null)
            return null;
        Node<T> temp = head;
        T data = temp.data;
         head = temp.next;
         temp.next = null;
         size--;
        return data;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    class Node<T> {
        T data; //store value
        Node<T> next; //store reference

        Node(T data) {
            this.data = data;
          //  next = null; // this one is optional
        }

    }

    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();
        myStack.push('a');
        System.out.println(myStack.size);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
    }

}
