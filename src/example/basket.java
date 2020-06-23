package example;

import java.util.ArrayList;
import java.util.List;

public class basket {

        private List<Item> list = new ArrayList<>();


        public void addBasket(String id, int num){
            Item item = Item.getById(id);
            for (int i = 0; i<num; i++) {
                this.list.add(item);
            }
        }


        public void addsBasket(String[] idList){
            for (String id : idList) {
                addBasket(id, 1);
            }
        }


    public void getSumPrice(){
            int count = 0;
            for (Item item: this.list){
                count += item.getPrice();
            }
            System.out.println(count);
        }
}

