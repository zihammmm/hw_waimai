package sample.Item;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<CartItem> itemList;

    public Cart() {
        itemList = new LinkedList<>();
    }

    public Cart(List<CartItem> list) {
        itemList = list;
    }

    public double getPrice() {
        if (itemList.isEmpty()) {
            return 0;
        } else {
            double sum = 0.0;
            for (CartItem cartItem : itemList) {
                sum += cartItem.getAllPrice();
            }
            return sum;
        }
    }

    public void addItem(Item item, int num) {
        itemList.add(new CartItem(item, num));
    }

    public boolean removeItem(Item item, int num) {
        int index = getItemIndex(item);
        if (index == -1) {
            return false;
        }else {
            int n = getItemNum(item);
            if (n == -1) {
                return false;
            }else {
                itemList.remove(n);
                return true;
            }
        }
    }

    public void clear() {
        itemList.clear();
    }

    /**
     * 打印购物车
     */
    public void printItems() {

    }

    /**
     * 结算购物车
     */
    public void settle() {

    }

    private boolean setItemNum(CartItem cartItem, int num) {
        if (cartItem == null) {
            return false;
        }
        cartItem.setNum(num);
        return true;
    }

    private int getItemNum(Item item) {
        int index = getItemIndex(item);
        if (index == -1) {
            return -1;
        }else {
            return itemList.get(index).getNum();
        }
    }

    private int getItemIndex(Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            if (item.cmpItem(itemList.get(i).getItem())) {
                return i;
            }
        }
        return -1;
    }

}
