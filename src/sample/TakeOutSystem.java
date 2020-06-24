package sample;

import sample.Database.Conn;
import sample.Input.InputUtils;
import sample.Item.Item;
import sample.Item.ItemList;
import sample.Output.OutputUtils;
import sample.User.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TakeOutSystem {
    private static User user = null;
    private Connection connection = null;

    public TakeOutSystem(){
        OutputUtils.outputln("正在初始化。。。请稍后");
        //connection = Conn.getConnection();

        welcome();
    }

    public void welcome() {
        OutputUtils.outputln("欢迎使用本软件！");
        OutputUtils.outputln("请输入您想要执行的操作的选项：");
        OutputUtils.outputln("1:登陆");
        OutputUtils.outputln("2:退出");
        int x = InputUtils.inputInt();
        if (x == 1) {
            String res = login();
            if (res == null) {
                OutputUtils.outputln("登陆失败");
            }else {
                //TODO:三种类型
            }
        }else if (x == 2){

        }else {
            Logger.getAnonymousLogger().log(Level.WARNING, "无此选项");
        }
    }

    /**
     * 登陆
     * @return
     */
    public String login(){
        OutputUtils.outputln("登陆");
        OutputUtils.output("请输入账号：");
        String acc = InputUtils.inputString();
        OutputUtils.output("请输入密码：");
        String pwd = InputUtils.inputString();
        return Conn.checkUser(acc, pwd);
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
