package com.juaracoding.oop.inheritance;

public class Karyawan {
    String name;
    String adress;
    String jenisKelamin;
    double gajiPokok;

    double hitungPajak(){return gajiPokok - (0.1 * gajiPokok);}
}