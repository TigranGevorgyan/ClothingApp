package com.example.clothingapp.clothes.man_clothes.downDress;

import com.example.clothingapp.clothes.man_clothes.ManCloth;

/**
 * Created by Taron on 03/19/17.
 */
public class DownDress extends ManCloth {

    private int countOfPlacket;
    private int countOfButton;

    public DownDress(String brand, String season, String color, int countOfPlacket, int countOfButton,String clothSize,boolean isUsed) {
        super(brand, season, color);
        this.countOfPlacket = countOfPlacket;
        this.countOfButton = countOfButton;
        this.clothSize = clothSize;
        this.isUsed = isUsed;
    }

    public int getCountOfPlacket() {
        return countOfPlacket;
    }

    public void setCountOfPlacket(int countOfPlacket) {
        this.countOfPlacket = countOfPlacket;
    }

    public int getCountOfButton() {
        return countOfButton;
    }

    public void setCountOfButton(int countOfButton) {
        this.countOfButton = countOfButton;
    }

    public void draw(){
        System.out.println("Down dress style: " + getStyle());
        System.out.println("Down dress brand: " + getBrand());
        System.out.println("Down dress color: " + getColor());
        System.out.println("Down dress season: " + getSeason());
        System.out.println("Count of placket on down dress: " + getCountOfPlacket());
        System.out.println("Count of button on down dress: " + getCountOfButton());
        System.out.println("Down dress size: " + getClothSize());
        if (isUsed()) {
            System.out.println("Before anybody wear it");
        }
        System.out.println();
    }
}
