<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>查看教职工基本信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
#a {
	background-color: white;
	text-align: center;
}

#b {
	background-color: white;
	font-weight: bold;
}
</style>
</head>

<body
	style="background: url('img/bg2.jpg'); background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;"">
	<div align=center>
		<h1>学校内部工资管理系统</h1>
		<h1>教职工基本信息列表</h1>
		<br>
		<hr>
		<table border="1" id="a">
			<tr>
				<th>教职工编号</th>
				<th>教职工姓名</th>
				<th>教职工性别</th>
				<th>教职工工号</th>
				<th>民族</th>
				<th>教职工生日</th>
				<th>部门</th>
				<th>职位</th>
				<th>教职工电话</th>
				<th>邮箱</th>
				<th>编辑日期</th>
			</tr>
			<c:forEach items="${teacherBIs }" var="c1">
				<tr>
					<th>${c1.id }</th>
					<th>${c1.username }</th>
					<th>${c1.sex }</th>
					<th>${c1.cardNumber }</th>
					<th>${c1.nation }</th>
					<th>${c1.birthday }</th>
					<th>${c1.department }</th>
					<th>${c1.positionName }</th>
					<th>${c1.telephone }</th>
					<th>${c1.email }</th>
					<th>${c1.editTime }</th>
				</tr>
			</c:forEach>
		</table>
		<h2>
			<input type="button" onclick="window.location.href='hr1.jsp'" id="c"
				value="返回" style="height: 90px; width: 150px;"><br>
			<br>
		</h2>
	</div>



</body>
</html>


