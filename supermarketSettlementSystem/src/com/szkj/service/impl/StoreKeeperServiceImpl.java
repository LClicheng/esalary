package com.szkj.service.impl;


import com.szkj.dao.impl.LoginDaoImpl;

import com.szkj.bean.StoreKeeper;
import com.szkj.common.exception.LoginException;
import com.szkj.service.IStoreKeeperService;

public class StoreKeeperServiceImpl implements IStoreKeeperService {
	//private Connection conn=ConnectionFactoryUtil.getConnection();
	private LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
	@Override
	public void register(StoreKeeper StoreKeeper) throws LoginException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StoreKeeper login(String id, String password) throws LoginException {
		// TODO Auto-generated method stub
		StoreKeeper storeKeeper = loginDaoImpl.findShopKeeper(id);
		System.out.println(storeKeeper);
		String dbPassword = "";
		
		if(storeKeeper == null){
			// 2、如果取出的用户信息为空，则直接 返回 false
			return null;
		}else{
			// 3、如果取出的用户信息不为空，则从用户信息中取出密码
			dbPassword = storeKeeper.getPassword();
			System.out.println(dbPassword);
		}
		// 4、将取出的密码和参数中的密码进行比较
		if(dbPassword.equals(password)){
			StoreKeeper dbc = loginDaoImpl.findShopKeeper(id);
			return dbc;
		}else{
			return null;
		}
	}

	@Override
	public void updateStoreKeeper(StoreKeeper StoreKeeper) throws LoginException {
		// TODO Auto-generated method stub

	}
//	public static void main(String[] args) {
//		StoreKeeperServiceImpl serviceImpl = new StoreKeeperServiceImpl();
//		try {
//			serviceImpl.login("1001","123456");
//		} catch (LoginException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
