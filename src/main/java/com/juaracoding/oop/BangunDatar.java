package com.juaracoding.oop;

public class BangunDatar {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(8);
        System.out.println("luas kotak: "+kotak.luas());
        kotak.draw();
        kotak.sisi= 10;
        kotak.draw();

        Segitiga segi = new Segitiga(12,6);
        System.out.println("luas segitiga: "+segi.luas());
        segi.draw();


    }
}
