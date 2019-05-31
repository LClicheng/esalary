package com.briup.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.briup.bean.PManager;
import com.briup.bean.TeacherBI;
import com.briup.bean.Teachersalary;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.ITeacher;
import com.briup.dao.Impl.TeacherDao;
import com.briup.service.ITeacherService;

public class TeacherServiceImpl implements ITeacherService {
	private Connection conn=ConnectionFactoryUtil.getConnection();
	private ITeacher teacherDap= new TeacherDao(conn);
	@Override
	public PManager login(String username, String password,String tablename) throws SQLException {
		PManager p = teacherDap.findPManger(username, tablename);
		System.out.println(p);
		String dbPassword = "";
		if(p == null){
			// 2、如果取出的用户信息为空，则直接 返回 false
			return null;
		}else{
			// 3、如果取出的用户信息不为空，则从用户信息中取出密码
			dbPassword = p.getPassword();
			System.out.println(dbPassword);
		}
		// 4、将取出的密码和参数中的密码进行比较
		if(dbPassword.equals(password)){
			PManager dbc = teacherDap.findPManger(username,tablename);
			return dbc;
		}else{
			return null;
		}
	}

	

	@Override
	public TeacherBI findBinformation(String id) {
		// TODO Auto-generated method stub
		return teacherDap.findBinformation(id);
	}

	@Override
	public Teachersalary finSalary(String id) {
		// TODO Auto-generated method stub
		return teacherDap.finSalary(id);
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public PManager register(String username, String password) throws SQLException {
		
		return teacherDap.addPManager(username, password);
	}
	



}
