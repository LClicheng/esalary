package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Sign;
import com.briup.common.exception.HrServiceException;
import com.briup.dao.Impl.HrDao;

/**
 * Servlet implementation class AddSign
 */
@WebServlet("/addSign.do")
public class AddSignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		Sign sign = new Sign();
		String id = request.getParameter("Id");
		String username = request.getParameter("username");
		String department = request.getParameter("department");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String get = request.getParameter("get");
		String lost = request.getParameter("lost");
		sign.setId(id);
		sign.setUsername(username);
		sign.setDepartment(department);
		sign.setYear(year);
		sign.setMonth(month);
		sign.setGet(get);
		sign.setLost(lost);
		HrDao hrDao = new HrDao();
		try {
			hrDao.saveSign(sign);
			application.setAttribute("sign",sign);
		} catch (HrServiceException e) {
			
			e.printStackTrace();
		}
		response.sendRedirect("showqdb.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
