package com.briup.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Sign;
import com.briup.bean.TeacherBI;
import com.briup.common.exception.HrServiceException;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.IHrDao;

public class HrDao implements IHrDao {
	private Connection conn;
	public HrDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public HrDao() {
	}

	@Override
	public List<Sign> findSign() throws HrServiceException {
		List<Sign> signs = new ArrayList<>();
		PreparedStatement prep = null;
		try {
			String sql = "select * from qdb";
			prep = conn.prepareStatement(sql);
			ResultSet res = prep.executeQuery();
			while (res.next()) {
				String id = res.getString("id");
				String username = res.getString("username");
				String department = res.getString("department");
				String year = res.getString("year");
				String month = res.getString("month");
				String get = res.getString("get");
				String lost = res.getString("lost");
				Sign sign = new Sign();
				sign.setId(id);
				sign.setUsername(username);
				sign.setDepartment(department);
				sign.setYear(year);
				sign.setMonth(month);
				sign.setGet(get);
				sign.setLost(lost);
				signs.add(sign);
			}
			System.out.println(signs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return signs;
	}

	@Override
	public Sign saveSign(Sign sign) throws HrServiceException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		String sql="insert into qdb values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, sign.getId());
			statement.setString(2, sign.getUsername());
			statement.setString(3, sign.getDepartment());
			statement.setString(4, sign.getYear());
			statement.setString(5, sign.getMonth());
			statement.setString(6, sign.getGet());
			statement.setString(7, sign.getLost());
			statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(sign);
		return sign;
	}

	@Override
	public List<TeacherBI> findTeacherBI() throws HrServiceException {
		List<TeacherBI> teacherBIs = new ArrayList<>();
		PreparedStatement prep = null;
		String sql="SELECT * FROM grxx ";
		
		try {
			prep = conn.prepareStatement(sql);
			ResultSet res = prep.executeQuery();
			while (res.next()) {
				String id1 = res.getString("id");
				String  username = res.getString("username");
				String sex = res.getString("sex");
				String cardNumber = res.getString("cardNumber");
				String nation = res.getString("nation");
				String birthday = res.getString("birthday");
				String department = res.getString("department");
				String positionName = res.getString("positionName");
				String telephone = res.getString("telephone");
				String email = res.getString("email");
				String editTime= res.getString("editTime");
				TeacherBI teacherBI = new TeacherBI();
				teacherBI.setId(id1);
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
				teacherBIs.add(teacherBI);
				
			}
			System.out.println(teacherBIs);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return teacherBIs;
	}

	@Override
	public TeacherBI savaTeacherBI(TeacherBI teacherBI) throws HrServiceException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		String sql="insert into grxx values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,teacherBI.getId());
			statement.setString(2,teacherBI.getUsername());
			statement.setString(3,teacherBI.getSex());
			statement.setString(4,teacherBI.getCardNumber());
			statement.setString(5,teacherBI.getNation());
			statement.setString(6,teacherBI.getBirthday());
			statement.setString(7,teacherBI.getDepartment());
			statement.setString(8,teacherBI.getPositionName());
			statement.setString(9,teacherBI.getTelephone());
			statement.setString(10,teacherBI.getEmail());
			statement.setString(11,teacherBI.getEditTime());
			statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return teacherBI;
	}

	@Override
	public void removeTeacherBI(String id) throws HrServiceException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		String sql="delete from grxx where id = ?";
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
