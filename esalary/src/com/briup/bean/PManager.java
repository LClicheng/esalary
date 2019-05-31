package com.briup.bean;
//人事部管理员信息表
public class PManager {
	
	private String username;
	private String password;
	public PManager(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PManager() {
		super();
	}
	@Override
	public String toString() {
		return "PManager [username=" + username + ", password=" + password + "]";
	}
}
