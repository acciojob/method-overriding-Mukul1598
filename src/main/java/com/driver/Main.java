package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
//      String ans = obj.meth();
//      System.out.println(ans);
        System.out.println(obj.meth());
    }

    public static class A {
        public String meth() {
//        String str = "Invoking method from class A";
//        return str;
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth() {
//        String str = "Invoking method from class A";
//        return str;
            return "Method is overridden in Extendend class B";
        }
    }
}