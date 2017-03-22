package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.man_clothes.downDress.DownDress;
import com.example.clothingapp.clothes.man_clothes.hats.Hat;
import com.example.clothingapp.clothes.man_clothes.shoes.Shoes;
import com.example.clothingapp.clothes.man_clothes.topDress.Shirt;
import com.example.clothingapp.clothes.man_clothes.topDress.TopDress;
import com.example.clothingapp.clothes.woman_clothes.downDress.WomanDownDress;
import com.example.clothingapp.clothes.woman_clothes.hats.WomanHat;
import com.example.clothingapp.clothes.woman_clothes.shoes.WomanShoes;
import com.example.clothingapp.clothes.woman_clothes.topDress.WomanTopDress;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

import javax.print.Doc;

/**
 * Created by Taron on 03/19/17.
 */
public class Woman extends Person {

    private WomanShoes womanShoes;
    private WomanDownDress womanDownDress;
    private WomanTopDress womanTopDress;
    private WomanHat womanHat;
    private boolean hasMakeup;
    private String lipstickColor;
    private boolean hasEarrings;

    public Woman(String firstName, int age, String lastName, String hairColor, int height, int weight, Cat cat, Dog dog, String eyeColor, boolean hasMakeup, String lipstickColor, boolean hasEarrings) {
        super(firstName, age, lastName, hairColor, height, weight, cat, dog, eyeColor);
        this.hasMakeup = hasMakeup;
        this.lipstickColor = lipstickColor;
        this.hasEarrings = hasEarrings;
    }

    public WomanShoes getWomanShoes() {
        return womanShoes;
    }

    public void setWomanShoes(WomanShoes womanShoes) {
        this.womanShoes = womanShoes;
    }

    public boolean isHasEarrings() {
        return hasEarrings;
    }

    public void setHasEarrings(boolean hasEarrings) {
        this.hasEarrings = hasEarrings;
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public void setLipstickColor(String lipstickColor) {
        this.lipstickColor = lipstickColor;
    }

    public boolean isHasMakeup() {
        return hasMakeup;
    }

    public void setHasMakeup(boolean hasMakeup) {
        this.hasMakeup = hasMakeup;
    }

    public WomanHat getWomanHat() {
        return womanHat;
    }

    public void setWomanHat(WomanHat womanHat) {
        this.womanHat = womanHat;
    }

    public WomanTopDress getWomanTopDress() {
        return womanTopDress;
    }

    public void setWomanTopDress(WomanTopDress womanTopDress) {
        this.womanTopDress = womanTopDress;
    }

    public WomanDownDress getWomanDownDress() {
        return womanDownDress;
    }

    public void setWomanDownDress(WomanDownDress womanDownDress) {
        this.womanDownDress = womanDownDress;
    }

    public void draw(){
        super.draw();
        if(womanShoes != null)
            womanShoes.draw();
        if(womanDownDress != null)
            womanDownDress.draw();
        if(womanTopDress != null)
            womanTopDress.draw();
        if(womanHat != null)
            womanHat.draw();
        if(isHasMakeup()){
            System.out.println(getFirstName() + " has makeup");
            System.out.println("Her lipstick color: " + getLipstickColor());
            System.out.println();
        }
        if(isHasEarrings()){
            System.out.println(getFirstName() + " has earrings");
        }
        System.out.println();

    }

    public boolean canGoOut(){
        return womanShoes != null && womanDownDress != null && womanTopDress != null && isHasMakeup();
    }

    @Override
    public void goOut() {
        super.goOut();
        if(canGoOut())
            System.out.println("I look great,go out");
        else System.out.println("I can not go out naked");
        System.out.println("--------------------------------");
    }

    public void giftForMan(Man man){
        if(isHasEarrings()){
            StringBuilder builder = new StringBuilder();
            builder.append("I am working,").append("and can dedicate you anything.").append(man.getFirstName())
                    .append('\n').append("Well!!!This car I dedicate you.");
            System.out.println(builder.toString());
        }
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("Sorry ").append(man.getFirstName()).append(" I dont have a monay,and can not dedicate you anything.");
            System.out.println(builder.toString());
        }


    }
}
