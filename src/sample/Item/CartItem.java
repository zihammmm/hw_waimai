package sample.Item;

public class CartItem {
    private Item item;
    private int num;

    public CartItem(Item item, int num) {
        this.item = item;
        this.num = num;
    }

    public double getAllPrice() {
        return item.getPrice() * num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString() + "\t" + num;
    }
}
