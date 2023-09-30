package com.juaracoding;

public class longestWord {
    public static void main(String[] args) {
        String[] buah = {"Nanas", "Apel", "Jeruk", "Pisang", "Semangka"};

        String longestWord = "";

        for (String kata : buah) {
            if (kata.length() > longestWord.length()) {
                longestWord = kata;
            }
        }

        System.out.println("Kata terpanjang dalam array buah adalah: " + longestWord);
    }
}
