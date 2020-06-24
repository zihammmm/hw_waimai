package sample.User;

import sample.Input.InputUtils;
import sample.Item.Cart;
import sample.Item.Item;
import sample.Output.OutputUtils;
import sample.User.VIP.Vip;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer implements User{
    private int id;
    private String name;
    private Cart cart;

    private Vip vip;

    Customer(int id, String name, Vip vip) {
        this.id = id;
        this.name = name;
        this.vip = vip;
        //TODO:从数据库中读取数据
        cart = new Cart();
    }

    public void addItem(Item item, int num) {
        cart.addItem(item, num);
    }

    public boolean removeItem(int index, int num) {
        return cart.removeItem(index, num);
    }

    public void clearCart() {
        cart.clear();
    }

    public void printCart() {
        cart.printItems();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public double pay() {
        return cart.settle() * vip.discounts();
    }

    @Override
    public String toString() {
        return "id: " + id + "\n姓名:" + name;
    }
}
