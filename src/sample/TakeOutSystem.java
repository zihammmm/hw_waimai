package sample;

import sample.Database.Conn;
import sample.Item.Item;
import sample.User.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class TakeOutSystem {
    private static User user = null;
    private static List<Item> items = new ArrayList<>();
    private Connection connection = null;

    public TakeOutSystem(){
        connection = Conn.getConnection();

    }

    public static List<Item> getItemsInstance() {
        return items;
    }

    public boolean login(int id, String pwd){

        return true;
    }

    public boolean logout(){
        if (user == null){
            return false;
        }

        user = null;
        return true;
    }
}
