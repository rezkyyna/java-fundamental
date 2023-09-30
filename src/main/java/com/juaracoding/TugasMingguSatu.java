package com.juaracoding;

public class TugasMingguSatu {
    public static void main(String[] args) {
        //nomor 1
        int qty = 2;
        float hargaBarang = 10000.0f;
        float jumlah = (hargaBarang * qty);
        System.out.println("Qty: " + qty);
        System.out.println("Harga: " + hargaBarang);
        System.out.println("Jumlah : " + jumlah);

        //nomor 2
        String name = "Java Juara";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(7,10));


    }
}
