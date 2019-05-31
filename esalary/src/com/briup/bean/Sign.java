package com.briup.bean;

public class Sign {
	private String id;
	private String username;
	private String department;
	private String year;
	private String month;
	private String get;
	private String lost;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getGet() {
		return get;
	}
	public void setGet(String get) {
		this.get = get;
	}
	public String getLost() {
		return lost;
	}
	public void setLost(String lost) {
		this.lost = lost;
	}
	public Sign() {
		super();
	}
	public Sign(String id, String username, String department, String year, String month, String get, String lost) {
		super();
		this.id = id;
		this.username = username;
		this.department = department;
		this.year = year;
		this.month = month;
		this.get = get;
		this.lost = lost;
	}
	@Override
	public String toString() {
		return "Sign [id=" + id + ", username=" + username + ", department=" + department + ", year=" + year
				+ ", month=" + month + ", get=" + get + ", lost=" + lost + "]";
	}
	
}
