<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>欢迎人事部管理员登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
table {
	text-align: center;
	background:
}

#a {
	font-weight: bold;
}

#b {
	font-weight: bold;
}

#c {
	font-weight: bold;
}

#d {
	font-weight: bold;
}
</style>
</head>

<body
	style="background: url('img/bg2.jpg'); background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;">
	<script>
		function rec() {
        	var f = confirm("登录成功！")
		}
    </script>
	<div align="center">
		<h1>学校内部工资管理系统</h1>

		<H1>欢迎人事部管理员登录</H1>
		<br>
		<hr>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<form action="login.do" method="post">
			<input type="hidden" value="hr" name="tablename">
			<table width="300" height="200">
				<tr>
					<td id="a">用户名:</td>
					<td><input type="text" style="width: 200px; height: 40px;"
						name="username"></td>
				</tr>
				<tr>
					<td id="b">密码:</td>
					<td><input type="password" style="width: 200px; height: 40px;"
						name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" onclick="rec()" value="登录" id="c"></td>
					<td><input type="button"
						onclick="window.location.href='login.jsp'" value="返回" id="d"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
