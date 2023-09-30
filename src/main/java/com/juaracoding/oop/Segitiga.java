package com.juaracoding.oop;

public class Segitiga {
    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    double luas(){
        return 0.5 * alas*tinggi;
    }
    void draw(){
        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
