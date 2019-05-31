package com.briup.service;

import java.util.List;

import com.briup.bean.Sign;
import com.briup.bean.TeacherBI;
import com.briup.common.exception.HrServiceException;

public interface IHrService {
	List<Sign> findSign() throws HrServiceException;
	Sign saveSign(Sign sign) throws HrServiceException;
	List<TeacherBI> findTeacherBI() throws HrServiceException;
	TeacherBI savaTeacherBI(TeacherBI teacherBI) throws HrServiceException;
	void removeTeacherBI(String id) throws HrServiceException;
}
