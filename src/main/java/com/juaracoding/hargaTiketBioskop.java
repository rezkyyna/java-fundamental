package com.juaracoding;

import java.util.Scanner;

public class hargaTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahTiket, hargaTiket = 0;

        System.out.print("Masukkan Jumlah Tiket: ");
        jumlahTiket = input.nextInt();

        System.out.print("Masukkan Hari (Weekday/Weekend) untuk tiket : ");
        String hari = input.next();
        for (int i = 1; i <= jumlahTiket; i++) {


            if (hari.equalsIgnoreCase("Weekday")) {
                hargaTiket += 30000;
            } else if (hari.equalsIgnoreCase("Weekend")) {
                hargaTiket += 45000;
            } else {
                System.out.println("Hari Tidak valid, Silakan Coba Lagi.");
                i--;
                continue;
            }
        }

        System.out.println("Total Harga Tiket: Rp " + hargaTiket);
    }
}
