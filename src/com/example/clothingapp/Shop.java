package com.example.clothingapp;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_clothes.ManCloth;
import com.example.clothingapp.clothes.man_clothes.downDress.DownDress;
import com.example.clothingapp.clothes.man_clothes.hats.Hat;
import com.example.clothingapp.clothes.man_clothes.shoes.Shoes;
import com.example.clothingapp.clothes.man_clothes.topDress.TopDress;
import com.example.clothingapp.clothes.woman_clothes.WomanCloth;
import com.example.clothingapp.clothes.woman_clothes.downDress.Skirt;
import com.example.clothingapp.clothes.woman_clothes.downDress.WomanDownDress;
import com.example.clothingapp.clothes.woman_clothes.hats.WomanHat;
import com.example.clothingapp.clothes.woman_clothes.shoes.WomanShoes;
import com.example.clothingapp.clothes.woman_clothes.topDress.WomanTopDress;

/**
 * Created by Taron on 03/24/17.
 */
public class Shop {

    private int totalCost;

    public int[] arrayOfValues = new int[40];

    private int i;

    public  DownDress[] manDownDress = new DownDress[5];

    public Hat[] manHats = new Hat[5];

    public Shoes[] manShoes = new Shoes[5];

    public TopDress[] manTopDress = new TopDress[5];

    public WomanDownDress[] womanDownDresses = new WomanDownDress[5];

    public WomanHat[] womanHats = new WomanHat[5];

    public WomanShoes[] womanShoes = new WomanShoes[5];

    public WomanTopDress[] womanTopDresses = new WomanTopDress[5];

    public void totalPriceOfWomanHats(){
        int totalPrice = 0;
        for (WomanHat element : womanHats){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of woman hats is: " + totalPrice);
    }

    public void totalPriceOfWomanShoes(){
        int totalPrice = 0;
        for (WomanShoes element : womanShoes){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of woman shoes is: " + totalPrice);
    }

    public void totalPriceOfWomanTopDress(){
        int totalPrice = 0;
        for (WomanTopDress element : womanTopDresses){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of woman top dress is: " + totalPrice);
    }

    public void totalPriceOfManDownDress(){
        int totalPrice = 0;
        for (ManCloth element : manDownDress){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of man down dress is: " + totalPrice);
    }

    public void totalPriceOfManHats(){
        int totalPrice = 0;
        for (Hat element : manHats){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of man hats is: " + totalPrice);
    }

    public void totalPriceOfManShoes(){
        int totalPrice = 0;
        for (Shoes element : manShoes){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of man shoes is: " + totalPrice);
    }

    public void totalPriceOfManTopDress(){
        int totalPrice = 0;
        for (TopDress element : manTopDress){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of man top dress is: " + totalPrice);
    }

    public void totalPriceOfWomanDownDress(){
        int totalPrice = 0;
        for (WomanDownDress element : womanDownDresses){
            totalPrice += element.getPrice();
            arrayOfValues[i] = element.getPrice();
            i++;
        }
        totalCost += totalPrice;
        System.out.println("Total price in this shop of woman down dress is: " + totalPrice);
    }

    public int getTotalCost(){
        return totalCost;
    }

    public int mostExpensiveCommudity(int[] arrayOfValues){
        int max = arrayOfValues[0];
        for (int i = 1;i < arrayOfValues.length;i++){
            if(arrayOfValues[i] > max)
                max = arrayOfValues[i];
        }
        return max;
    }

    public void findByPrice(int price,Cloth[] array){
        boolean answer = false;
        for (int i = 0;i < array.length;i++){
            if(array[i].getPrice() == price){
                System.out.println("Well,this is most expensive commudity in " + array[i].getType());
                System.out.println(String.format("Dress style: %s.",array[i].getStyle()));
                System.out.println(String.format("Dress brand: %s.",array[i].getBrand()));
                System.out.println(String.format("Dress season: %s",array[i].getSeason()));
                System.out.println(String.format("Dress color: %s",array[i].getColor()));
                System.out.println(String.format("Dress price: %d",array[i].getPrice()));
                if(array[i].getClothSize() != null)
                System.out.println(String.format("Dress size: %s",array[i].getClothSize()));
                answer = true;
            }
        }
        if(!answer) {
            System.out.println(String.format("That most expensive commudity is not in this directory.Please look other directory."));
            System.out.println(String.format("Now you are in directory which name: %s", array[0].getType()));
        }
    }
}





