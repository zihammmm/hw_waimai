package sample.Item;

import sample.Output.OutputUtils;

import java.util.LinkedList;
import java.util.List;

public class ItemList {
    private static List<Item> list = new LinkedList<>();

    /**
     * 获取商品列表
     */
    public static void getItemList() {

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

    public static void printItemList() {
        OutputUtils.outputln("序号\t商品ID\t商品名\t价格\t描述");
        for (int i = 0; i < list.size(); i++) {
            OutputUtils.outputln(i + "\t" + list.get(i).toString());
        }
    }

}
