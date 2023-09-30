package com.juaracoding.oop.polymorphsm;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(10,11);
        calculator.sum(10,23,14);
        calculator.sum(10.5,7.5);

        //Basic class dan Object
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.draw();

        //cara instance method overiding
        BangunDatar kotak = new Kotak();
        kotak.draw();

    }
}