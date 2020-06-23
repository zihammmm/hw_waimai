package sample.Database;


import sample.Item.CartItem;
import sample.Item.Item;
import sample.Item.ItemList;
import sample.User.User;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zihan
 * 获得数据库连接
 */
public class Conn {
    private static Connection connection = null;
    private static String dbPath = "jdbc:mariadb://118.178.89.205:3306/waimai?characterEncoding=utf-8&user=webproject&password=123456";
    private Conn() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (connection != null) {
            connection.close();
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(dbPath);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static boolean checkUser(String name, String pw) {
        String sql = "SELECT * FROM user WHERE name = ? AND pw = ?";
        try(PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, pw);
            ResultSet resultSet = pstmt.executeQuery();
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public static List<CartItem> getCart(int userID) {
        String sql = "SELECT item_id, num FROM cart WHERE user_id = ?";
        try(PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, userID);
            ResultSet resultSet = pstmt.executeQuery();
            List<CartItem> cartItemList = new LinkedList<>();
            while (resultSet.next()) {
                CartItem cartItem = new CartItem(ItemList.getItemByID(resultSet.getInt(1))
                        , resultSet.getInt(2));
                cartItemList.add(cartItem);
            }
            return cartItemList;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }


}
