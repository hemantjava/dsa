package com.hemant.ds.binarysearchtree;

//TimeComplexity
public class BinarySearchTree {

     Node rootNode; //head

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        rootNode = newNode;
    }

    public BinarySearchTree() {

    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "rootNode=" + rootNode +
                '}';
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
            return true;
        }
        Node temp = rootNode;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    //Recursive call methods

    public boolean rContains(int value) {
        return rContains(rootNode, value);
    }

    private boolean rContains(Node node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;
        if (value < node.value) return rContains(node.left, value);
        return rContains(node.right, value);
    }
 public Node rInsert(int value){
        return rInsert(rootNode, value);
 }
 private Node rInsert(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.value) {
            node.left = rInsert(node.left, value);
        } else if (value > node.value) {
            node.right = rInsert(node.right, value);
        }
        return node;
 }

    static class Node {
         int value;
         Node left;
         Node right;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
