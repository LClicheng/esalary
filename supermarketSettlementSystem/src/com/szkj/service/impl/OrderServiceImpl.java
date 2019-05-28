package com.szkj.service.impl;

import java.util.List;

import com.szkj.bean.Order;
import com.szkj.common.exception.OrderException;

public class OrderServiceImpl implements com.szkj.service.IOrderService {

	@Override
	public long confirmOrder(Order order) throws OrderException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteOrder(Long id) throws OrderException {
		// TODO Auto-generated method stub

	}

	@Override
	public Order findById(Long id) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findByCustomerId(Long id) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
