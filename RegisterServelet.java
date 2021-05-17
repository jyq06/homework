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
		//定义用户信息变量
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		int age = Integer.parseInt(request.getParameter("age"));
		String hobby = request.getParameter("hobby");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		String brithday = request.getParameter("birthday");
		//用户信息，对象实例化
		User user = new User(username, passwd, sex, brithday, hobby, email, introduce, age);
		//实例化对象后，把用户信息插入数据库中,插入成功返回true 否则false
		boolean flag = new AddUser().insertUser(user);
		/*判断插入数据库的数据是否成功
		 * 成功，跳转到登录界面进行登录
		 * 失败，表示该用户名已经存在（在数据库中表的主键是用户名，故用户名是唯一的），则跳转到注册页面，重新注册
		 */
		if(flag) {
			request.setAttribute("msg", "注册成功,你真棒！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "用户名已经存在，请给换一个！");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
