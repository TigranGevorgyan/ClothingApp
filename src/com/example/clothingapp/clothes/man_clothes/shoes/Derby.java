package com.example.clothingapp.clothes.man_clothes.shoes;

import com.example.clothingapp.clothes.man_clothes.hats.Hat;

/**
 * Created by Taron on 03/19/17.
 */
public class Derby extends Shoes {


    public Derby(String brand, String season, String color, boolean hasClue, int size, int price) {
        super(brand, season, color, hasClue, size, price);
        this.style = "Derby";
    }
}
