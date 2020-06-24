package sample.Item;

import sample.Output.OutputUtils;

import java.util.List;

public class Order {
    private List<CartItem> cartItemList;
    private int id;

    public Order(int id, List<CartItem> cartItems) {
        this.id = id;
        cartItemList = cartItems;
    }

    public void printOrder() {
        OutputUtils.outputln("订单编号：" + id);
        OutputUtils.outputln("商品ID\t商品名\t单价\t数量");
        for (CartItem cartItem : cartItemList) {
            OutputUtils.outputln(cartItem.toString());
        }
    }
}
