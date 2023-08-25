package com.hemant.java11;
class Parent{
    public String value ="Parent";

    public String getValue() {
        return value;
    }
}
class Chlid extends Parent{
    public String value ="Child";

    public String getValue() {
        return value;
    }
}
public class Main {
    public static void main(String[] args) {
        Parent child = new Chlid();
        System.out.println(child.value +""+ child.getValue());
    }
}
