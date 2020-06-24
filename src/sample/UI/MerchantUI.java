package sample.UI;

import sample.Input.InputUtils;
import sample.Item.Item;
import sample.Output.OutputUtils;
import sample.User.Merchant;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MerchantUI {
    private Merchant merchant;
    private static final int CHECK_MY_ITEM = 1;
    private static final int CHECK_MY_ORDER = 2;
    private static final int PUBLISH_ITEM = 3;
    private static final int LOGOUT = 4;

    public MerchantUI(Merchant merchant) {
        this.merchant = merchant;
    }

    public void mainUI() {
        do {
            OutputUtils.clear();
            options();
            UIUtils.waitOneSecond();
        }while (chooseOptions() != LOGOUT);
    }

    public void options() {
        OutputUtils.outputln("欢迎商家：" + merchant.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看我发布的商品");
        OutputUtils.outputln("2.查看我收到的订单");
        OutputUtils.outputln("3.发布商品");
        OutputUtils.outputln("4.退出登陆");
    }

    public int chooseOptions() {
        int x = InputUtils.inputInt();
        switch (x) {
            case CHECK_MY_ITEM:
                checkMyItem();
                break;
            case CHECK_MY_ORDER:
                checkMyOrder();
                break;
            case PUBLISH_ITEM:
                publishItem();
                break;
            case LOGOUT:
                logout();
                break;
            default:
                Logger.getAnonymousLogger().log(Level.WARNING, "无此选项");
                return LOGOUT;
        }
        return x;
    }

    public void checkMyItem() {
        OutputUtils.clear();
        OutputUtils.outputln("我发布的商品信息如下：");
        merchant.printItems();
    }

    public void checkMyOrder() {
        OutputUtils.clear();
        OutputUtils.outputln("我收到的订单如下：");
        merchant.printOrders();
    }

    public void publishItem() {
        OutputUtils.clear();
        OutputUtils.outputln("添加要发布的新商品：");
        OutputUtils.output("商品名：");
        String name = InputUtils.inputString();
        OutputUtils.output("价格：");
        double price = InputUtils.inputDouble();
        OutputUtils.output("描述:");
        String des = InputUtils.inputString();
        Item item = new Item(name, price, des, merchant.getId());
        merchant.addItem(item);
        OutputUtils.output("添加成功！");
    }

    public void logout() {
        OutputUtils.clear();
        OutputUtils.outputln("退出成功");
        UIUtils.waitOneSecond();
    }

}
