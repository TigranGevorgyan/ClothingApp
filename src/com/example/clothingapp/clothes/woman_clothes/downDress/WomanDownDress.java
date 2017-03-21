package com.example.clothingapp.clothes.woman_clothes.downDress;

import com.example.clothingapp.clothes.woman_clothes.WomanCloth;

/**
 * Created by Taron on 03/21/17.
 */
public class WomanDownDress extends WomanCloth {

    private int countOfPlacket;
    private int countOfButton;
    private boolean isSport;

    public WomanDownDress(String brand, String season, String color, int countOfPlacket, int countOfButton, boolean isSport) {
        super(brand, season, color);
        this.countOfPlacket = countOfPlacket;
        this.countOfButton = countOfButton;
        this.isSport = isSport;
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
        if(isSport)
            System.out.println("This down dress for games");
        System.out.println();
    }
}
