package com.example.clothingapp.clothes.man_clothes.shoes;

import com.example.clothingapp.clothes.man_clothes.ManCloth;

/**
 * Created by Taron on 03/19/17.
 */
public class Shoes extends ManCloth {

    private boolean hasClue;

    public Shoes(String brand, String season, String color, boolean hasClue) {
        super(brand, season, color);
        this.hasClue = hasClue;
    }

    public boolean isHasClue() {
        return hasClue;
    }

    public void setHasClue(boolean hasClue) {
        this.hasClue = hasClue;
    }

    public void draw(){
        System.out.println("Shoes style: " + getStyle());
        System.out.println("Shoes brand: " + getBrand());
        System.out.println("Shoes color: " + getColor());
        System.out.println("Shoes season: " + getSeason());
        if(hasClue)
            System.out.println("Shoes have a clue");
        System.out.println();
    }
}
