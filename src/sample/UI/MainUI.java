package sample.UI;

import jdk.nashorn.internal.runtime.regexp.joni.Warnings;
import sample.Output.OutputUtils;
import sample.User.Customer;
import sample.User.Maintainer;
import sample.User.Merchant;
import sample.User.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainUI {
    /**
     * 顾客主界面
     */
    public void customerMainUI(User user) {
        if (!(user instanceof Customer)) {
            Logger.getAnonymousLogger().log(Level.WARNING, "类型不符" + user.toString());
            return;
        }
        OutputUtils.outputln("欢迎顾客：" + user.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看商品列表");
        OutputUtils.outputln("2.查看我的订单");
        OutputUtils.outputln("3.查看我的购物车");
        OutputUtils.outputln("4.查看我的个人信息");
        OutputUtils.outputln("5.退出登陆");
    }

    /**
     * 商家主界面
     */
    public void merchantMainUI(User user) {
        if (!(user instanceof Merchant)) {
            Logger.getAnonymousLogger().log(Level.WARNING, "类型不符" + user.toString());
            return;
        }
        OutputUtils.outputln("欢迎商家：" + user.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看我发布的商品");
        OutputUtils.outputln("2.查看我收到的订单");
        OutputUtils.outputln("3.发布商品");
        OutputUtils.outputln("4.退出登陆");
    }

    /**
     * 维护人员主界面
     */
    public void maintainerMainUI(User user) {
        if (!(user instanceof Maintainer)) {
            Logger.getAnonymousLogger().log(Level.WARNING, "类型不符: " + user.toString() );
            return;
        }
        OutputUtils.outputln("欢迎维护人员：" + user.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看");
    }
}
