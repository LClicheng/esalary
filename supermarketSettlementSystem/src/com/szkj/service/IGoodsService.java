package com.szkj.service;

import java.util.List;

import com.szkj.bean.*;
import com.szkj.common.exception.GoodsException;

public interface IGoodsService {

	List<Goods> listAllBooks() throws GoodsException ;
	Goods findById(Long id) throws GoodsException;
}
