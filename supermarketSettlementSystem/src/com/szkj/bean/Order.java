package com.szkj.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;

public class Order implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double cost;
	private Timestamp orderDate;
	private String state;
	private String pay;
	
	private Collection<Lines> lines = new HashSet<>();
	
	private Goods goods;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Collection<Lines> getLines() {
		return lines;
	}

	public void setLines(Collection<Lines> lines) {
		this.lines = lines;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
}
