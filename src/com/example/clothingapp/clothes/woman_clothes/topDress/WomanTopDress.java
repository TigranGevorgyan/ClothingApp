package com.example.clothingapp.clothes.woman_clothes.topDress;

import com.example.clothingapp.clothes.woman_clothes.WomanCloth;

/**
 * Created by Taron on 03/21/17.
 */
public class WomanTopDress extends WomanCloth{

    public int countOfBotton;
    public boolean isWeft;

    public WomanTopDress(String brand, String season, String color, int countOfBotton, boolean isWeft) {
        super(brand, season, color);
        this.countOfBotton = countOfBotton;
        this.isWeft = isWeft;
    }

    public int getCountOfBotton() {
        return countOfBotton;
    }

    public void setCountOfBotton(int countOfBotton) {
        this.countOfBotton = countOfBotton;
    }

    public boolean isWeft() {
        return isWeft;
    }

    public void setWeft(boolean weft) {
        isWeft = weft;
    }

    public void draw(){
        System.out.println("Top dress style: " + getStyle());
        System.out.println("Top dress brand: " + getBrand());
        System.out.println("Top dress color: " + getColor());
        System.out.println("Top dress season: " + getSeason());
        System.out.println("Count of button on top dress: " + getCountOfBotton());
        if(isWeft()){
            System.out.println("This top dress is weft.");
        }
        System.out.println();
    }
}
