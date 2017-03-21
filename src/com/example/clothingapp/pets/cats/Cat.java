package com.example.clothingapp.pets.cats;

/**
 * Created by Taron on 03/19/17.
 */
public class Cat {
    public String name;
    public String parod;
    public int age;

    public Cat(String name, int age, String parod) {
        this.name = name;
        this.age = age;
        this.parod = parod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParod() {
        return parod;
    }

    public void setParod(String parod) {
        this.parod = parod;
    }
}
