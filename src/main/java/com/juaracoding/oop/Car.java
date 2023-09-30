package com.juaracoding.oop;

public class Car {
    String bahanBakar;
    int tahunPembuatan = 2000;

    //constructor

    Car(String bahanBakar){ //didalam kurung adalah value
        this.bahanBakar = bahanBakar;
    }

    void warna(){
        System.out.println("Bewarna Merah");
    }
    void mesin(){
        System.out.println("Bermesin 1800 cc");
    }
    int getTahunPembuatan(){
        return tahunPembuatan;
    }
    String getBahanBakar(){
        return bahanBakar;
    }
}
