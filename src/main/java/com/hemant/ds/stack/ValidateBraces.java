package com.hemant.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidateBraces {
    public static void main(String[] args) {

        System.out.println(validate("{[()]}"));
        System.out.println(validate("[]{}()"));
        System.out.println(validate("[]{})"));
        System.out.println(validate("(]"));

    }

    private static String validate(String input) {
        Deque<Character> q = new ArrayDeque<>();
        for (Character c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                q.push(c);
            else {
                if (q.isEmpty()){
                    return "UNBALANCED";
                } else if (!pair(q.pop(),c)) {
                    return "UNBALANCED";
                }
            }
        }
        return q.isEmpty() ? "BALANCED" : "UNBALANCED";
    }


    private static boolean pair(char opening, char closing) {
        return (opening == '[' && closing == ']') || (opening == '{' && closing == '}') || (opening == '(' && closing == ')');
    }
}
