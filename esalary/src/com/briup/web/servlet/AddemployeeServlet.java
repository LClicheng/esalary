package com.briup.web.servlet;

import java.io.IOException;

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
 * Servlet implementation class AddemployeeServlet
 */
@WebServlet("/addemployee.do")
public class AddemployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddemployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		String id = request.getParameter("Id");
		String  username = request.getParameter("username");
		String sex = request.getParameter("sex");
		String cardNumber = request.getParameter("cardNumber");
		String nation = request.getParameter("nation");
		String birthday = request.getParameter("birthday");
		String department = request.getParameter("department");
		String positionName = request.getParameter("position");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String editTime = request.getParameter("editTime");
		TeacherBI teacherBI = new TeacherBI();
		teacherBI.setId(id);
		teacherBI.setUsername(username);
		teacherBI.setSex(sex);
		teacherBI.setCardNumber(cardNumber);
		teacherBI.setNation(nation);
		teacherBI.setBirthday(birthday);
		teacherBI.setDepartment(department);
		teacherBI.setPositionName(positionName);
		teacherBI.setTelephone(telephone);
		teacherBI.setEmail(email);
		teacherBI.setEditTime(editTime);
		
		application.setAttribute("teacherBI", teacherBI);
		IHrService iHrService = new HrServiceImpl();
		try {
			iHrService.savaTeacherBI(teacherBI);
		} catch (HrServiceException e) {
			
			e.printStackTrace();
		}
		request.getRequestDispatcher("hr1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
