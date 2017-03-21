package com.example.clothingapp.clothes.woman_clothes.hats;

import com.example.clothingapp.clothes.woman_clothes.WomanCloth;

/**
 * Created by Taron on 03/21/17.
 */
public class WomanHat extends WomanCloth {

    private boolean isWritten;
    private String whatIsWritten;


    public WomanHat(String brand, String season, String color, boolean isWritten, String whatIsWritten) {
        super(brand, season, color);
        this.isWritten = isWritten;
        this.whatIsWritten = whatIsWritten;
    }

    public boolean isWritten() {
        return isWritten;
    }

    public void setWritten(boolean written) {
        isWritten = written;
    }

    public String getWhatIsWritten() {
        return whatIsWritten;
    }

    public void setWhatIsWritten(String whatIsWritten) {
        this.whatIsWritten = whatIsWritten;
    }

    public void draw(){
        System.out.println("Hat style: " + getStyle());
        System.out.println("Hat brand: " + getBrand());
        System.out.println("Hat color: " + getColor());
        System.out.println("Hat season: " + getSeason());
        if(isWritten()){
            System.out.println("On hat written << " + getWhatIsWritten() + " >>");
        }
        System.out.println();
    }
}
