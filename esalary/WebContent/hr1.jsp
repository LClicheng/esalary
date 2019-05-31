<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>人事部管理员信息管理</title>

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
	font-weight: bold;
	font-size: 15px;
	line-height: 15px;
}

#b {
	font-weight: bold;
	font-size: 15px;
	line-height: 15px;
}

#c {
	font-weight: bold;
	font-size: 15px;
	line-height: 15px;
}

#d {
	font-weight: bold;
	font-size: 15px;
	line-height: 15px;
}
</style>
</head>

<body
	style="background: url('img/bg2.jpg'); background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;"">
	<div align=center>
		<h1>学校内部工资管理系统</h1>
		<h1>人事部管理员信息管理</h1>
		<br>
		<hr>
		<h2>
			<input type="button" onclick="window.location.href='qdb2.jsp'"
				value="签到表详细" id="a" style="height: 90px; width: 150px;"><br>
			<br>
			
			<input type="button"
				onclick="window.location.href='lookgrxx.do'" value="查看教职工基本信息" name="caozuo" 
				id="b" style="height: 90px; width: 150px;"><br>
			<br> <input type="button"
				onclick="window.location.href='addemployee.jsp'" value="添加教职工基本信息"
				id="b" style="height: 90px; width: 150px;"><br>
			<br> <input type="button"
				onclick="window.location.href='deletegrxx.do'" value="删除教职工基本信息" name="caozuo" 
				id="c" style="height: 90px; width: 150px;"><br>
			<br> <input type="button"
				onclick="window.location.href='login.jsp'" id="d" value="退出"
				style="height: 90px; width: 150px;"><br>
			<br>
		</h2>


	</div>
</body>
</html>
