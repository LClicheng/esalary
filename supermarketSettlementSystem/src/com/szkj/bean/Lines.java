package com.szkj.bean;

import java.io.Serializable;

public class Lines implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer num;
	
	private Order order;
	
	private Goods goods;
	
	public Lines(){
		
	}
	
	public Lines(Long id, Integer num) {
		this.id = id;
		this.num = num;
	}

	public Lines(Long id, Integer num, Order order, Goods goods) {
		super();
		this.id = id;
		this.num = num;
		this.order = order;
		this.goods = goods;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
}
