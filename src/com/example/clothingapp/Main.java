package com.example.clothingapp;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_clothes.ManCloth;
import com.example.clothingapp.clothes.man_clothes.downDress.DownDress;
import com.example.clothingapp.clothes.man_clothes.downDress.Man_Classic_trouser;
import com.example.clothingapp.clothes.man_clothes.downDress.Men_Jeans;
import com.example.clothingapp.clothes.man_clothes.downDress.Short;
import com.example.clothingapp.clothes.man_clothes.hats.Beret;
import com.example.clothingapp.clothes.man_clothes.hats.Capotain;
import com.example.clothingapp.clothes.man_clothes.hats.Hat;
import com.example.clothingapp.clothes.man_clothes.hats.Military_cup;
import com.example.clothingapp.clothes.man_clothes.shoes.Ballet_shoes;
import com.example.clothingapp.clothes.man_clothes.shoes.Boots;
import com.example.clothingapp.clothes.man_clothes.shoes.Derby;
import com.example.clothingapp.clothes.man_clothes.shoes.Shoes;
import com.example.clothingapp.clothes.man_clothes.topDress.Jacket;
import com.example.clothingapp.clothes.man_clothes.topDress.Man_Sweater;
import com.example.clothingapp.clothes.man_clothes.topDress.Shirt;
import com.example.clothingapp.clothes.man_clothes.topDress.TopDress;
import com.example.clothingapp.clothes.woman_clothes.downDress.Skirt;
import com.example.clothingapp.clothes.woman_clothes.downDress.WomanDownDress;
import com.example.clothingapp.clothes.woman_clothes.downDress.Woman_Classic_trouser;
import com.example.clothingapp.clothes.woman_clothes.downDress.Woman_Jeans;
import com.example.clothingapp.clothes.woman_clothes.hats.Cowboy;
import com.example.clothingapp.clothes.woman_clothes.hats.Fedora;
import com.example.clothingapp.clothes.woman_clothes.hats.Panama;
import com.example.clothingapp.clothes.woman_clothes.hats.WomanHat;
import com.example.clothingapp.clothes.woman_clothes.shoes.High_tops;
import com.example.clothingapp.clothes.woman_clothes.shoes.Pump;
import com.example.clothingapp.clothes.woman_clothes.shoes.Sandal;
import com.example.clothingapp.clothes.woman_clothes.shoes.WomanShoes;
import com.example.clothingapp.clothes.woman_clothes.topDress.Blouse;
import com.example.clothingapp.clothes.woman_clothes.topDress.T_Shirt;
import com.example.clothingapp.clothes.woman_clothes.topDress.WomanTopDress;
import com.example.clothingapp.clothes.woman_clothes.topDress.Woman_Sweater;
import com.example.clothingapp.persons.Man;
import com.example.clothingapp.persons.Woman;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

/**
 * Created by Taron on 03/19/17.
 */
public class Main {
    public static void main(String[] args){

        Shop shop = new Shop();
        shop.manDownDress[0] = new Men_Jeans("Davos","every day","blue",4,0,"Xl",false,14000);
        shop.manDownDress[1] = new Men_Jeans("Davos","every day","blue",4,0,"Xl",false,12000);
        shop.manDownDress[2] = new Man_Classic_trouser("Armani","summar","black",4,0,"S",false,30000);
        shop.manDownDress[3] = new Man_Classic_trouser("Dolche Gabbana","winther","black",2,3,"XL",false,8000);
        shop.manDownDress[4] = new Short("Hummel","summar","blue",0,0,"S",false,5000);
        shop.totalPriceOfManDownDress();

        shop.manHats[0] = new Beret("Adidas","every day","red",false,true,5000);
        shop.manHats[1] = new Beret("Adidas","every day","red",false,true,5000);
        shop.manHats[2] = new Capotain("Nike","summar","black",true,true,8000);
        shop.manHats[3] = new Military_cup("Puma","winther","blue",false,true,6000);
        shop.manHats[4] = new Military_cup("Puma","winther","blue",false,true,6000);
        shop.totalPriceOfManHats();

        shop.manShoes[0] = new Boots("Nike","summar","white",true,40,16000);
        shop.manShoes[1] = new Boots("Kajila","summar","black",true,38,16000);
        shop.manShoes[2] = new Derby("Armani","summar","black",true,40,18000);
        shop.manShoes[3] = new Derby("Armani","summar","blue",true,39,14000);
        shop.manShoes[4] = new Ballet_shoes("Nike","every day","white",false,36,6000);
        shop.totalPriceOfManShoes();

        shop.manTopDress[0] = new Jacket("Armani","winther","black",0,true,true,false,"XL",14000);
        shop.manTopDress[1] = new Jacket("Zara","winther","white",2,true,true,false,"XXL",24000);
        shop.manTopDress[2] = new Man_Sweater("Adidas","summar","blue",0,false,false,false,"M",10000);
        shop.manTopDress[3] = new Shirt("Zara","every day","white",0,false,false,false,"XL",20000);
        shop.manTopDress[4] = new Shirt("Zara","summar","black",0,false,false,false,"S",14000);
        shop.totalPriceOfManTopDress();
        System.out.println("---------------------------------------------------");

        shop.womanDownDresses[0] = new Skirt("Armani","summar","black",0,0,false,"Xl",7000);
        shop.womanDownDresses[1] = new Woman_Classic_trouser("Puma","summar","black",0,0,true,"Xl",10000);
        shop.womanDownDresses[2] = new Woman_Jeans("Armani","erevrday","black",2,5,false,"XXl",8000);
        shop.womanDownDresses[3] = new Skirt("Zilli","summar","blue",0,0,true,"S",17000);
        shop.womanDownDresses[4] = new Skirt("Adidas","summar","black",0,0,true,"M",6000);
        shop.totalPriceOfWomanDownDress();

        shop.womanHats[0] = new Cowboy("Puma","summar","yellow",true,"have a nice day",9000);
        shop.womanHats[1] = new Fedora("Puma","summar","white",true,"FEDORA",6000);
        shop.womanHats[2] = new Fedora("Nike","summar","white",true,"I LOVE SUMMAR",7000);
        shop.womanHats[3] = new Panama("Adidas","winther","black",true,"SNOW SNOW SNOW",9000);
        shop.womanHats[4] = new Panama("Adidas","winther","blue",true,"SNOW SNOW SNOW",9000);
        shop.totalPriceOfWomanHats();

        shop.womanShoes[0] = new High_tops("Armani","summar","black",false,16000);
        shop.womanShoes[1] = new High_tops("Ja-Ja","summar","white",false,13000);
        shop.womanShoes[2] = new Sandal("Zilli","every day","blue",true,8000);
        shop.womanShoes[3] = new Sandal("Armani","summar","black",false,14000);
        shop.womanShoes[4] = new Pump("Nike","winther","black",true,10000);
        shop.totalPriceOfWomanShoes();

        shop.womanTopDresses[0] = new Blouse("Armani","summar","red",2,false,"XL",14500);
        shop.womanTopDresses[1] = new Blouse("Dolche Gabbana","summar","blue",0,true,"XL",16000);
        shop.womanTopDresses[2] = new T_Shirt("Nike","summar","white",0,false,"S",9000);
        shop.womanTopDresses[3] = new Woman_Sweater("Armani","winther","black",2,true,"M",15000);
        shop.womanTopDresses[4] = new Woman_Sweater("Zilli","summar","green",0,false,"M",10000);
        shop.totalPriceOfWomanTopDress();
        System.out.println("--------------------------------------------------");

        System.out.println(String.format("Commodites store there in %d AMD.",shop.getTotalCost()));

        System.out.println("---------------------------------------------------");

        System.out.println(String.format("Most expensive commudity cost in this shop is %d AMD.",shop.mostExpensiveCommudity(shop.array)));

        System.out.println("------------------------------------------------------");

        shop.findByPrice(shop.mostExpensiveCommudity(shop.array),shop.manHats);









    }

}
