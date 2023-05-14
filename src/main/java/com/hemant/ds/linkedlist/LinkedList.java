package com.hemant.ds.linkedlist;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList(T t) {
        final Node<T> newNode = getNewNode(t);
        head = newNode;
        tail = newNode;
        length++;
    }

    public LinkedList() {
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public void printList() {
        StringBuilder sb = new StringBuilder();
        if (length != 0) {
            Node<T> temp = head;
            while (temp != null) {
                sb.append(temp.data).append(",");
                temp = temp.nextNode;
            }
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append("[]");
        }
        System.out.println(sb);
    }

    //Extra auxiliary space O(n)
    public void printRecursive(Node<T> headNode) {
        if (headNode == null) {
            System.out.println();
            return;
        }
        System.out.print(headNode.data + " ");
        printRecursive(headNode.nextNode);
    }

    public void printRecursive() {
        printRecursive(head);
    }

    public void append(T t) {
        Node<T> newNode = getNewNode(t);
        if (length == 0) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
        tail = newNode; // now newNode became tail
        length++;
    }

    public Node<T> removeLast() {
        if (length == 0) return null;
        Node<T> temp = head; //for last node
        Node<T> pre = head;  // for second last node
        while (temp.nextNode != null) {
            pre = temp;  // end of loop pre become 2nd last node
            temp = temp.nextNode;
        }
        tail = pre;
        tail.nextNode = null;
        length--;
        if (length == 0) { // if LinkedList having 1 node
            head = null;
            tail = null;
        }
        return temp;
    }

    public void preAppend(T t) {
        Node<T> newNode = getNewNode(t);
        if (length == 0) {
            tail = newNode;
        } else {
            newNode.nextNode = head;
        }
        head = newNode; // now newNode replaced head
        length++;
    }

    private Node<T> getNewNode(T t) {
        return new Node<>(t);
    }

    public Node<T> removeFirst() {
        Node<T> temp = head;
        if (length == 0) return null;
        else if (length == 1) {//if single node in LinkedList then tail also point to null
            head = null;
            tail = null;
        } else {
            head = temp.nextNode;
            temp.nextNode = null;
        }
        length--;
        return temp;
    }

    //get indexed node
    public Node<T> get(int index) {
        if (index < 0 || index >= length) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode; // temp indexed time
        }
        return temp;
    }

    public boolean set(int index, T value) {  //update operation
        Node<T> temp = get(index); //get index value
        if (temp != null) {
            temp.data = value; //updating indexed data
            return true;
        }
        return false;
    }

    public boolean insert(int index, T t) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            preAppend(t);
            return true;
        }
        if (index == length) {
            append(t);
            return true;
        }
        Node<T> newNode = getNewNode(t);
        Node<T> temp = get(index - 1); //take temp node just before the insertion node
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        length++;
        return true;
    }

    public Node<T> remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node<T> prev = get(index - 1);
        Node<T> temp = prev.nextNode; //get deleting node
        prev.nextNode = temp.nextNode;
        temp.nextNode = null;
        length--;
        return temp;
    }


    public void reverse() {
        //swapping from head to tell
        Node<T> temp = head;
        head = tail;
        tail = temp;
        Node<T> after;
        Node<T> before = null;
        for (int i = 0; i < length; i++) {
            after = temp.nextNode;   //temp is tail
            temp.nextNode = before;
            before = temp;
            temp = after;
        }
    }

    static class Node<T> {
        private T data;  // to hold data or value
        private Node<T> nextNode; //to next node pointer

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }

    }

}
