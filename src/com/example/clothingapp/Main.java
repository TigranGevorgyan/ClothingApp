package com.example.clothingapp;

import com.example.clothingapp.clothes.man_clothes.downDress.DownDress;
import com.example.clothingapp.clothes.man_clothes.downDress.Man_Classic_trouser;
import com.example.clothingapp.clothes.man_clothes.downDress.Men_Jeans;
import com.example.clothingapp.clothes.man_clothes.hats.Beret;
import com.example.clothingapp.clothes.man_clothes.hats.Capotain;
import com.example.clothingapp.clothes.man_clothes.hats.Hat;
import com.example.clothingapp.clothes.man_clothes.shoes.Ballet_shoes;
import com.example.clothingapp.clothes.man_clothes.shoes.Boots;
import com.example.clothingapp.clothes.man_clothes.shoes.Derby;
import com.example.clothingapp.clothes.man_clothes.shoes.Shoes;
import com.example.clothingapp.clothes.man_clothes.topDress.Man_Sweater;
import com.example.clothingapp.clothes.man_clothes.topDress.Shirt;
import com.example.clothingapp.clothes.man_clothes.topDress.TopDress;
import com.example.clothingapp.clothes.woman_clothes.downDress.WomanDownDress;
import com.example.clothingapp.clothes.woman_clothes.downDress.Woman_Jeans;
import com.example.clothingapp.clothes.woman_clothes.hats.Fedora;
import com.example.clothingapp.clothes.woman_clothes.hats.WomanHat;
import com.example.clothingapp.clothes.woman_clothes.shoes.Sandal;
import com.example.clothingapp.clothes.woman_clothes.shoes.WomanShoes;
import com.example.clothingapp.clothes.woman_clothes.topDress.Blouse;
import com.example.clothingapp.clothes.woman_clothes.topDress.WomanTopDress;
import com.example.clothingapp.persons.Man;
import com.example.clothingapp.persons.Woman;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

/**
 * Created by Taron on 03/19/17.
 */
public class Main {
    public static void main(String[] args){

        Derby derby = new Derby("Puma","summar","white",true);
        Men_Jeans men_jeans = new Men_Jeans("Armani","summar","blur",4,0,"XXl",false);
        Man_Sweater man_sweater = new Man_Sweater("Armani","summar","blue",0,true,false);
        Capotain capotain = new Capotain("Puma","summar","black",true,false);
        Cat cat = new Cat("Pushok",2,"Vana");
        Dog dog = new Dog("Rex","black","Xaski",3);
        Man man = new Man("Tigran",22,"gevorgyan","black",175,70,cat,dog,"black",null);
        man.setDog(dog);
        man.setCat(cat);
        man.setHat(capotain);
        man.setTopDress(man_sweater);
        man.setDownDress(men_jeans);
        man.setShoes(derby);
        man.draw();
        man.goOut();

        Sandal sandal = new Sandal("Baldi","summar","withe",true);
        Woman_Jeans woman_jeans = new Woman_Jeans("Baldi","summar","black",4,2,false);
        Blouse blouse = new Blouse("Baldi","summar","withe",0,true);
        Fedora fedora = new Fedora("Puma","summar","black",true,"Very nice girl");
        Woman woman = new Woman("Anna",18,"Gevorgyan","black",160,54,cat,dog,"gray",true,"red",true);
        woman.setCat(cat);
        woman.setDog(dog);
        woman.setWomanShoes(sandal);
        woman.setWomanDownDress(woman_jeans);
        woman.setWomanTopDress(blouse);
        woman.setWomanHat(fedora);
        woman.draw();
        woman.goOut();




    }

}
