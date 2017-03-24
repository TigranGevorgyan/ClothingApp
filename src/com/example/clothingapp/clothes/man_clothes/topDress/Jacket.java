package com.example.clothingapp.clothes.man_clothes.topDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Jacket extends TopDress {

    public Jacket(String brand, String season, String color, int countOfPlacket, boolean isWeft, boolean hasChain, boolean isUsed, String clothsize, int price) {
        super(brand, season, color, countOfPlacket, isWeft, hasChain, isUsed, clothsize, price);
        this.style = "Jacket";
    }
}
