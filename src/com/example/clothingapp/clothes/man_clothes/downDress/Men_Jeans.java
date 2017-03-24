package com.example.clothingapp.clothes.man_clothes.downDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Men_Jeans extends DownDress{


    public Men_Jeans(String brand, String season, String color, int countOfPlacket, int countOfButton, String clothSize, boolean isUsed, int price) {
        super(brand, season, color, countOfPlacket, countOfButton, clothSize, isUsed, price);
        this.style = "Men jeans";
    }
}
