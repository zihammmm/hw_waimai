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
        OutputUtils.outputln("���ڳ�ʼ�����������Ժ�");
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
        OutputUtils.outputln("��ӭʹ�ñ������");
        OutputUtils.outputln("����������Ҫִ�еĲ�����ѡ�");
        OutputUtils.outputln("1:��½");
        OutputUtils.outputln("2:�˳�");
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
     * ��½
     * @return
     */
    public boolean login() {
        OutputUtils.outputln("��½");
        OutputUtils.output("�������˺ţ�");
        String acc = InputUtils.inputString();
        OutputUtils.output("���������룺");
        String pwd = InputUtils.inputString();
        String res = Conn.checkUser(acc, pwd);
        if (res == null) {
            OutputUtils.outputln("��½ʧ��");
            return false;
        }else {
            //TODO:��������,����User
            if (res.equals("")) {

            }
            return true;
        }
    }

    public void exit() {
        OutputUtils.clear();
        OutputUtils.outputln("��лʹ�ã�");
        UIUtils.waitOneSecond();
    }

}
