package com.juaracoding;

import java.util.ArrayList;

public class javaCollection {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Cars");
        //mengakses item=get
        System.out.println(cars.get(1));
        //mengubah item = set
        cars.set(0, "Toyota");
        System.out.println(cars);
        //menghapus item
        cars.remove(3);
        System.out.println(cars);
        //jumlah item pada collection = size
        System.out.println(cars.size());
        for (int i = 0; i < cars.size() ; i++) {
            System.out.println(cars.get(i));
        }
        for(String data:cars){
            System.out.println(data);
        }
    }
}
