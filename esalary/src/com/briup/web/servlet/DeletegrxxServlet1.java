package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.common.exception.HrServiceException;
import com.briup.service.IHrService;
import com.briup.service.Impl.HrServiceImpl;


/**
 * Servlet implementation class DeletegrxxServlet1
 */
@WebServlet("/deletegrxx1.do")
public class DeletegrxxServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletegrxxServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletContext application = request.getServletContext();
		String id = request.getParameter("id");
		IHrService iHrService = new HrServiceImpl();
		try {
			iHrService.removeTeacherBI(id);
			
		} catch (HrServiceException e) {
			
			e.printStackTrace();
		}
		System.out.println(id);
		request.getRequestDispatcher("deletegrxx.do").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
