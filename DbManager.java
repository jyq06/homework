package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	//连接数据库中的finsal_work表
    public static final String URL = "jdbc:mysql://localhost:3306/finsal_work";
    //数据库用户名
    public static final String USER = "root";
    //数据库密码
    public static final String PASSWORD = "123456";
    
    
    public static Connection getConnection() throws Exception {
    	//加载mysql驱动（连接数据库）
        Class.forName("com.mysql.jdbc.Driver");
        //通过用户名与密码连接数据库中指定的表
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;

    }

    
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}