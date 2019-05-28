package com.szkj.dao;

import java.util.List;

import com.szkj.bean.Goods;
import com.szkj.common.exception.GoodsException;


public interface IGoodsDao {
	List<Goods> findGoods() throws GoodsException;
	void saveGoods(Goods goods) throws GoodsException;
	List<Goods> addGoods() throws GoodsException;
	
}
