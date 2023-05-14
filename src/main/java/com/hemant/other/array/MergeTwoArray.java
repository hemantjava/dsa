package com.hemant.other.array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10};
        int[] b = {6, 7, 8, 9};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }
}
