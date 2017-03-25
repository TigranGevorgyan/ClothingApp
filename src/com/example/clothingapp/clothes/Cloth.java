package com.example.clothingapp.clothes;

import com.example.clothingapp.Shop;

/**
 * Created by Taron on 03/19/17.
 */
public class Cloth{

    public String clothSize;
    public boolean isUsed;
    public boolean isFashion;
    public int price;
    public String style;
    public String brand;
    public String season;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFashion() {
        return isFashion;
    }

    public void setFashion(boolean fashion) {
        isFashion = fashion;
    }

    public String getClothSize() {
        return clothSize;
    }

    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void getSizeByCriterion(){
        switch (getClothSize()){
            case "S":
                System.out.println("Dress size: S(Small)");
                break;
            case "L":
                System.out.println("Dress size: L(Large)");
                break;
            case "XL":
                System.out.println("Dress size: XL(X-Large)");
                break;
            case "XS":
                System.out.println("Dress size: XS(X-Small)");
                break;
            case "M":
                System.out.println("Dress size: M(Medium)");
                break;
            case "XXl":
                System.out.println("Dress size: XXL(2X-Large)");
                break;
            default:
                System.out.println("Dress size non specified by standart criteria.");

        }
    }
}
