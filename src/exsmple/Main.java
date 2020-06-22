package exsmple;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Item item = Item.getById(2);
        System.out.println(item.getName());


    }
}
