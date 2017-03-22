package com.example.clothingapp.persons;

import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

import javax.print.Doc;

/**
 * Created by Taron on 03/19/17.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String hairColor;
    private String eyeColor;
    private int height;
    private int weight;
    private Cat cat;
    private Dog dog;

    public Person(String firstName, int age, String lastName, String hairColor, int height, int weight, Cat cat, Dog dog, String eyeColor) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.cat = cat;
        this.dog = dog;

    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void draw(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Hair color: " + getHairColor());
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println();
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
        System.out.println();
    }

    public void goOut(){
        System.out.println("DECISION FOR GOING OUT!!!");
    }
}
