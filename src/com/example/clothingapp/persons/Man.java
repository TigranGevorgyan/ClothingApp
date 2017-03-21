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
    public Shoes shoes;
    public TopDress topDress;
    public DownDress downDress;
    public Hat hat;
    public boolean hasTattoo;
    public String tattooColor;

    public Man(String firstName, int age, String lastName, String hairColor, int height, int weight, Cat cat, Dog dog, String eyeColor) {
        super(firstName, age, lastName, hairColor, height, weight, cat, dog, eyeColor);
    }

    public Man(String firstName, int age, String lastName, String hairColor, int height, int weight, Cat cat, Dog dog, String eyeColor, boolean hasTattoo, String tattooColor) {
        super(firstName, age, lastName, hairColor, height, weight, cat, dog, eyeColor);
        this.hasTattoo = hasTattoo;
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

    public boolean isHasTattoo() {
        return hasTattoo;
    }

    public void setHasTattoo(boolean hasTattoo) {
        this.hasTattoo = hasTattoo;
    }

    public String getTattooColor() {
        return tattooColor;
    }

    public void setTattooColor(String tattooColor) {
        this.tattooColor = tattooColor;
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
        if(isHasTattoo()) {
            System.out.println(getFirstName() + " have a nice tattoo.");
            System.out.println("His tattoo color is: " + getTattooColor());
            System.out.println();
        }
        else {
            System.out.println(getFirstName() + " dont have a tattoo.");
            System.out.println();
        }
        if(cat != null){
            System.out.println(getFirstName() + " has a cat");
            System.out.println("Cat name is: " + cat.getName());
            System.out.println("Cat age is: " + cat.getAge());
            System.out.println("Cat parod is: " + cat.getParod());
            System.out.println();
        }
        if(dog != null){
            System.out.println(getFirstName() + " has a dog");
            System.out.println("Dog name is: " + dog.getName());
            System.out.println("Dog parode is: " + dog.getParode());
            System.out.println("Dog color is: " + dog.getColor());
            System.out.println("Dog age is: " + dog.getAge());
            System.out.println();

        }

    }

    @Override
    public void goOut() {
        super.goOut();
        if(shoes == null || downDress == null || topDress == null)
            System.out.println("I can not go out naked.");
        else System.out.println("I look great,going out.");
        System.out.println("-------------------------------------------");
    }
}
