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
        OutputUtils.outputln("���ڳ�ʼ�����������Ժ�");
        //connection = Conn.getConnection();

        welcome();
    }

    public void welcome() {
        OutputUtils.outputln("��ӭʹ�ñ������");
        OutputUtils.outputln("����������Ҫִ�еĲ�����ѡ�");
        OutputUtils.outputln("1:��½");
        OutputUtils.outputln("2:�˳�");
        int x = InputUtils.inputInt();
        if (x == 1) {
            String res = login();
            if (res == null) {
                OutputUtils.outputln("��½ʧ��");
            }else {
                //TODO:��������
            }
        }else if (x == 2){

        }else {
            Logger.getAnonymousLogger().log(Level.WARNING, "�޴�ѡ��");
        }
    }

    /**
     * ��½
     * @return
     */
    public String login(){
        OutputUtils.outputln("��½");
        OutputUtils.output("�������˺ţ�");
        String acc = InputUtils.inputString();
        OutputUtils.output("���������룺");
        String pwd = InputUtils.inputString();
        return Conn.checkUser(acc, pwd);
    }

    /**
     * �ǳ�
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
