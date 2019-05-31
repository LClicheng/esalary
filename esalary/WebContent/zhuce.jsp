<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>教职工注册界面</title>

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
}

#b {
	font-weight: bold;
}

#c {
	font-weight: bold;
}
</style>
</head>

<body
	style="background: url('img/bg9.jpg'); background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;">
	<script>
		function rec() {
        	var f = confirm("注册成功,请登录！")
		}
    </script>
	<div align=center>
		<h1>学校内部工资管理系统</h1>
		<h1>教职工注册</h1>
		<br>
		<hr>
		<form action="register.do">
			<table id="a">
				<tr>
					<td id="a">用户名</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td id="b">密码</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit"
						onclick="rec()" value="提交" id="b"></td>
					<td><input id="c" type="button"
						onclick="window.location.href='employee3.jsp'" value="返回" id="c"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>
