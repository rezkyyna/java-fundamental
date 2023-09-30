package com.juaracoding;
import java.util.ArrayList;
import java.util.Scanner;

class Pengguna {
    public String nama;
    public int umur;
    public String jenisKelamin;

    public Pengguna(String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}

public class ProgramMenu {
    public static void main(String[] args) {
        ArrayList<Pengguna> daftarPengguna = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan data pengguna");
            System.out.println("2. Tambah pengguna");
            System.out.println("3. Perbarui pengguna");
            System.out.println("4. Hapus pengguna");
            System.out.println("5. Keluar dari program");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDataPengguna(daftarPengguna);
                    break;
                case 2:
                    tambahPengguna(daftarPengguna, input);
                    break;
                case 3:
                    perbaruiPengguna(daftarPengguna, input);
                    break;
                case 4:
                    hapusPengguna(daftarPengguna, input);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 5);

        input.close();
    }

    public static void tampilkanDataPengguna(ArrayList<Pengguna> daftarPengguna) {
        if (daftarPengguna.isEmpty()) {
            System.out.println("Tidak ada data pengguna.");
        } else {
            System.out.println("Data Pengguna:");
            for (Pengguna pengguna : daftarPengguna) {
                System.out.println("Nama: " + pengguna.getNama() + " Umur: " + pengguna.getUmur() + " Jenis Kelamin(P/L): "
                + pengguna.getJenisKelamin());
            }
        }
    }

    public static void tambahPengguna(ArrayList<Pengguna> daftarPengguna, Scanner input) {
        System.out.print("Masukkan nama pengguna baru: ");
        String nama = input.next();
        System.out.print("Masukkan umur pengguna: ");
        int umur = input.nextInt();
        System.out.println("Jenis Kelamin: ");
        String jenisKelamin = input.next();
        Pengguna penggunaBaru = new Pengguna(nama, umur, jenisKelamin);
        daftarPengguna.add(penggunaBaru);
        System.out.println("Pengguna " + nama + " telah ditambahkan.");
    }

    public static void perbaruiPengguna(ArrayList<Pengguna> daftarPengguna, Scanner input) {
        if (daftarPengguna.isEmpty()) {
            System.out.println("Tidak ada data pengguna yang dapat diperbarui.");
        } else {
            System.out.print("Masukkan nama pengguna yang akan diperbarui: ");
            String nama = input.next();
            boolean ditemukan = false;

            for (Pengguna pengguna : daftarPengguna) {
                if (pengguna.getNama().equalsIgnoreCase(nama)) {
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = input.next();
                    System.out.print("Masukkan umur baru: ");
                    String jenisKelaminBaru = input.next();
                    int umurBaru = input.nextInt();
                    pengguna.setNama(namaBaru);
                    pengguna.setUmur(umurBaru);
                    pengguna.setJenisKelamin(jenisKelaminBaru);
                    System.out.println("Data pengguna berhasil diperbarui.");
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Nama pengguna tidak ditemukan.");
            }
        }
    }

    public static void hapusPengguna(ArrayList<Pengguna> daftarPengguna, Scanner input) {
        if (daftarPengguna.isEmpty()) {
            System.out.println("Tidak ada data pengguna yang dapat dihapus.");
        } else {
            System.out.print("Masukkan nama pengguna yang akan dihapus: ");
            String nama = input.next();
            boolean ditemukan = false;

            for (Pengguna pengguna : daftarPengguna) {
                if (pengguna.getNama().equalsIgnoreCase(nama)) {
                    daftarPengguna.remove(pengguna);
                    System.out.println("Data pengguna berhasil dihapus.");
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Nama pengguna tidak ditemukan.");
            }

        }
    }
}
