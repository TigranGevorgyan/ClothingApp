package com.example.clothingapp.clothes.man_clothes;

import com.example.clothingapp.clothes.Cloth;

/**
 * Created by Taron on 03/19/17.
 */
public class ManCloth extends Cloth {

    public String brand;
    public String color;
    public String season;
    public String style;

    public ManCloth(String brand, String season, String color) {
        this.brand = brand;
        this.season = season;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
