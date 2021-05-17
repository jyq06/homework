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
		//获取用户输入的用户名和密码
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		
		/*
		 * 检查用户名与密码是否存在（LoginCheck判断user表中是否有用户名与密码）
		 * 对检查的结果实例化对象给user
		 */
		User user = new LoginCheck().checkLogin(username,passwd);
		
		/*
		 * 对检查的结果进行判断
		 * 如果存在检查结果，表示该用户名存在，则跳转到主界面
		 * 结果不存在（为空），表中该账户或者密码错误，跳转到该登录界面
		 */
		if(user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "账号或者密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
