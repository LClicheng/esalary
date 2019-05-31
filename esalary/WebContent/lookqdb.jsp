<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>查看签到表信息</title>
    
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
  
 <body style="background:url('img/bg2.jpg');background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;"">
  <div align=center>
  <h1>学校内部工资管理系统</h1>
    <h1>教职工签到表信息列表</h1><br><hr>
  <table border="1" id="a">
 <tr>
  <th>教职工编号</th>
  <th>教职工姓名</th>
  <th>部门</th>
  <th>年份</th>
  <th>月份</th>
  <th>签到天数</th>
  <th>未签到天数</th>
				<c:forEach items="${signs }" var="c1">
					<tr>
						<th>${c1.id }</th>
						<th>${c1.username }</th>
						<th>${c1.department }</th>
						<th>${c1.year }</th>
						<th>${c1.month }</th>
						<th>${c1.get }</th>
						<th>${c1.lost }</th>
					</tr>
				</c:forEach></table>
<h2><input type="button" onclick="window.location.href='qdb2.jsp'" id="c"value="返回"style="height:90px;width:150px;"><br><br></h2>
</div>
  

  
  </body>
</html>