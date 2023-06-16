package com.hemant.other.list;


class ParentClass {
    protected void print() throws Exception {
        System.out.println("Print Parent");
    }

    public static void test() {
        System.out.println("Parent test");
    }
}



 class ChildClass extends ParentClass {
    public void print() throws Exception {
        System.out.println("Print child");
    }

    public static void test() {
        System.out.println("Child test");
    }
}



public class Test {
    public static void main(String[] args) {
        try {
            ParentClass obj= new ChildClass();
            obj.print();//Print
            obj.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
