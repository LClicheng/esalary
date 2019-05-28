package com.szkj.dao;

import com.szkj.bean.StoreKeeper;

public interface ILoginDao {
	StoreKeeper findShopKeeper(String id);
	
}
