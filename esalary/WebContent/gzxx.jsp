<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>工资信息查询</title>
    
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
	<body  style="background:url('img/bg9.jpg'); background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;"">
		<div align=center>
			<h1>学校内部工资管理系统</h1>
   
				<h1>教职工工资信息表
			</h1>
			<br>
			<hr>
			<table border="1" id="a">
				 <tr><td>教职工编号</td><td>${teachersalary.id }</td></tr>
				 <tr><td>教职工姓名</td><td>${teachersalary.username }</td></tr>
				 <tr><td>年份</td><td>${teachersalary.year }</td></tr>
	   	  		 <tr><td>月份</td><td>${teachersalary.month }</td></tr>
	   			 <tr><td>基本工资</td><td>${teachersalary.basic }</td></tr>
	    		 <tr><td>加班工资</td><td>${teachersalary.overtime }</td></tr>
	   			 <tr><td>绩效工资</td><td>${teachersalary.reward }</td></tr>
	   			 <tr><td>员工处罚</td><td>${teachersalary.reduce }</td></tr>
	  			 <tr><td>税收</td><td>${teachersalary.revenue }</td></tr>
				 <tr><td>实际工资</td><td>${teachersalary.realWage }</td></tr>
				 <tr><td>编辑日期</td><td>${teachersalary.editTime }</td></tr>
			</table>
		
			<h2>
				<input type="button" style="height:90px;width:150px;"onclick="window.location.href='employee1.jsp'"
					value="返回"  id="c">
			</h2>
		</div>
	</body>
</html>
