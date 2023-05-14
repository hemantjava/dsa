package com.hemant.ds.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack<Integer> stack = new Stack<>(6);
        stack.push(1);
        stack.push(1);
        stack.push(4);
        stack.printStack();
    }

    @Test
    void pop() {
        Stack<Integer> stack = new Stack<>(6);
        stack.push(1);
        stack.push(1);
        stack.push(4);
        stack.printStack();
        System.out.println(stack.pop().value);
        System.out.println("================");
        stack.printStack();
    }

    @Test
    void peek() {
        Stack<Integer> stack = new Stack<>(6);
        stack.push(1);
        stack.push(1);
        stack.push(4);
        stack.printStack();
        System.out.println(stack.peek());
        System.out.println("================");
        stack.printStack();
    }
}