package com.hemant.ds.stack;

import java.util.Stack;

public class ValidateBraces {
    public static void main(String[] args) {

        System.out.println(validate("{[()]}"));
        System.out.println(validate("[]{}()"));
        System.out.println(validate("[]{})"));
        System.out.println(validate("(]"));

    }

    private static String validate(String input) {
        Stack<Character> q = new Stack<>();
        for (Character c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                q.push(c);
            else if (c == ']' || c == ')' || c == '}') {
                if (q.isEmpty() || !pair(q.pop(), c))
                    return "UNBALANCED";
            }
        }
        return q.isEmpty() ? "BALANCED" : "UNBALANCED";
    }


    private static boolean pair(char opening, char closing) {
        return (opening == '[' && closing == ']') || (opening == '{' && closing == '}') || (opening == '(' && closing == ')');
    }
}
