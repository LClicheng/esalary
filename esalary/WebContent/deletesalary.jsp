<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
    
    <title>删除教职工工资信息</title>
    
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
  
 <body style="background:url('img/bg5.jpg');">
  <div align=center>
  <h1>学校内部工资管理系统</h1>
    <h1>删除教职工工资列表</h1><br><hr>
  <table border="1" id="a">
 <tr>
  <th>员工编号</th>
  <th>员工姓名</th>
  <th>年份</th>
  <th>月份</th>
  <th>基本工资</th>
  <th>加班工资</th>
  <th>绩效工资</th>
  <th>员工处罚</th>
  <th>税收</th>
  <th>实际工资</th>
  <th>编辑日期</th>
  <th>操作</th>
  </tr>
  <c:forEach items="${teachersalarys }" var="c1">
				<tr>
					<th>${c1.id }</th>
					<th>${c1.username }</th>
					<th>${c1.year }</th>
					<th>${c1.month }</th>
					<th>${c1.basic }</th>
					<th>${c1.overtime }</th>
					<th>${c1.reward }</th>
					<th>${c1.reduce }</th>
					<th>${c1.revenue }</th>
					<th>${c1.realWage }</th>
					<th>${c1.editTime }</th>
					<th>  <a href="deletegzxx1.do?id=${c1.id }"><font color="red">删除</font></a></th>
				</tr>
			</c:forEach>
</table>
<h2><input type="button" onclick="window.location.href='account1.jsp'" id="c"value="返回"style="height:90px;width:150px;"><br><br></h2>
</div>
  

  
  </body>
</html>
