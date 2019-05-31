package com.briup.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.PManager;
import com.briup.service.ITeacherService;
import com.briup.service.Impl.TeacherServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String tablename = request.getParameter("tablename");
		ITeacherService iTeacherService = new TeacherServiceImpl();
		PManager pManager = null;
		String path = "employee1.jsp";
	
			try {
				pManager = iTeacherService.login(name, password, tablename);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		//登录成功，将用户储存到session
		request.getSession().setAttribute("pManager",pManager);
		
		if (tablename.equals("employee")) {
			if(pManager!=null){
				//跳转到首页
				response.sendRedirect(path);
			}else {
				//跳转到登录
				response.sendRedirect("false.jsp");
			}
		}else if (tablename.equals("hr")) {
			if(pManager!=null){
				//跳转到首页
				response.sendRedirect("hr1.jsp");
			}else {
				//跳转到登录
				response.sendRedirect("false.jsp");
			}
		}else {
			if(pManager!=null){
				//跳转到首页
				response.sendRedirect("account1.jsp");
			}else {
				//跳转到登录
				response.sendRedirect("false.jsp");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
