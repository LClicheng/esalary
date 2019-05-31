<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>教职工信息查询</title>
    
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
	   font-size:20px;

        line-height:20px;
	   }
	   #b{
	   font-weight:bold;
	   font-size:20px;

        line-height:20px;
	   }
	   #c{
	   font-weight:bold;
	   font-size:20px;

        line-height:20px;
	   }
	   </style>
  </head>
  
   <body style="background:url('img/bg9.jpg'); background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;"">
   <div align=center>
     <h1>学校内部工资管理系统</h1>
   <h1>欢迎教职工登录</h1><br><hr>
 
   
   <h2><input type="button" onclick="window.location.href='grxx.do?username=${pManager.username}'" value="个人信息查询" id="a"style="height:90px;width:150px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" onclick="window.location.href='gzxx.do?username=${pManager.username}'" value="工资信息查询" id="b"style="height:90px;width:150px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" onclick="window.location.href='login.jsp'" id="c"value="退出"style="height:90px;width:150px;"><br><br></h2>

  
    </div> 
  </body>
</html>

