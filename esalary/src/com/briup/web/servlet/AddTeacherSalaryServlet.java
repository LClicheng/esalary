package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Teachersalary;
import com.briup.common.exception.AccountServiceException;
import com.briup.dao.Impl.AccountDao;

/**
 * Servlet implementation class AddTeacherSalaryServlet
 */
@WebServlet("/addTeacherSalary.do")
public class AddTeacherSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		Teachersalary teachersalary = new Teachersalary();
		String id = request.getParameter("Id");
		String username = request.getParameter("username");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String basic = request.getParameter("basic");
		String overtime = request.getParameter("overtime");
		String reward = request.getParameter("reward");
		String reduce = request.getParameter("reduce");
		String revenue = request.getParameter("revenue");
		String realWage = request.getParameter("realWage");
		String editTime = request.getParameter("editTime");
		teachersalary.setId(id);
		teachersalary.setUsername(username);
		teachersalary.setYear(year);
		teachersalary.setMonth(month);
		teachersalary.setBasic(basic);
		teachersalary.setOvertime(overtime);
		teachersalary.setReward(reward);
		teachersalary.setReduce(reduce);
		teachersalary.setRevenue(revenue);
		teachersalary.setRealWage(realWage);
		teachersalary.setEditTime(editTime);
		AccountDao accountDao = new AccountDao();
		try {
			accountDao.saveTeacherSalary(teachersalary);
		} catch (AccountServiceException e) {
			
			e.printStackTrace();
		}
		response.sendRedirect("account1.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
