package com.example.clothingapp.clothes;

/**
 * Created by Taron on 03/19/17.
 */
public class Cloth {

    public String clothSize;
    public boolean isUsed;
    public boolean isFashion;

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
}
