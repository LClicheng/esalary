package com.briup.bean;
//教职工基本信息
public class TeacherBI {
	private String id;       //教职工编号
	private String  username;//姓名
	private String sex;      //性别
	private String cardNumber;//工号
	private String nation;    //民族
	private String birthday;  //生日
	private String department; //部门
	private String positionName;//职位
	private String telephone; //电话
	private String email;		//邮箱
	private String editTime;	//编辑日期
	@Override
	public String toString() {
		return "TeacherBI [id=" + id + ", username=" + username + ", sex=" + sex + ", cardNumber=" + cardNumber
				+ ", nation=" + nation + ", birthday=" + birthday + ", department=" + department + ", positionName="
				+ positionName + ", telephone=" + telephone + ", email=" + email + ", editTime=" + editTime + "]";
	}
	public TeacherBI() {
		super();
	}
	public TeacherBI(String id, String username, String sex, String cardNumber, String nation, String birthday,
			String department, String positionName, String telephone, String email, String editTime) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.cardNumber = cardNumber;
		this.nation = nation;
		this.birthday = birthday;
		this.department = department;
		this.positionName = positionName;
		this.telephone = telephone;
		this.email = email;
		this.editTime = editTime;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEditTime() {
		return editTime;
	}
	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}
}
