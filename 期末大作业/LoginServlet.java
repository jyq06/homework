package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import db.LoginCheck;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�û�������û���������
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		
		/*
		 * ����û����������Ƿ���ڣ�LoginCheck�ж�user�����Ƿ����û��������룩
		 * �Լ��Ľ��ʵ���������user
		 */
		User user = new LoginCheck().checkLogin(username,passwd);
		
		/*
		 * �Լ��Ľ�������ж�
		 * ������ڼ��������ʾ���û������ڣ�����ת��������
		 * ��������ڣ�Ϊ�գ������и��˻��������������ת���õ�¼����
		 */
		if(user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "�˺Ż����������");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
