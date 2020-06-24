package sample.Item;

import sample.Database.Conn;

public class Item {
    private int id;
    private String name;
    private double price;
    private String des;
    private int userID;

    public Item(String name, double price, String des, int userID) {
        this.userID = userID;
        this.name = name;
        this.price = price;
        this.des = des;

        insertList();
    }

    private void insertList() {
        this.userID = Conn.insertItemIntoDB(this);
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

    public int getUserID() {
        return userID;
    }

    public boolean cmpItem(Item item) {
        return item.id == this.id;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + price + "\t" + des;
    }
}
