package com.example.clothingapp.clothes.woman_clothes.downDress;

/**
 * Created by Taron on 03/19/17.
 */
public class Woman_Jeans extends WomanDownDress {


    public Woman_Jeans(String brand, String season, String color, int countOfPlacket, int countOfButton, boolean isSport, String clothSize, int price) {
        super(brand, season, color, countOfPlacket, countOfButton, isSport, clothSize, price);
        this.style = "Woman jeans";
    }
}
