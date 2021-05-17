package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.User;
import db.DbManager;
public class LoginCheck {
	//登录时检查用户输入的用户名与密码是否正确，并返回一个对象
	public User checkLogin(String username,String passwd) {//这里方法的数据类型为User对象（用户所有信息），形参为对象的属性
		User user = null;
		try {
			//连接数据库
			Connection conn = DbManager.getConnection();
			//对用户输入的密码在数据库中进行查询
			String sql = "select * from user where username = ? and passwd = ?";
			//连接时获取登录的用户名与密码信息，作为参数（？）
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, passwd);
			//查询结果返回一个集（结果集）
			ResultSet rs = stmt.executeQuery();
			
			/*
			 * 只要结果集不为0，则执行循环体
			 * 这里查询的的结果只能只有就一个（原因在于用户名为唯一主键，不可能出现重名）
			 * 从查询到的结果获取该用户的所有信息
			 * 把信息实例化成一个对象，并返回该对象
			 */
			while(rs.next()){
				String un = rs.getString("username");
				String pw = rs.getString("passwd");
				String sex = rs.getString("sex");
				String brithday = rs.getString("birthday");
				String hobby = rs.getString("hobby");
				String introduce = rs.getString("introduce");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				user = new User(un, pw, sex, brithday, hobby, email, introduce, age);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
