package sample;

import sample.Database.Conn;
import sample.Input.InputUtils;
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

        welcome();
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
     * @return
     */
    public boolean login(){
        OutputUtils.outputln("登陆");
        OutputUtils.output("请输入账号：");
        String acc = InputUtils.inputString();
        OutputUtils.output("请输入密码：");
        String pwd = InputUtils.inputString();
        return true;
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
