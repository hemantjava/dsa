package com.hemant.other.list;


import java.util.ArrayList;
import java.util.List;

public class PrintListDataInGivenPgeSize {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            ls.add("P" + i);
        }
        int N = 10;
        printChks(ls, N);
    }

    private static void printChks(List<String> list, int N) {
        for (int i = 0; i < list.size(); i += N) {
            List<String> sublist = list.subList(i, Math.min(i + N, list.size()));
            System.out.println(sublist);
        }
    }
}
