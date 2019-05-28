package com.szkj.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.szkj.bean.StoreKeeper;
import com.szkj.service.IStoreKeeperService;
import com.szkj.service.impl.StoreKeeperServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		StoreKeeper storeKeeper;
		IStoreKeeperService ss = new StoreKeeperServiceImpl();
		String path = "cangku.html";
		try {
			storeKeeper = ss.login(id, password);
			System.out.println(storeKeeper);
			if(storeKeeper!=null){
				//跳转到首页
				response.sendRedirect(path);
			}else {
				//跳转到登录
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
