package com.example.clothingapp.clothes.woman_clothes.shoes;

import com.example.clothingapp.clothes.woman_clothes.WomanCloth;

/**
 * Created by Taron on 03/21/17.
 */
public class WomanShoes extends WomanCloth{

    public boolean isClue;

    public WomanShoes(String brand, String season, String color,boolean isClue) {
        super(brand, season, color);
        this.isClue = isClue;
    }

    public boolean isClue() {
        return isClue;
    }

    public void setIsClue(boolean hasClue) {
        this.isClue = hasClue;
    }

    public void draw(){
        System.out.println("Shoes style: " + getStyle());
        System.out.println("Shoes brand: " + getBrand());
        System.out.println("Shoes color: " + getColor());
        System.out.println("Shoes season: " + getSeason());
        if(isClue()){
            System.out.println("Shoes has a clue");
        }
        System.out.println();
    }
}
