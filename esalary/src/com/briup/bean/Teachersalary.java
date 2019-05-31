package com.briup.bean;
//教职工工资信息表
public class Teachersalary {
	private String id ;			//编号
	private String username;	//姓名
	private String	year;		//年份
	private String	month;		//月份
	private String	basic;		//基本工资
	private String	overtime;	//加工资
	private String	reward;		//绩效工资
	private String	reduce;		//处罚工资
	private String  revenue;	//税收
	private String realWage; 	//实际工资
	@Override
	public String toString() {
		return "Teachersalary [id=" + id + ", username=" + username + ", year=" + year + ", month=" + month + ", basic="
				+ basic + ", overtime=" + overtime + ", reward=" + reward + ", reduce=" + reduce + ", revenue="
				+ revenue + ", realWage=" + realWage + ", editTime=" + editTime + "]";
	}
	public Teachersalary() {
		super();
	}
	private String editTime;
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
	public String getBasic() {
		return basic;
	}
	public void setBasic(String basic) {
		this.basic = basic;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getReduce() {
		return reduce;
	}
	public void setReduce(String reduce) {
		this.reduce = reduce;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getRealWage() {
		return realWage;
	}
	public void setRealWage(String realWage) {
		this.realWage = realWage;
	}
	public String getEditTime() {
		return editTime;
	}
	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}
	public Teachersalary(String id, String username, String year, String month, String basic, String overtime,
			String reward, String reduce, String revenue, String realWage, String editTime) {
		super();
		this.id = id;
		this.username = username;
		this.year = year;
		this.month = month;
		this.basic = basic;
		this.overtime = overtime;
		this.reward = reward;
		this.reduce = reduce;
		this.revenue = revenue;
		this.realWage = realWage;
		this.editTime = editTime;
	}
	
}
