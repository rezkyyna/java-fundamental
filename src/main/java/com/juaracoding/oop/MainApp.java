package com.juaracoding.oop;

import com.juaracoding.oop.fruit.Fruit;

public class MainApp {
    public static void main(String[] args) {
        //instance class fruit
        Fruit fruit = new Fruit();
        fruit.gram = 10;
        fruit.calPerGram = 500;
        System.out.println("Total Calories: " +fruit.totalCalories());
    }
}
