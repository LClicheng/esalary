package com.szkj.service;

import com.szkj.bean.StoreKeeper;
import com.szkj.common.exception.LoginException;

public interface IStoreKeeperService {
	
	void register(StoreKeeper StoreKeeper) throws LoginException;
	
	StoreKeeper login(String id,String password) throws LoginException;
	
	void updateStoreKeeper(StoreKeeper StoreKeeper) throws LoginException;
	
}
