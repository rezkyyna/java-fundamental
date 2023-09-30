package com.juaracoding.oop.fruit;

public class Fruit {
    //state
    public int gram;
    public int calPerGram;

    //behavior
    public int totalCalories(){
        return gram * calPerGram;
    }
}
