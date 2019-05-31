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

import com.briup.bean.TeacherBI;
import com.briup.common.exception.HrServiceException;
import com.briup.service.IHrService;
import com.briup.service.Impl.HrServiceImpl;

/**
 * Servlet implementation class LookgrxxServlet
 */
@WebServlet("/deletegrxx.do")
public class DeletegrxxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		//String caozuo = request.getParameter("caozuo");
		List<TeacherBI> teacherBIs = new ArrayList<>();
		IHrService iHrService = new HrServiceImpl();
		try {
			teacherBIs = iHrService.findTeacherBI();
			application.setAttribute("teacherBIs", teacherBIs);
		} catch (HrServiceException e) {
			
			e.printStackTrace();
		}
		//System.out.println(caozuo);
//		if (caozuo.equals("查看教职工基本信息")) {
//			response.sendRedirect("lookgrxx.jsp");
//		}else {
//			response.sendRedirect("deletegrxx.jsp");
//		}
		response.sendRedirect("deletegrxx.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
