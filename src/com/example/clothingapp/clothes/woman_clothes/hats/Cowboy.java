package com.example.clothingapp.clothes.woman_clothes.hats;

/**
 * Created by Taron on 03/19/17.
 */
public class Cowboy extends WomanHat {


    public Cowboy(String brand, String season, String color, boolean isWritten, String whatIsWritten, int price) {
        super(brand, season, color, isWritten, whatIsWritten, price);
        this.style = "Cowboy";
    }
}
