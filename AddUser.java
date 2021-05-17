package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class AddUser {
	public boolean insertUser(User user) {
		//定义变量，用于判断数据插入数据库
		boolean flag = false;
		try {
			//连接数据库
			Connection conn = DbManager.getConnection();
			//获取用户注册的信息，并把信息插入数据库对应的表user中
			String sql = "insert into user values(?,?,?,?,?,?,?,?)";
			//连接数据库需要插入的参数
			PreparedStatement stmt = conn.prepareStatement(sql);
			//发送插入参数（1，2，~对应插入参数（(?,?,?,?,?,?,?,?)））
			stmt.setString(1,user.getUsername());
			stmt.setString(2, user.getPasswd());
			stmt.setString(3, user.getSex());
			stmt.setString(4, user.getBrithday());
			stmt.setString(5, user.getHobby());
			stmt.setString(6, user.getEmial());
			stmt.setString(7,user.getIntroduce());
			stmt.setInt(8, user.getAge());
			//判断插入数据库user表中的数据是否插入成功
			flag = stmt.executeUpdate()>=1?true:false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
}
