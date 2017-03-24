package com.example.clothingapp.clothes;

/**
 * Created by Taron on 03/19/17.
 */
public class Cloth {

    public String clothSize;
    public boolean isUsed;
    public boolean isFashion;
    public int price;

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
                System.out.println("Down dress size: S(Small)");
                break;
            case "L":
                System.out.println("Down dress size: L(Large)");
                break;
            case "XL":
                System.out.println("Down dress size: XL(X-Large)");
                break;
            case "XS":
                System.out.println("Down dress size: XS(X-Small)");
                break;
            case "M":
                System.out.println("Down dress size: M(Medium)");
                break;
            case "XXl":
                System.out.println("Down dress size: XXL(2X-Large)");
                break;
            default:
                System.out.println("Down dress size non specified by standart criteria.");

        }
    }
}
