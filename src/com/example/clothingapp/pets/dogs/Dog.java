package com.example.clothingapp.pets.dogs;

/**
 * Created by Taron on 03/19/17.
 */
public class Dog {
    public String name;
    public String color;
    public String parode;
    public int age;

    public Dog(String name, String color, String parode, int age) {
        this.name = name;
        this.color = color;
        this.parode = parode;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParode() {
        return parode;
    }

    public void setParode(String parode) {
        this.parode = parode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
