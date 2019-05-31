package com.briup.dao;

import java.sql.SQLException;
import java.util.List;

import com.briup.bean.PManager;
import com.briup.bean.TeacherBI;
import com.briup.bean.Teachersalary;

public interface ITeacher {
	//按照id查找基本信息
	TeacherBI findBinformation(String id);
	//按照id查找工资信息
	Teachersalary finSalary(String id);
	//按照id删除基本信息
	void remove(String id);
	//添加教职工
	void addTeacherBI(TeacherBI teacherBI);
	//添加教职工工资信息
	void addTeachersalary(Teachersalary teachersalary);
	PManager findPManger(String username, String tablename) throws SQLException;
	PManager addPManager(String username,String password) throws SQLException;
}
