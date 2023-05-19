package com.hemant.other.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
        System.out.println(reverseString(""));
        System.out.println(reverseString(null));
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
}
