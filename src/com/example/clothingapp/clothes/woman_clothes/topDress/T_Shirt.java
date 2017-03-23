package com.example.clothingapp.clothes.woman_clothes.topDress;

/**
 * Created by Taron on 03/19/17.
 */
public class T_Shirt extends WomanTopDress {

    public T_Shirt(String brand, String season, String color, int countOfBotton, boolean isWeft, String clothSize) {
        super(brand, season, color, countOfBotton, isWeft, clothSize);
        this.style = "T-Shirt";
    }
}
