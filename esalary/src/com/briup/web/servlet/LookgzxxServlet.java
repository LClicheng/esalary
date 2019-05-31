package com.briup.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Teachersalary;
import com.briup.common.exception.AccountServiceException;
import com.briup.service.IAccountService;
import com.briup.service.Impl.AccountServiceImpl;

/**
 * Servlet implementation class LookgzxxServlet
 */
@WebServlet("/lookgzxx.do")
public class LookgzxxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LookgzxxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		List<Teachersalary> teachersalarys = new ArrayList<>();
		IAccountService iAccountService = new AccountServiceImpl();
		try {
			teachersalarys = iAccountService.findTeachersalary();
			application.setAttribute("teachersalarys", teachersalarys);
		} catch (AccountServiceException e) {
			
			e.printStackTrace();
		}
		response.sendRedirect("lookgzxx.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
