package com.example.clothingapp.clothes;

/**
 * Created by Taron on 03/19/17.
 */
public class Cloth {

    public String clothSize;
    public boolean isUsed;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getClothSize() {
        return clothSize;
    }

    public void setClothSize(String size) {
        this.clothSize = size;
    }


}
