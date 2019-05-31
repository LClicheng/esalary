
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>


		<title>个人信息查询</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
  #a{
     background-color:white;
     text-align:center;
      
   }
   #b{
	   font-weight:bold;
	   }
</style>
	</head>

	<body style="background: url('img/bg9.jpg'); background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;"">
		<div align=center>
			<h1>
				教职工个人信息表
			</h1>
			<br>
			<hr>
			<table border="1" id="a">
			<tr><td>教职工编号</td><td>${teacherBI.id }</td></tr>
			<tr><td>教职工姓名</td><td>${teacherBI.username }</td></tr>
			<tr><td>教职工性别</td><td>${teacherBI.sex }</td></tr>
			<tr><td>教职工工号</td><td>${teacherBI.cardNumber }</td></tr>
			<tr><td>民族</td><td>${teacherBI.nation }</td></tr>
			<tr><td>教职工生日</td><td>${teacherBI.birthday }</td></tr>
			<tr><td>部门</td><td>${teacherBI.department }</td></tr>
			<tr><td>职位</td><td>${teacherBI.positionName }</td></tr>
			<tr><td>教职工电话</td><td>${teacherBI.telephone }</td></tr>
			<tr><td>邮箱</td><td>${teacherBI.email }</td></tr>
			<tr><td>编辑日期</td><td>${teacherBI.editTime }</td></tr>
			</table>
			<h2>
				<input type="button" style="height:90px;width:150px;"onclick="window.location.href='employee1.jsp'"
					value="返回" id="b">
			</h2>
		</div>
	</body>

</html>
