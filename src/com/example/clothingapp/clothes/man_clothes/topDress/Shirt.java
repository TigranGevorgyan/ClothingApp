package com.example.clothingapp.clothes.man_clothes.topDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Shirt extends TopDress {


    public Shirt(String brand, String season, String color, int countOfPlacket, boolean isWeft, boolean hasCheap) {
        super(brand, season, color, countOfPlacket, isWeft, hasCheap);
        this.style = "Shirt";
    }
}
