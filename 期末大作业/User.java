package bean;

import java.util.Date;
/*
 * �������ݿ���е��ֶ���Ϊ˽�б��������д�ŵ����ݲ��ܶ��⹫�������밮�õȣ���
 * ����ȡ�����ֶ�����Ӧ��ֵ
 */
public class User {
	private String username;
	private String passwd;
	private String sex;
	private String brithday;
	private String hobby;
	private String emial;
	private String introduce;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//������󣬷��������������
	public User() {
	}
	public User(String username, String passwd, String sex, String brithday, String hobby, String emial, String introduce,
			int age) {
		super();
		this.username = username;
		this.passwd = passwd;
		this.sex = sex;
		this.brithday = brithday;
		this.hobby = hobby;
		this.emial = emial;
		this.introduce = introduce;
		this.age = age;
	}
	
	
}
