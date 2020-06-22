package sample.Item;

public class Item {
    private int id;
    private String name;
    private double price;
    private String des;

    public Item(int id, String name, double price, String des) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public boolean cmpItem(Item item) {
        return item.id == this.id;
    }
}
