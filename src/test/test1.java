package test;

import example.basket;

public class test1 {
    public static void main(String[] args){

        basket basket = new basket();
        basket.addBasket("02", 300);
        basket.getSumPrice();


        basket basket2 = new basket();
        String[] array = {"01","02","03" };
        basket2.addsBasket(array);
        basket2.getSumPrice();


    }
}
