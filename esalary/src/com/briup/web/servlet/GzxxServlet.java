package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Teachersalary;
import com.briup.service.ITeacherService;
import com.briup.service.Impl.TeacherServiceImpl;

/**
 * Servlet implementation class Gzxx
 */
@WebServlet("/gzxx.do")
public class GzxxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GzxxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		String username = request.getParameter("username");
		ITeacherService iTeacherService = new TeacherServiceImpl();
		Teachersalary teachersalary = null;
		teachersalary = iTeacherService.finSalary(username);
		application.setAttribute("teachersalary",teachersalary);
		request.getRequestDispatcher("gzxx.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
