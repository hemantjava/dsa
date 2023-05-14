package com.hemant.stream;

import java.util.Optional;

public class SumOfNumbersFromString {
    public static void main(String[] args) {
    String string = "1k3j6n7b1b1b2";
        System.out.println(getIntSum(string));
    }

    private static int getIntSum(String string){
        return string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }
}
