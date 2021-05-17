package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	//�������ݿ��е�finsal_work��
    public static final String URL = "jdbc:mysql://localhost:3306/finsal_work";
    //���ݿ��û���
    public static final String USER = "root";
    //���ݿ�����
    public static final String PASSWORD = "123456";
    
    
    public static Connection getConnection() throws Exception {
    	//����mysql�������������ݿ⣩
        Class.forName("com.mysql.jdbc.Driver");
        //ͨ���û����������������ݿ���ָ���ı�
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