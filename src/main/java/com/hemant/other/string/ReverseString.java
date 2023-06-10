package com.hemant.other.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
        System.out.println(reverseString(""));
        System.out.println(reverseString(null));
        System.out.println(reverseStringStream(s));
        System.out.println(reverseWordsInStringStream("Hemant Kumar Sahu"));
    }

    public static String reverseString(String s) {
        if (s == null || s.isBlank()) {
            return s;
        }
        char[] charArray = s.toCharArray();
        int right = charArray.length - 1;
        int left = 0;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }

    public static String reverseStringStream(String input) {
        return IntStream.range(0, input.length()).mapToObj(i -> String.valueOf(input.charAt(input.length() - i - 1)))
                .collect(Collectors.joining());
    }

    public static String reverseWordsInStringStream(String input) {
        String[] split = input.split("\\s+");
       return IntStream.range(0,split.length).mapToObj(s ->String.valueOf(split[split.length -s -1])).collect(Collectors.joining(" "));
    }
}
