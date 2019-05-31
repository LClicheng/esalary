<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>添加教职工工资信息</title>
    
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
  
 <body style="background:url('img/bg5.jpg');">
  <div align=center>
  <h1>学校内部工资管理系统</h1>
    <h1>添加员工工资列表</h1><br><hr>

  <form action="addTeacherSalary.do">
  <table id="a">
  <tr><td>员工编号</td><td><input type="text" name="Id" ></td></tr>
  <tr><td>员工姓名</td><td><input type="text" name="username" ></td></tr>
  <tr><td>年份</td><td><input type="text" name="year" ></td></tr>
  <tr><td>月份</td><td><input type="text" name="month" ></td></tr>
  <tr><td>基本工资</td><td><input type="text" name="basic" ></td></tr>
  <tr><td>加班工资</td><td><input type="text" name="overtime" ></td></tr>
  <tr><td>绩效工资</td><td><input type="text" name="reward" ></td></tr>
  <tr><td>员工处罚</td><td><input type="text" name="reduce" ></td></tr>
  <tr> <td>税收</td><td><input type="text" name="revenue" ></td></tr>
  <tr><td>总工资</td><td><input type="text" name="realWage" ></td></tr>
  <tr><td>编辑日期</td><td><input type="text" name="editTime" ></td></tr>
  <tr><td><input type="submit" value="提交" id="b"></td>
  <td><input type="button" onclick="window.location.href='account1.jsp'" value="返回"id="c" ></td>
  </tr>
  </table>
  </form>
    </div> 

  </body>
</html>
