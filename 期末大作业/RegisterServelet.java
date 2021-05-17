package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import db.AddUser;

/**
 * Servlet implementation class RegisterServelet
 */
@WebServlet("/RegisterServelet")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServelet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Register");
		//�����û���Ϣ����
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		int age = Integer.parseInt(request.getParameter("age"));
		String hobby = request.getParameter("hobby");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		String brithday = request.getParameter("birthday");
		//�û���Ϣ������ʵ����
		User user = new User(username, passwd, sex, brithday, hobby, email, introduce, age);
		//ʵ��������󣬰��û���Ϣ�������ݿ���,����ɹ�����true ����false
		boolean flag = new AddUser().insertUser(user);
		/*�жϲ������ݿ�������Ƿ�ɹ�
		 * �ɹ�����ת����¼������е�¼
		 * ʧ�ܣ���ʾ���û����Ѿ����ڣ������ݿ��б���������û��������û�����Ψһ�ģ�������ת��ע��ҳ�棬����ע��
		 */
		if(flag) {
			request.setAttribute("msg", "ע��ɹ�,�������");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "�û����Ѿ����ڣ������һ����");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
