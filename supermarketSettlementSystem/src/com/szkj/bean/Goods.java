package com.szkj.bean;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private double price;
	private String address;	  //产地
	private Date productDate; //生产日期
	private int num;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", address=" + address + ", productDate="
				+ productDate + ", num=" + num + "]";
	}
	public Goods(Long id, String name, double price, String address, Date productDate, int num) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
		this.productDate = productDate;
		this.num = num;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
