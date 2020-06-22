package sample.Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zihan
 * 获得数据库连接
 */
public class Conn {
    private static Connection connection = null;
    private static String dbPath = "jdbc:mariadb://118.178.89.205:3306/user?useSSL=true&characterEncoding=utf-8&user=webproject&password=123456";

    private Conn() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(dbPath);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}