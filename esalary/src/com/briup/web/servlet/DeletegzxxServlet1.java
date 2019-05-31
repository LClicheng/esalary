package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.common.exception.AccountServiceException;
import com.briup.dao.IAccountDao;
import com.briup.service.IAccountService;
import com.briup.service.Impl.AccountServiceImpl;

/**
 * Servlet implementation class DeletegzxxServlet1
 */
@WebServlet("/deletegzxx1.do")
public class DeletegzxxServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletegzxxServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		IAccountService iAccountService = new AccountServiceImpl();
		try {
			iAccountService.removeTeacherSalary(id);
		} catch (AccountServiceException e) {
			
			e.printStackTrace();
		}
		System.out.println(id);
		request.getRequestDispatcher("deletegzxx.do").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
