<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>删除教职工个人信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="js/easyui/demo/demo.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/color.css">

<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/easyui/local/easyui-lang-zh_CN.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
#a {
	background-color: white;
	text-align: center;
}

#b {
	font-weight: bold;
}
</style>
</head>

<body
	style="background: url('img/bg2.jpg'); background-repeat: no-repeat; background-size: 100% 100%; background-attachment: fixed;"">
	<div align=center>
		<h1>学校内部工资管理系统</h1>
		<h1>删除教职工基本信息列表</h1>
		<br>
		<hr><!-- class="easyui-datagrid" 972px border:1px -->
		<table  style="width:1500px;height:auto;border:0px solid #ccc;">
        <thead>
            <tr>
                <th data-options="field:'itemid',align:'center'"><FONT face="隶书" color="#0096ff" size="5">教职工编号</FONT></th>
                <th data-options="field:'productid',align:'left'"><FONT face="隶书" color="#0096ff" size="5">教职工姓名</FONT></th>
                <th data-options="field:'listprice',align:'left'"><FONT face="隶书" color="#0096ff" size="5">教职工性别</FONT></th>
                <th data-options="field:'attr1',align:'left'"><FONT face="隶书" color="#0096ff" size="5">教职工工号</FONT></th>
                <th data-options="field:'attr2',align:'left'"><FONT face="隶书" color="#0096ff" size="5">民族</FONT></th>
                <th data-options="field:'attr3',align:'left'"><FONT face="隶书" color="#0096ff" size="5">教职工生日</FONT></th>
                <th data-options="field:'attr4',align:'left'"><FONT face="隶书" color="#0096ff" size="5">部门</FONT></th>
                <th data-options="field:'attr5',align:'left'"><FONT face="隶书" color="#0096ff" size="5">职位</FONT></th>
                <th data-options="field:'attr6',align:'left'"><FONT face="隶书" color="#0096ff" size="5">教职工电话</FONT></th>
                <th data-options="field:'attr7',align:'left'"><FONT face="隶书" color="#0096ff" size="5">邮箱</FONT></th>
                <th data-options="field:'attr8',align:'left'"><FONT face="隶书" color="#0096ff" size="5">编辑日期</FONT></th>
                <th data-options="field:'attr9',align:'left'"><FONT face="隶书" color="#0096ff" size="5">操作</FONT></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${teacherBIs }" var="c1">
				<tr>
					<td align="center">${c1.id }</td>
					<td align="center">${c1.username }</td>
					<td align="center">${c1.sex }</td>
					<td align="center">${c1.cardNumber }</td>
					<td align="center">${c1.nation }</td>
					<td align="center">${c1.birthday }</td>
					<td align="center">${c1.department }</td>
					<td align="center">${c1.positionName }</td>
					<td align="center">${c1.telephone }</td>
					<td align="center">${c1.email }</td>
					<td align="center">${c1.editTime }</td>
					<td align="center"><a class="easyui-linkbutton" data-options="iconCls:'icon-remove'" href="deletegrxx1.do?id=${c1.id }"><font
							color="red">&nbsp删除&nbsp&nbsp&nbsp</font></a></td>
				</tr>
			</c:forEach>
            
        </tbody>
    </table>
		
		<h2>
			<input type="button" onclick="window.location.href='hr1.jsp'" id="c"
				value="返回" style="height: 90px; width: 150px;"><br>
			<br>
		</h2>
	</div>
	        


</body>
</html>

