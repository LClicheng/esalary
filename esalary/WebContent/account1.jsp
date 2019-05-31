<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  

    <title>财务部管理员信息管理</title>

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
	   font-weight:bold;
	   font-size:15px;

        line-height:15px;
	   }
	   #b{
	   font-weight:bold;
	   font-size:15px;

        line-height:15px;
	   }
	   #c{
	   font-weight:bold;
	   font-size:15px;

        line-height:15px;
	   }
	   </style>
  </head>

   <body style="background:url('img/bg5.jpg');">
   <div align=center>
   <h1>学校内部工资管理系统</h1>
   <h1>财务部管理员信息管理</h1><br><hr>
  <h2><input type="button" onclick="window.location.href='lookgzxx.do'" value="查看教职工工资信息" id="a"style="height:90px;width:150px;"><br><br></h2>
   <h2><input type="button" onclick="window.location.href='addsalary.jsp'"  id="a" value="添加教职工工资"style="height:90px;width:150px;"><br><br></h2>
  <h2><input type="button" onclick="window.location.href='deletegzxx.do'" id="b"value="删除教职工工资"style="height:90px;width:150px;"><br><br></h2>
  <h2><input type="button" onclick="window.location.href='login.jsp'" id="c"value="退出"style="height:90px;width:150px;"><br><br></h2>

 </div>
  </body>

</html>
