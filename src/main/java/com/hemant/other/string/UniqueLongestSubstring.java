package com.hemant.other.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueLongestSubstring {

    public static void main(String[] args) {
        String input = "aaaaabbcdee";//bcde
      //  findUniqueLongestSubstring(input);
        String string = "java";
        findUniqueLongestSubstring(string);
    }

    private static void findUniqueLongestSubstring(String input) {
        String longestSubString = "";
        int lengthOfLongestSubstring = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
            } else {
                i = map.get(chars[i]); //start from exist character
                map.clear();
            }

            if (map.size() > lengthOfLongestSubstring) {
                lengthOfLongestSubstring = map.size();
                longestSubString = map.keySet().stream().map(String::valueOf).collect(Collectors.joining());
            }
        }

        System.out.println("longestSubstring: " + longestSubString);
        System.out.println("lengthOfLongestSubstring: " + lengthOfLongestSubstring);
    }
}