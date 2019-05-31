package com.briup.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.PManager;
import com.briup.service.ITeacherService;
import com.briup.service.Impl.TeacherServiceImpl;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register.do")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ITeacherService iTeacherService = new TeacherServiceImpl();
		PManager pManager = new PManager();
		pManager.setUsername(username);
		pManager.setPassword(password);
		try {
			pManager = iTeacherService.register(username, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		//登录成功，将用户储存到session
		//Customer customer = new Customer(name,"password");
		session.setAttribute("pManager",pManager);
		
		response.sendRedirect("employee.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
