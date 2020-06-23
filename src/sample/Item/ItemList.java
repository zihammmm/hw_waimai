package sample.Item;

import java.util.LinkedList;
import java.util.List;

public class ItemList {
    private static List<Item> list = new LinkedList<>();

    /**
     * 获取商品列表
     */
    public ItemList() {

    }

    public static Item getItemByID(int id) {
        if (list.isEmpty()) {
            return null;
        }
        for (Item item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
