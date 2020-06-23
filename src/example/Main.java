package example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        basket basket = new basket();
        basket.addBasket("02",1);
        basket.getSumPrice();


        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        //      追加
        hmap.put("01", 10);
        hmap.put("02", 20);
        hmap.put("03", 30);

        //      取得
        System.out.println(hmap.get("01"));

        basket basket2 = new basket();
        for (Map.Entry<String, Integer> entry: hmap.entrySet()){
            
        }
        basket2.addBasket(map);
        basket2.getSumPrice();


    }
}
