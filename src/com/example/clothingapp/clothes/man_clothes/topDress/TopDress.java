package com.example.clothingapp.clothes.man_clothes.topDress;

import com.example.clothingapp.clothes.man_clothes.ManCloth;

/**
 * Created by Taron on 03/19/17.
 */
public class TopDress extends ManCloth {

    public int countOfPlacket;
    public boolean hasChain;
    public boolean isWeft;

    public boolean isWeft() {
        return isWeft;
    }

    public void setWeft(boolean weft) {
        isWeft = weft;
    }

    public int getCountOfPlacket() {
        return countOfPlacket;
    }

    public void setCountOfPlacket(int countOfPlacket) {
        this.countOfPlacket = countOfPlacket;
    }

    public boolean isHasCheap() {
        return hasChain;
    }

    public void setHasCheap(boolean hasCheap) {
        this.hasChain = hasCheap;
    }

    public TopDress(String brand, String season, String color, int countOfPlacket, boolean isWeft, boolean hasChain) {
        super(brand, season, color);
        this.countOfPlacket = countOfPlacket;
        this.isWeft = isWeft;
        this.hasChain = hasChain;
    }

    public void draw(){
        System.out.println("Top dress style: " + getStyle());
        System.out.println("Top dress brand: " + getBrand());
        System.out.println("Top dress color: " + getColor());
        System.out.println("Top dress season: " + getSeason());
        System.out.println("Count of placket on top dress: " + getCountOfPlacket());
        if(isWeft)
            System.out.println("Top dress is weft");
        if(hasChain)
            System.out.println("Top dress have a chain");
        System.out.println();
    }
}
