package com.juaracoding;

import java.util.Scanner;

public class buah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] buah = {"nanas", "apel", "jeruk", "pisang", "semangka"};
        System.out.println("cari data buah : ");
        String cari = input.nextLine();
        String kataTerpanjang = "";
        boolean ditemukan = false;
        int index = 0;

        for (int i = 0; i < buah.length; i++) {
            if(buah[1].equalsIgnoreCase(cari)){
                ditemukan = true;
                index = 1;
                break;
            }
        }
        if(ditemukan){
            System.out.println("buah "+cari+" ditemukan pada index ke- "+index);
        } else{
            System.out.println("buah "+cari+" tidak ditemukan");
        }
        for (String kata : buah) {
            if (kata.length() > kataTerpanjang.length()) {
                kataTerpanjang = kata;
            }
        }
        System.out.println("Kata terpanjang dalam array buah adalah: " + kataTerpanjang);
        }

    }

