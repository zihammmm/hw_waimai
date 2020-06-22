package sample.User;

import sample.Item.Item;
import sample.TakeOutSystem;

/**
 * @author zihan
 * 商家类，可以发布商品信息
 */
public class Merchant extends User{
    Merchant(int id, String name) {
        super(id, name);
    }

    public void addItem(int id, String name, double price, String des) {
        TakeOutSystem.getItemsInstance().add(new Item(id, name, price, des));
    }

    /**
     * 打印订单
     */
    public void printOrders() {

    }
}
