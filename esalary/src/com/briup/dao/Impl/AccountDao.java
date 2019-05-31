package com.briup.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Teachersalary;
import com.briup.common.exception.AccountServiceException;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.IAccountDao;

public class AccountDao implements IAccountDao {
	private Connection conn;
	public AccountDao(Connection conn) {
		this.conn = conn;
	}

	public AccountDao() {
	}

	@Override
	public List<Teachersalary> findTeachersalary() throws AccountServiceException {
		List<Teachersalary> teachersalarys = new ArrayList<>();
		PreparedStatement prep = null;
		
		try {
			String sql = "select * from salary";
			prep = conn.prepareStatement(sql);
			
			ResultSet res = prep.executeQuery();
			while (res.next()) {
				String id = res.getString("id");
				String username = res.getString("username");
				String year = res.getString("year");
				String month = res.getString("month");
				String basic = res.getString("basic");
				String overtime = res.getString("overtime");
				String reward = res.getString("basic");
				String reduce = res.getString("reward");
				String revenue = res.getString("revenue");
				String realWage = res.getString("realWage");
				String edittime = res.getString("edittime");
				Teachersalary teachersalary = new Teachersalary();
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
				teachersalary.setEditTime(edittime);
				teachersalarys.add(teachersalary);
				
			}
			System.out.println(teachersalarys);
			//System.out.println(teachersalarys);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return teachersalarys;
	}

	@Override
	public void saveTeacherSalary(Teachersalary teachersalary) throws AccountServiceException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		String sql = "insert into salary values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, teachersalary.getId());
			statement.setString(2, teachersalary.getUsername());
			statement.setString(3, teachersalary.getYear());
			statement.setString(4, teachersalary.getMonth());
			statement.setString(5, teachersalary.getBasic());
			statement.setString(6, teachersalary.getOvertime());
			statement.setString(7, teachersalary.getReward());
			statement.setString(8, teachersalary.getReduce());
			statement.setString(9, teachersalary.getRevenue());
			statement.setString(10, teachersalary.getRealWage());
			statement.setString(11, teachersalary.getEditTime());
			statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void removeTeacherSalary(String id) throws AccountServiceException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		String sql="delete from salary where id = ?";
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,id);
			statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(id);
	}

}
