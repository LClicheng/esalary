package com.szkj.service;

import java.util.List;

import com.szkj.bean.Order;
import com.szkj.common.exception.OrderException;

public interface IOrderService {
	long confirmOrder(Order order) throws OrderException;
	
	void deleteOrder(Long id) throws OrderException;
	
	Order findById(Long id) throws OrderException;
	
	List<Order> findByCustomerId(Long id) throws OrderException;
	
}
