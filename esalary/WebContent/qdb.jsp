<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>签到表编辑</title>
    
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
	   #c{
	   font-weight:bold;
	   }
	
</style>
  </head>
  
 <body style="background:url('img/bg2.jpg');background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;">
  <div align=center>
  <h1>学校内部工资管理系统</h1>
<h1>签到表编辑列表</h1><br><hr>
  <form action="addSign.do">
  <table id="a">
  <tr><td>教职工编号</td><td><input type="text" name="Id" ></td></tr>
  <tr><td>教职工姓名</td><td><input type="text" name="username" ></td></tr>
  <tr><td>部门</td><td><input type="text" name="department" ></td></tr>
  <tr><td>年份</td><td><input type="text" name="year" ></td></tr>
  <tr><td>月份</td><td><input type="text" name="month" ></td></tr>
  <tr><td>签到天数</td><td><input type="text" name="get" ></td></tr>
  <tr><td>未签到天数</td><td><input type="text" name="lost" ></td></tr>
  <tr><td><input type="submit" value="提交" id="b"></td>
  <td><input type="button" onclick="window.location.href='qdb2.jsp'" value="返回"id="c" ></td>
  </tr>
  </table>
  </form>
    </div> 

  </body>
</html>
