package com.example.clothingapp.clothes.man_clothes.topDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Shirt extends TopDress {

    public Shirt(String brand, String season, String color, int countOfPlacket, boolean isWeft, boolean hasChain, boolean isUsed, String clothsize) {
        super(brand, season, color, countOfPlacket, isWeft, hasChain, isUsed, clothsize);
        this.style = "Shirt";
    }
}
