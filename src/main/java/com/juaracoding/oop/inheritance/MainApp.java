package com.juaracoding.oop.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.name = "Admin";
        karyawan.gajiPokok = 8000000;
        System.out.println("Gaji Bersih: Rp. "+ karyawan.hitungPajak());

        Manager manager = new Manager();
        manager.name = "Manager";
        manager.gajiPokok = 10000000;
        System.out.println(manager.name);
        System.out.println("Gaji Bersih:Rp. "+manager.hitungPajak());





    }
}
