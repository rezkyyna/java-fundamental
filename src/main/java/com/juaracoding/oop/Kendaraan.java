package com.juaracoding.oop;

import java.util.Date;

public class Kendaraan {
    public static void main(String[] args) {
        Car mobil = new Car("Pertalite"); //dalamkurung adalah parameternya string Car
        mobil.warna(); //buat manggil data warna dan mesin dari class Car
        mobil.mesin();

        System.out.println(mobil.getBahanBakar());
        System.out.println(mobil.getTahunPembuatan());


    }
}

//Menampilkan Date
// Date date = new Date(10000);
//  System.out.println(date);