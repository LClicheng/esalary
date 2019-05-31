package com.briup.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.briup.bean.PManager;
import com.briup.bean.TeacherBI;
import com.briup.bean.Teachersalary;
import com.briup.common.util.ConnectionFactoryUtil;
import com.briup.dao.ITeacher;


public class TeacherDao implements ITeacher {
	private Connection conn;
	public TeacherDao(Connection conn){
		this.conn = conn;
	}
	public TeacherBI findBinformation(String id) {
		TeacherBI teacherBI  = new TeacherBI();
		PreparedStatement prep = null;
		
		try {
			String sql="SELECT * FROM grxx where username=?";
			
			prep = conn.prepareStatement(sql);
			prep.setString(1, id);
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
				
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return teacherBI;
	}
	
	@Override
	public PManager findPManger(String username,String tablename) throws SQLException {
		PreparedStatement prep = null;
		PManager pManager = null;
		
			String sql="SELECT * FROM "+ tablename + " where username=?";
			
			prep = conn.prepareStatement(sql);
			prep.setString(1, username);
			ResultSet res = prep.executeQuery();
			while (res.next()) {
				
				String  username1 = res.getString("username");
				String password = res.getString("password");
				pManager = new PManager();
				pManager.setUsername(username1);
				pManager.setPassword(password);
					
			}
			System.out.println(pManager);
			System.out.println(tablename);
		
		return pManager;
	}
	public PManager addPManager(String username,String password) throws SQLException {
		Connection conn = ConnectionFactoryUtil.getConnection();
		PManager pManager = new PManager(username,password);
		
			try {
				String sql="insert into employee values(?,?)";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, pManager.getUsername());
				statement.setString(2, pManager.getPassword());
				statement.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}	
			
			System.out.println(pManager);
			System.out.println(username+password);
		
		return pManager;
		
	}

	public Teachersalary finSalary(String id) {
		Teachersalary teachersalary =new Teachersalary();
		PreparedStatement prep = null;
		try {
			String sql="SELECT * FROM salary where username=?";
			
			prep = conn.prepareStatement(sql);
			prep.setString(1, id);
			ResultSet res = prep.executeQuery();
			while (res.next()) {
				String id1 = res.getString("id");
				String  username = res.getString("username");
				String year = res.getString("year");
				String month = res.getString("month");
				String basic = res.getString("basic");
				String overtime = res.getString("overtime");
				String reward = res.getString("reward");
				String reduce = res.getString("reduce");
				String revenue = res.getString("revenue");
				String realWage = res.getString("realWage");
				String edittime= res.getString("edittime");
				
				teachersalary.setId(id1);
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
				
			}
			System.out.println(teachersalary);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return teachersalary;
	}

	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}

	public void addTeacherBI(TeacherBI teacherBI) {
		// TODO Auto-generated method stub
		
		
	}

	public void addTeachersalary(Teachersalary teachersalary) {
		// TODO Auto-generated method stub
		
	}
	

	
}
