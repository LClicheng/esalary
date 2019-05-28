<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta charset="utf-8" />
		<title>超市结算系统</title>
		<link rel="stylesheet" type="text/css" href="./css/shouye.css" />
		<script type="text/javascript" src="js/index.js">
		</script>
		<script type="text/javascript" src="js/jquery-3.3.1.min.js">
		</script>
	</head>

	<body>
		<div id="box">

			<!--顶部开始-->
			<div id="top">
				<!--left开始-->
				<div class="left">超市结算系统</div>
				<div class="right">
					<ul>
						<a href="">
							<a href="./login.jsp">
								<li>仓库管理</li>
							</a>
						</a>

					</ul>
				</div>
				<!--left结束-->
			</div>
			<!--顶部结束-->
			<!--主体开始-->
			<div id="main">
				<!--main-left开始-->
				<div id="main-left">
					<!--搜索框开始-->
					<form action="" method="post">
						<div class="sou">
							<input type="text" placeholder="请输入商品货码" id="text1" />
							<input type="button" value="确认" id="btn1" />
						</div>

					</form>

					<!--搜索框结束-->
					<!--商品列表开始-->
					<form action="" method="post">
						<table id="shangpin" border="1px">
							<tr>
								<td>商品</td>
								<td>单价</td>
								<td>数量</td>

							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
						<p id="zongji" style="display: block;float: left;">总计：<span id="total">10</span></p>
						<input type="button" value="清空" style="width:100px;height: 25px;position:relative;right:30px;float: right;" />

					</form>

					<!--商品列表结束-->
				</div>
				<!--main-left结束-->

				<!--main-right开始-->
				<div id="main-right">
					<!--结算开始-->
					<form action="" method="post">
						<table border="" cellspacing="" cellpadding="" id="jiesuan">
							<tr>
								<td>应付金额：</td>
								<td><input type="" name="" id="yingfu" value="" disabled="disabled" /></td>
							</tr>
							<tr>
								<td>实付金额：</td>
								<td><input type="" name="" id="shifu" value="" /></td>
							</tr>
							<tr>
								<td>找零：</td>
								<td><input type="" name="" id="zhaoling" value="" /></td>
							</tr>
						</table>

					</form>

					<!--结算结束-->

					<!--计算器开始部分-->
					<form action="" method="post">
						<table border="" cellspacing="" cellpadding="" id="jisuanqi">

							<tr>
								<td><input type="button" value="7" class="btn" /></td>
								<td><input type="button" value="8" class="btn" /></td>
								<td><input type="button" name="" class="btn" value="9" /></td>
								<td><input type="button" name="" class="btn" value="支付方式" /></td>
							</tr>
							<tr>
								<td><input type="button" value="4" class="btn" /></td>
								<td><input type="button" value="5" class="btn" /></td>
								<td><input type="button" value="6" class="btn" /></td>
								<td><input type="button" value="微信" class="btn" id="wei" /></td>
							</tr>
							<tr>
								<td><input type="button" value="1" class="btn" /></td>
								<td><input type="button" value="2" class="btn" /></td>
								<td><input type="button" value="3" class="btn" /></td>
								<td><input type="button" value="支付宝" class="btn" id="zhi" /></td>
							</tr>
							<tr>
								<td><input type="button" value="0" class="btn" /></td>
								<td><input type="button" value="." class="btn" /></td>
								<td><input type="button" value="删除" class="btn" style="background-color: #A1D46F;" id="del" /></td>
								<td><input type="button" value="确认" class="btn" style="background-color: #A1D46F;" id="que" /></td>
							</tr>

						</table>

					</form>

					<!--计算器结束部分-->
				</div>
				<!--mian-right结束-->
			</div>
			<!--主体结束-->
			<img src="img/wei.png" alt="" id="img1" />
			<img src="img/zhi1.jpg" id="img2" />
		</div>
	</body>

</html>