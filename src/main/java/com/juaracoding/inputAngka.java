package com.juaracoding;

import java.util.Scanner;

public class inputAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { // Loop tak berujung
            System.out.print("Masukkan Angka: ");
            int angka = input.nextInt();

            if (angka == 0) {
                System.out.println("Program Keluar.");
                break; // Keluar dari loop jika angka 0 dimasukkan
            } else if (angka <= 10) {
                System.out.println("Angka yang di Input adalah "+angka);
            } else {
                System.out.println("Error");
            }
        }


    }
}
