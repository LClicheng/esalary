package com.briup.service.Impl;

import java.sql.Connection;
import java.util.List;

import com.briup.bean.Sign;
import com.briup.bean.TeacherBI;
import com.briup.common.exception.HrServiceException;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.IHrDao;
import com.briup.dao.Impl.HrDao;
import com.briup.service.IHrService;

public class HrServiceImpl implements IHrService {
	private Connection conn=ConnectionFactoryUtil.getConnection();
	IHrDao hrDao = new HrDao(conn);
	@Override
	public List<Sign> findSign() throws HrServiceException {

		return hrDao.findSign();
	}

	@Override
	public Sign saveSign(Sign sign) throws HrServiceException {

		return hrDao.saveSign(sign);
	}

	@Override
	public List<TeacherBI> findTeacherBI() throws HrServiceException {

		return hrDao.findTeacherBI();
	}

	@Override
	public TeacherBI savaTeacherBI(TeacherBI teacherBI) throws HrServiceException {

		return hrDao.savaTeacherBI(teacherBI);
	}

	@Override
	public void removeTeacherBI(String id) throws HrServiceException {
		hrDao.removeTeacherBI(id);
	}

}
