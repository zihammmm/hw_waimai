package sample.User;

import sample.Item.Cart;
import sample.Item.Item;

public class Customer extends User{
    private Cart cart;

    Customer(int id, String name) {
        super(id, name);
        cart = new Cart();
    }

    public void addItem(Item item, int num) {
        cart.addItem(item, num);
    }

    public void removeItem(Item item, int num) {
        cart.removeItem(item, num);
    }

    public void clearCart() {
        cart.clear();
    }

}
