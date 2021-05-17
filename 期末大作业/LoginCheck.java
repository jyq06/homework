package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.User;
import db.DbManager;
public class LoginCheck {
	//��¼ʱ����û�������û����������Ƿ���ȷ��������һ������
	public User checkLogin(String username,String passwd) {//���﷽������������ΪUser�����û�������Ϣ�����β�Ϊ���������
		User user = null;
		try {
			//�������ݿ�
			Connection conn = DbManager.getConnection();
			//���û���������������ݿ��н��в�ѯ
			String sql = "select * from user where username = ? and passwd = ?";
			//����ʱ��ȡ��¼���û�����������Ϣ����Ϊ����������
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, passwd);
			//��ѯ�������һ�������������
			ResultSet rs = stmt.executeQuery();
			
			/*
			 * ֻҪ�������Ϊ0����ִ��ѭ����
			 * �����ѯ�ĵĽ��ֻ��ֻ�о�һ����ԭ�������û���ΪΨһ�����������ܳ���������
			 * �Ӳ�ѯ���Ľ����ȡ���û���������Ϣ
			 * ����Ϣʵ������һ�����󣬲����ظö���
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
