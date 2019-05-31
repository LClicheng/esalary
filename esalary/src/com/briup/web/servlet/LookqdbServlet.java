package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.Sign;
import com.briup.common.exception.HrServiceException;
import com.briup.service.IHrService;
import com.briup.service.Impl.HrServiceImpl;

/**
 * Servlet implementation class Lookqdb
 */
@WebServlet("/lookqdb.do")
public class LookqdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LookqdbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		IHrService iHrService = new HrServiceImpl();
		//List<Sign> sign = null;
		try {
			List<Sign> signs = iHrService.findSign();
			application.setAttribute("signs", signs);
		} catch (HrServiceException e) {
			
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("lookqdb.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
