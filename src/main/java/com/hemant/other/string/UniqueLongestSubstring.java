package com.hemant.other.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueLongestSubstring {
    public static String findUniqueLongestSubstring(String input) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        String longest = "";

        for (int right = 0; right < input.length(); right++) {
            char currentChar = input.charAt(right);

            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
            } else {
                while (input.charAt(left) != currentChar) {
                    seen.remove(input.charAt(left));
                    left++;
                }
                left++;
            }

            String substring = input.substring(left, right + 1);
            if (substring.length() > longest.length()) {
                longest = substring;
            }
        }

        return longest;
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String input = "aaaaabbcdee";
        String uniqueLongestSubstring = findUniqueLongestSubstring(input);
        System.out.println("The unique longest substring in " + input + " is " + uniqueLongestSubstring);
        System.out.println(lengthOfLongestSubstring(input));
    }
}