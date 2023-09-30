package com.juaracoding;

public class Method {
    public static void main(String[] args) {

        //bintang
        kotak(5);
        kotak(3);
//pajak
        double penghasilanPerempuan = 8000;
        double penghasilanLakiLaki = 9000;

        double pajakPerempuan = hitungPajak(penghasilanPerempuan, "perempuan");
        double pajakLakiLaki = hitungPajak(penghasilanLakiLaki, "laki-laki");

        System.out.println("Pajak perempuan: $" + pajakPerempuan);
        System.out.println("Pajak laki-laki: $" + pajakLakiLaki);

    }

    //metode bintang
    static void kotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //method return menghitung pajak penghasilan
    public static double hitungPajak(double penghasilan, String jenisKelamin) {
        double pajak = 0;

        if (penghasilan > 7000) {
            if (jenisKelamin.equals("perempuan")) {
                pajak = penghasilan * 0.05; // Pajak 5% untuk perempuan
            } else if (jenisKelamin.equals("laki-laki")) {
                pajak = penghasilan * 0.10; // Pajak 10% untuk laki-laki
            }
        }

        return pajak;

    }
}