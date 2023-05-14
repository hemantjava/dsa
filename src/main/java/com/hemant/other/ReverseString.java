package com.hemant.other;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hemant kumar sahu"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(null));

    }

    private static String reverseString(String str) {
        if (str ==null || str.isBlank()) {
            return "";
        }
        final var chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) { //swapping
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
