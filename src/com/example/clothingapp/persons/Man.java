package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.man_clothes.downDress.DownDress;
import com.example.clothingapp.clothes.man_clothes.hats.Hat;
import com.example.clothingapp.clothes.man_clothes.shoes.Shoes;
import com.example.clothingapp.clothes.man_clothes.topDress.TopDress;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

import javax.print.Doc;
import java.util.HashMap;

/**
 * Created by Taron on 03/19/17.
 */
public class Man extends Person {
    private Shoes shoes;
    private TopDress topDress;
    private DownDress downDress;
    private Hat hat;
    private String tattooColor;


    public Man(String firstName, int age, String lastName, String hairColor, int height, int weight, Cat cat, Dog dog, String eyeColor,String tattooColor) {
        super(firstName, age, lastName, hairColor, height, weight, cat, dog, eyeColor);
        this.tattooColor = tattooColor;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public TopDress getTopDress() {
        return topDress;
    }

    public void setTopDress(TopDress topDress) {
        this.topDress = topDress;
    }

    public DownDress getDownDress() {
        return downDress;
    }

    public void setDownDress(DownDress downDress) {
        this.downDress = downDress;
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

//    public boolean isHasTattoo() {
//        return hasTattoo;
//    }
//
//    public void setHasTattoo(boolean hasTattoo) {
//        this.hasTattoo = hasTattoo;
//    }

    public String getTattooColor() {
        return tattooColor;
    }

    public void setTattooColor(String tattooColor) {
        this.tattooColor = tattooColor;
    }

    public boolean hasTatoo(){
        return tattooColor != null;
    }

    public boolean canGoOut(){
        return shoes !=null && downDress !=null && topDress !=null;
    }



    public void draw(){
        super.draw();
        if(shoes != null)
        shoes.draw();
        if(downDress != null)
        downDress.draw();
        if(topDress != null)
        topDress.draw();
        if(hat != null)
        hat.draw();
        if(hasTatoo()) {
            System.out.println(getFirstName() + " have a nice tattoo.");
            System.out.println("His tattoo color is: " + getTattooColor());
            System.out.println();
        }
        else {
            System.out.println(getFirstName() + " dont have a tattoo.");
            System.out.println();
        }

    }

    @Override
    public void goOut() {
        super.goOut();
        if(canGoOut())
            System.out.println("I look great,going out.");
        else System.out.println("I can not go out naked.");
        System.out.println("-------------------------------------------");
    }

    public void giftForWoman(Woman obj){
        if(obj.isHasMakeup()){
            System.out.println(obj.getFirstName() + " today you have makeup,and you are very beautiful.I agree go with you to the cafe.");
            System.out.println("This flowers for you.");
            System.out.println();
        }
        else {
            System.out.println(obj.getFirstName() + " you don`t have makeup and I think you need a money.Take it and go beauty salon.");
            System.out.println();
        }
    }
}
