package com.briup.dao;

import java.util.List;

import com.briup.bean.Teachersalary;
import com.briup.common.exception.AccountServiceException;

public interface IAccountDao {
	List<Teachersalary> findTeachersalary() throws AccountServiceException;
	void saveTeacherSalary(Teachersalary teachersalary) throws AccountServiceException;
	void removeTeacherSalary(String id) throws AccountServiceException;
}
