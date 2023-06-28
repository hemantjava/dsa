package com.hemant.other.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        System.out.println("Before:"+nums);//Before:[1, 2, 3, 4, 4, 5, 1]
        removeDuplicates(nums);
        System.out.println("After:"+nums);//After:[1, 2, 3, 4, 5]
    }

    public static void removeDuplicates(List<Integer> nums) {
        int size = nums.size();
        if (size < 2) {
            return;
        }

        int index = 0;
        while (index < size) {
            int current = nums.get(index);
            int innerIndex = index + 1;
            while (innerIndex < size) {
                if (nums.get(innerIndex) == current) {
                    nums.remove(innerIndex);
                    size--;
                } else {
                    innerIndex++;
                }
            }
            index++;
        }
    }
}
