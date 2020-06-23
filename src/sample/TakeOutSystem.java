package sample;

import sample.Database.Conn;
import sample.Item.Item;
import sample.Output.Output;
import sample.Output.OutputUtils;
import sample.User.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class TakeOutSystem {
    private static User user = null;
    private static List<Item> items = new ArrayList<>();
    private Connection connection = null;

    public TakeOutSystem(){
        OutputUtils.outputln("正在初始化。。。请稍后");
        connection = Conn.getConnection();

    }

    private void welcome() {
        OutputUtils.outputln("欢迎使用本软件！");
        OutputUtils.outputln("请输入您想要执行的操作的选项：");
        OutputUtils.outputln("1:登陆");
        OutputUtils.outputln("2:退出");
    }

    public static List<Item> getItemsInstance() {
        return items;
    }

    /**
     * 登陆
     * @param id
     * @param pwd
     * @return
     */
    public boolean login(int id, String pwd){
        OutputUtils.outputln("登陆");
        OutputUtils.output("请输入账号：");
        OutputUtils.output("请输入密码：");
        return true;
    }

    /**
     * 顾客主界面
     */
    private void customerMainUI() {
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
    private void merchantMainUI() {
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
    private void maintainerMainUI() {
        OutputUtils.outputln("欢迎维护人员：" + user.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看");
    }

    /**
     * 登出
     * @return
     */
    public boolean logout(){
        if (user == null){
            return false;
        }

        user = null;
        return true;
    }
}
