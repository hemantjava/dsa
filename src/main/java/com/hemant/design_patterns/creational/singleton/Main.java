package com.hemant.design_patterns.creational.singleton;

public class Main{
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());

        SingleTonMultiThreaded s3 = SingleTonMultiThreaded.getInstance();
        SingleTonMultiThreaded s4 = SingleTonMultiThreaded.getInstance();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode() == s4.hashCode());
    }
}
