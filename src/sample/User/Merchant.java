package sample.User;

import sample.Item.Item;
import sample.Item.Order;
import sample.Output.OutputUtils;
import sample.TakeOutSystem;

import java.util.List;

/**
 * @author zihan
 * 商家类，可以发布商品信息
 */
public class Merchant implements User{
    private int id;
    private String name;
    private List<Item> items;
    private List<Order> orders;

    Merchant(int id, String name) {
        this.id = id;
        this.name = name;

        //TODO:从数据库中加载商品列表和订单信息
    }

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 打印订单
     */
    public void printOrders() {
        for (Order order : orders) {
            order.printOrder();
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void printItems() {
        for (Item item : items) {
            OutputUtils.outputln(item.toString());
        }
    }
}
