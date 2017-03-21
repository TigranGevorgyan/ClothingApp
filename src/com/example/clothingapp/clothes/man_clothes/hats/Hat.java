package com.example.clothingapp.clothes.man_clothes.hats;

import com.example.clothingapp.clothes.man_clothes.ManCloth;

/**
 * Created by Taron on 03/19/17.
 */
public class Hat extends ManCloth {

    private boolean hasSticky_stiker;

    public Hat(String brand, String season, String color, boolean hasSticky_stiker) {
        super(brand, season, color);
        this.hasSticky_stiker = hasSticky_stiker;
    }

    public boolean isHasSticky_stiker() {
        return hasSticky_stiker;
    }

    public void setHasSticky_stiker(boolean hasSticky_stiker) {
        this.hasSticky_stiker = hasSticky_stiker;
    }

    public void draw(){
        System.out.println("Hat style: " + getStyle());
        System.out.println("Hat brand: " + getBrand());
        System.out.println("Hat color: " + getColor());
        System.out.println("Hat season: " + getSeason());
        if(hasSticky_stiker)
            System.out.println("Hat have a sticky-stiker");
        System.out.println();
    }
}
