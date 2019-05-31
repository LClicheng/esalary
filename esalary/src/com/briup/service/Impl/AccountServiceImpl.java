package com.briup.service.Impl;

import java.sql.Connection;
import java.util.List;

import com.briup.bean.Teachersalary;
import com.briup.common.exception.AccountServiceException;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.Impl.AccountDao;
import com.briup.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	private Connection conn=ConnectionFactoryUtil.getConnection();
	AccountDao accountDao = new AccountDao(conn);
	@Override
	public List<Teachersalary> findTeachersalary() throws AccountServiceException {

		return accountDao.findTeachersalary();
	}

	@Override
	public void saveTeacherSalary(Teachersalary teachersalary) throws AccountServiceException {
		accountDao.saveTeacherSalary(teachersalary);
	}

	@Override
	public void removeTeacherSalary(String id) throws AccountServiceException {
		accountDao.removeTeacherSalary(id);
	}

}
