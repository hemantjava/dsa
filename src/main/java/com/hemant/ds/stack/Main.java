package com.hemant.ds.stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>("Hemant");
        System.out.println(stack);
        stack.printStack();
        stack.push("Ritesh");
        stack.push("Dharam");
        System.out.println(stack);
        stack.printStack();
        System.out.println("========pop() operation========");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.printStack();

    }
}
