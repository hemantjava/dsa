package com.hemant.ds.binarysearchtree.recursion;

public class BST<T> {

    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;
        Node(T value) {
            this.value = value;
        }
    }

    public static <T> Node<T> insert(Node<T> root, T value) {
        if (root == null) {
            return new Node<>(value);
        }
      return root;
    }
    public static void main(String[] args) {

    }
}
