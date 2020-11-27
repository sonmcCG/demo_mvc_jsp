package models.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class ConnectMySqlDb {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
