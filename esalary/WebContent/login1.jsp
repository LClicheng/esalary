<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>


    <title>学校工资管理系统</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
 <style>
 <!--
 form{
 height:60px;
 width:300px;
 border:1px;

 }
 -->
 #a{
	   font-weight:bold;
	   font-size:20px;

        line-height:20px;
	   }#b{
	   font-weight:bold;
	   font-size:20px;

        line-height:20px;
	   }#c{
	   font-weight:bold;
	    font-size:20px;

        line-height:20px;
	   }
	   #e{
	   font-weight:bold;

	   }

}
 </style>
  <body style="background:url('img/bg6.jpg'); background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
  <div align=center>
  <h1 id="e">学校工资管理系统</h1>
 <h1>登录入口</h1>
 <hr>
 <form action="employee3.jsp" method="post"><input type="submit" value="教职工入口" id="a" style="height:70px;width:250px;"/></form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <form action="hr.jsp" method="post"><input type="submit" value="人事部管理员登录"  id="b" style="height:70px;width:250px;"/></form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <form action="account.jsp" method="post"><input type="submit" value="财务部管理员登录" id="c" style="height:70px;width:250px;"/></form>

    </div>

  </body>
</html>
