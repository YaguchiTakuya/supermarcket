package example;

public enum Item {
    Apple("01", "りんご", 100),
    Orange("02", "みかん", 40),
    Berry("03", "ぶどう", 150),
    GlueValue("04", "のり弁", 350),
    SalmonValue("05", "しゃけ弁",400),
    Cigarette("06", "タバコ", 420),
    MentholSgarettes("07", "メンソールタバコ", 440),
    Lighter("08", "ライター", 100),
    GreenTea("09", "お茶", 80),
    Coffee("10", "コーヒー", 100);

    private String id;
    private String name;
    private int price;

    private Item(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id;}
    public String getName() { return name;}
    public int getPrice() { return price;}

    public static Item getById(String id) {

        for (Item item : Item.values()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }




}
