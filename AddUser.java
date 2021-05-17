package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class AddUser {
	public boolean insertUser(User user) {
		//��������������ж����ݲ������ݿ�
		boolean flag = false;
		try {
			//�������ݿ�
			Connection conn = DbManager.getConnection();
			//��ȡ�û�ע�����Ϣ��������Ϣ�������ݿ��Ӧ�ı�user��
			String sql = "insert into user values(?,?,?,?,?,?,?,?)";
			//�������ݿ���Ҫ����Ĳ���
			PreparedStatement stmt = conn.prepareStatement(sql);
			//���Ͳ��������1��2��~��Ӧ���������(?,?,?,?,?,?,?,?)����
			stmt.setString(1,user.getUsername());
			stmt.setString(2, user.getPasswd());
			stmt.setString(3, user.getSex());
			stmt.setString(4, user.getBrithday());
			stmt.setString(5, user.getHobby());
			stmt.setString(6, user.getEmial());
			stmt.setString(7,user.getIntroduce());
			stmt.setInt(8, user.getAge());
			//�жϲ������ݿ�user���е������Ƿ����ɹ�
			flag = stmt.executeUpdate()>=1?true:false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
}
