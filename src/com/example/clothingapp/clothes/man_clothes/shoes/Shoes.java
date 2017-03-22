package com.example.clothingapp.clothes.man_clothes.shoes;

import com.example.clothingapp.clothes.man_clothes.ManCloth;

/**
 * Created by Taron on 03/19/17.
 */
public class Shoes extends ManCloth {

    private boolean hasClue;
    private int size;

    public Shoes(String brand, String season, String color, boolean hasClue,int size) {
        super(brand, season, color);
        this.hasClue = hasClue;
        this.size = size;
    }

    public boolean isHasClue() {
        return hasClue;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHasClue(boolean hasClue) {
        this.hasClue = hasClue;
    }

    public void draw(){
        System.out.println("Shoes style: " + getStyle());
        System.out.println("Shoes brand: " + getBrand());
        System.out.println("Shoes color: " + getColor());
        System.out.println("Shoes season: " + getSeason());
        System.out.println("Shoes size is: " + getSize());
        if(hasClue)
            System.out.println("Shoes have a clue");
        System.out.println();
    }
}
