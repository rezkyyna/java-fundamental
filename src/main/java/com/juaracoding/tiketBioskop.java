import java.util.Scanner;

public class tiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan hari (Weekday/Weekend): ");
            String hari = input.next();

            if (hari.equalsIgnoreCase("Weekday")) {
                System.out.println("Harga tiket masuk: Rp. 30.000");
            } else if (hari.equalsIgnoreCase("Weekend")) {
                System.out.println("Harga tiket masuk: Rp. 45.000");
            } else {
                System.out.println("Hari yang dimasukkan tidak valid. Coba lagi.");
                continue; // Mengulangi loop jika input tidak valid
            }

            break; // Keluar dari loop setelah mendapatkan input yang valid
        }

        input.close();
    }
}
