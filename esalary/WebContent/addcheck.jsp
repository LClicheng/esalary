<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'addcheck.jsp' starting page</title>

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

 <body style="background:url('../img/bg.jpg');">

  <div align=center>
  <h1>学校内部工资管理系统</h1>
    <h1>添加员工工资成功</h1><br><hr>
  <table border="1" id="a">
 <tr>
  <th>教职工编号</th>
  <th>教职工姓名</th>
  <th>年份</th>
  <th>月份</th>
  <th>基本工资</th>
  <th>加班工资</th>
  <th>绩效工资</th>
  <th>员工处罚</th>
  <th>税收</th>
  <th>实际工资</th>
  <th>编辑日期</th>


  </tr>
</table>
</div>
   <div align=center>
    <h2>
				<input type="button" style="height:90px;width:150px;"onclick="window.location.href='addsalary.jsp'"
					value="返回" id="b">
			</h2>
			</div>


  </body>
</html>
