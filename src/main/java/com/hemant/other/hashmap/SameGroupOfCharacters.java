package com.hemant.other.hashmap;

import java.util.*;

public class SameGroupOfCharacters {
    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    public static List<List<String>> groupAnagrams(String[] input) {
        HashMap<String, List<String>> map = new LinkedHashMap<>();
        List<List<String>> ls = new ArrayList<>();

        for (String str : input) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortString = String.valueOf(ch);
            if (map.containsKey(sortString)) {
                map.get(sortString).add(str);
            } else {
                map.put(sortString, new ArrayList<>());
                map.get(sortString).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }

}
