package com.juaracoding;

public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

            //pola kotak 5*5
        int sisi = 5;
for (int i = 0; i<sisi; i++) {
    for(int j=0; j< sisi; j++){
        System.out.print("*");
    }
    System.out.println();
}
//segitigasikusiku
for(int i = 0; i <= sisi; i++){
    for(int j=1; j<=i; j++) { //true
        System.out.print("*");
    }
    System.out.println();
}

        for (int i = 1; i <= sisi ; i++) {
            for(int j=sisi; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
//whileloop
        int x = 0;
        while(x<5) {
            System.out.print(x);
            x++;
        }

        int jumlahAnak = 3;

        do {

            jumlahAnak ++;

        }while(jumlahAnak<=2);

        System.out.print("Jumlah anak sekarang = "+jumlahAnak);
}
}
