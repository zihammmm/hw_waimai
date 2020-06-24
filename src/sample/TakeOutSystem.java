package sample;

import sample.Database.Conn;
import sample.Input.InputUtils;
import sample.Output.OutputUtils;
import sample.UI.UIUtils;
import sample.User.User;

import java.sql.Connection;

public class TakeOutSystem {
    private static User user = null;
    private Connection connection = null;
    private static final int LOGIN = 1;
    private static final int EXIT = 2;

    public TakeOutSystem(){
        OutputUtils.outputln("正在初始化。。。请稍后");
        //connection = Conn.getConnection();

        mainUI();
    }

    public void mainUI() {
        do {
            OutputUtils.clear();
            options();
        }while(chooseOptions() != EXIT);
    }

    public void options() {
        OutputUtils.outputln("欢迎使用本软件！");
        OutputUtils.outputln("请输入您想要执行的操作的选项：");
        OutputUtils.outputln("1:登陆");
        OutputUtils.outputln("2:退出");
    }

    public int chooseOptions() {
        int x = InputUtils.inputInt();
        switch (x) {
            case LOGIN:
                login();
                break;
            case EXIT:
                exit();
                break;
            default:
        }
        return x;
    }

    /**
     * 登陆
     * @return
     */
    public boolean login() {
        OutputUtils.outputln("登陆");
        OutputUtils.output("请输入账号：");
        String acc = InputUtils.inputString();
        OutputUtils.output("请输入密码：");
        String pwd = InputUtils.inputString();
        String res = Conn.checkUser(acc, pwd);
        if (res == null) {
            OutputUtils.outputln("登陆失败");
            return false;
        }else {
            //TODO:三种类型,设置User
            if (res.equals("")) {

            }
            return true;
        }
    }

    public void exit() {
        OutputUtils.clear();
        OutputUtils.outputln("感谢使用！");
        UIUtils.waitOneSecond();
    }

}
