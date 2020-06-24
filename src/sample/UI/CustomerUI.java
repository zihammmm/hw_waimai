package sample.UI;

import sample.Input.InputUtils;
import sample.Item.ItemList;
import sample.Output.OutputUtils;
import sample.User.Customer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerUI{
    private Customer customer;
    private static final int CHECK_ITEM_LIST = 1;
    private static final int CHECK_MY_ORDER = 2;
    private static final int CHECK_MY_CART = 3;
    private static final int CHECK_MY_PROFILE = 4;
    private static final int LOGOUT = 5;

    public CustomerUI(Customer customer) {
        this.customer = customer;
        mainUI();
    }

    /**
     * 顾客主界面
     */
    public void mainUI() {
        OutputUtils.outputln("欢迎顾客：" + customer.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看商品列表");
        OutputUtils.outputln("2.查看我的订单");
        OutputUtils.outputln("3.查看我的购物车");
        OutputUtils.outputln("4.查看我的个人信息");
        OutputUtils.outputln("5.退出登陆");
    }

    public int chooseOptions() {
        int x = InputUtils.inputInt();
        switch (x) {
            case CHECK_ITEM_LIST:
                checkItemList();
                break;
            case CHECK_MY_ORDER:
                checkMyOrder();
                break;
            case CHECK_MY_CART:
                checkMyCart();
                break;
            case CHECK_MY_PROFILE:
                checkMyProfile();
                break;
            case LOGOUT:
                break;
            default:
                Logger.getAnonymousLogger().log(Level.WARNING, "无此选项");
                return -1;
        }
        return x;
    }

    /**
     * 查看商品列表
     */
    public void checkItemList() {
        OutputUtils.clear();
        OutputUtils.outputln("已发布的商品信息如下：");
        ItemList.printItemList();
    }

    /**
     * 查看订单
     */
    public void checkMyOrder() {
        OutputUtils.clear();
        OutputUtils.outputln("我的订单如下：");
    }

    /**
     * 查看购物车
     */
    public void checkMyCart() {
        OutputUtils.clear();
        OutputUtils.outputln("购物车信息如下：");
        customer.printCart();
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.结算\t2.删除\t3.退出");
        int x = InputUtils.inputInt();
        if (x == 1) {
            double sum = customer.pay();
            OutputUtils.outputln("需要支付：" + sum + "元");
            OutputUtils.outputln("1.支付\t2.取消");
            x = InputUtils.inputInt();
            if (x == 1) {
                customer.clearCart();
                OutputUtils.outputln("支付成功！");
            }else if (x == 2) {
                //TODO：清屏重新加载
            }else {
                Logger.getAnonymousLogger().log(Level.WARNING, "无此选项");
            }
        }else if (x == 2) {
            OutputUtils.output("请输入删除的商品编号及数量：");
            x = InputUtils.inputInt();
            int n = InputUtils.inputInt();
            if (customer.removeItem(x, n)) {
                OutputUtils.outputln("删除成功");
            }else {
                OutputUtils.outputln("删除失败");
            }
        }else if (x == 3) {

        } else {
            OutputUtils.outputln("无此选项！");
        }
    }

    /**
     * 查看个人信息
     */
    public void checkMyProfile() {
        OutputUtils.clear();
        OutputUtils.outputln(customer.toString());
    }

}
