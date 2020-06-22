package exsmple;

import java.sql.RowIdLifetime;

public enum Item {
    Apple(1, "りんご", 100),
    Orange(2, "みかん", 40),
    Berry(3, "ぶどう", 150),
    GlueValue(4, "のり弁", 350),
    SalmonValue(5, "しゃけ弁",400),
    Cigarette(6, "タバコ", 420),
    MentholSgarettes(7, "メンソールタバコ", 440),
    Lighter(8, "ライター", 100),
    GreenTea(9, "お茶", 80),
    Coffee(10, "コーヒー", 100);

    private int id;
    private String name;
    private int price;

    private Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id;}
    public String getName() { return name;}
    public int getPrice() { return price;}

    public static Item getById(int id) {

        for (Item item : Item.values()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }




}
