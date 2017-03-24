package com.example.clothingapp.clothes.man_clothes.topDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Man_Sweater extends TopDress {

    public Man_Sweater(String brand, String season, String color, int countOfPlacket, boolean isWeft, boolean hasChain, boolean isUsed, String clothsize, int price) {
        super(brand, season, color, countOfPlacket, isWeft, hasChain, isUsed, clothsize, price);
        this.style = "Man sweater";
    }
}
