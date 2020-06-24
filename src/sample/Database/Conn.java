package sample.Database;


import sample.Item.CartItem;
import sample.Item.Item;
import sample.Item.ItemList;
import sample.Item.Order;
import sample.User.UserType;

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

    /**
     * 登陆
     * @param name
     * @param pw
     * @return 用户类型
     */
    public static String checkUser(String name, String pw) {
        String sql = "SELECT * FROM user WHERE name = ? AND pw = ?";
        try(PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, pw);
            ResultSet resultSet = pstmt.executeQuery();
            resultSet.next();
            return resultSet.getString("user_type");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    /**
     * 拉取购物车
     * @param userID
     * @return
     */
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

    /**
     * 添加商品后将商品插入到数据库中
     * @param item
     * @return
     */
    public static int insertItemIntoDB(Item item) {
        //TODO: 插入到数据库中
        return 0;
    }

    /**
     * 拉取订单信息
     * @param userID
     * @return
     */
    public static List<Order> getOrderList(int userID) {
        List<Order> orderList = new LinkedList<>();

        return orderList;
    }

    public static List<Item> getItemList(int userID) {
        List<Item> itemList = new LinkedList<>();

        return itemList;
    }

}
