package com.juaracoding;

public class array {
    public static void main(String[] args) {
        //cara 1
        int [] num = {3,6,3,1,6,3,4,1};
        System.out.println(num[0]);
        System.out.println(num[2]);
        System.out.println(num[5]);
        System.out.println("total elemen: "+ num.length);

        //cara 2

        //looping
        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
        for (int i=0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println();

        //for each looping
        for (String data : cars){
            System.out.println(data);
        }

        //array multidimensi
        int[][] numpie = {{1,2,3,4,5}, {6,7,8}}; //
        System.out.println(numpie[0][1]); //baris 1, kolom 2
        System.out.println(numpie[1][1]); //baris 2, kolom 2




        //contoh1
        int [][] myNumbers = {{1,2,3,4,5}, {6,7,8}};
        for (int i =0; i<myNumbers.length; i++){
            for(int j=0; j<myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }


//another array multidimensi
        int [] angka = new int[6];
        int[] myArray1 = {3,6,3,3,4,1};
        int[] myArray2 = {1,6};
        int insertAt = 3;
        int[] myArray3 = new int[myArray1.length+myArray2.length];

        for (int a =0; a<insertAt; a++) {
            myArray3[a] = myArray1[a];
        }
        for (int b = insertAt; b < insertAt + myArray2.length;b++) {
            myArray3[b] = myArray2[b-insertAt];
        }
        for (int k= insertAt + myArray2.length; k < myArray3.length; k++) {
            myArray3[k] = myArray1[k-myArray2.length];
        }

    }
}
