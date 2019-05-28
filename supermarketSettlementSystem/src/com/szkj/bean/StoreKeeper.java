package com.szkj.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class StoreKeeper implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String password;
	private String telephone;
	
	public StoreKeeper(String id, String name, String password, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "StoreKeeper [id=" + id + ", name=" + name + ", password=" + password + ", telephone=" + telephone + "]";
	}


	public StoreKeeper() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public Set<Goods> getGoods() {
		return goods;
	}



	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}


	//关联关系：一对多
	private Set<Goods> goods = new HashSet<>();

	
	
	
}
