package com.szkj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.szkj.bean.StoreKeeper;
import com.szkj.common.util.ConnectionFactoryUtil;
import com.szkj.dao.ILoginDao;

public class LoginDaoImpl implements ILoginDao {
//	private Connection conn;
//	public LoginDaoImpl(Connection conn) {
//		this.conn = conn;
//	}
	public LoginDaoImpl() {
	}
	@Override
	public StoreKeeper findShopKeeper(String id) {
		// TODO Auto-generated method stub
		StoreKeeper storeKeeper = new StoreKeeper();
		PreparedStatement prep = null;
		Connection conn = ConnectionFactoryUtil.getConnection();
		try {
			String sql = "select * from storekeeper where id = ?";
		
			prep = conn.prepareStatement(sql);
			prep.setString(1, id);
			ResultSet res = prep.executeQuery();
			
			while (res.next()) {
				String id1 = res.getString("id");
				String password = res.getString("password");
				
				storeKeeper.setId(id1);
				storeKeeper.setPassword(password);
				
				
			}
			
			System.out.println(storeKeeper);
			//System.out.println();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return storeKeeper;
	}
//	public static void main(String[] args) {
//		LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
//		loginDaoImpl.findShopKeeper("1001");
//	}
	
}
