package com.briup.service;

import java.sql.SQLException;
import java.util.List;

import com.briup.bean.PManager;
import com.briup.bean.TeacherBI;
import com.briup.bean.Teachersalary;

public interface ITeacherService {
	/**
	 * 登录
	 * @throws SQLException 
	 * */
	 PManager login(String username,String password,String tablename) throws SQLException;
	 /**
	 * 注册
	 * @throws SQLException 
	 * */
	 PManager register(String username, String password) throws SQLException;
	 //按照id查找基本信息
	 TeacherBI findBinformation(String id);
	 //按照id查找工资信息
	 Teachersalary finSalary(String id);
	 //按照id删除基本信息
	 void remove(String id);
	 
}
