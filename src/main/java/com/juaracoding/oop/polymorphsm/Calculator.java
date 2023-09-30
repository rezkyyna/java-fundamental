package com.juaracoding.oop.polymorphsm;

public class Calculator {

    //method overloading
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}
