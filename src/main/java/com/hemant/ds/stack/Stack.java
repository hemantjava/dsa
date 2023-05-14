package com.hemant.ds.stack;

public class Stack<T> {

    private Node<T> top;
    private int height;//private Node<T> bottom; not use in stack

    public Stack(T value) {
        Node<T> newTop = new Node<>(value);
        top = newTop;
        height = 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", height=" + height +
                '}';
    }

    class Node<T> {
        T value;
        Node<T> nextNode;

        Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }

    public void printStack() {
        StringBuilder sb = new StringBuilder();
        if (height == 0)
            sb.append("[]");
        Node<T> temp = top;
        while (temp != null) {
            sb.append(temp.value).append(" ");
            temp = temp.nextNode;
        }
        System.out.println(sb);
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (height == 0) //if stack is empty
            top = newNode;
        else {
            newNode.nextNode = top;
            top = newNode;    //now new node pointing top position
        }
        height++;
    }

    public Node<T> pop() {

        if (height == 0) return null;

        Node<T> temp = top;  //both refer top element
        top = top.nextNode;  // Now top pointing 2nd top element
        temp.nextNode = null; // removing 2nd last node reference
        height--;
        return temp;
    }

    public T peek() {
        Node<T> temp = top;
        if (height == 0) return null;
        return temp.value;
    }

    public int size() {
        return (height == 0) ? 0 : height;
    }
}