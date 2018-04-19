<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html style="height: 100%;">

	<head>
		<meta charset="utf-8">
		<title>登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="static/css/pure-min.css" />
	</head>
	
	<style>
	
		.input-group {
			margin-bottom: -20px;
			color: #FFFFFF;
		}
		
		#input-tx {
			margin-top: 10px;
		}
		
		#input-title {
			width: 20%;
			margin: auto;
			opacity:0.5;
			margin-top: -7%;
		}
		
		#input-top {
			margin-top: 40px;
		}
		
		.sub {
			width: 100%;
			width: 280px;
			height: 34px;
			border-radius: 4px;
			border: 1px;
			background: black;
			font-size: 16px;
		}
		
		.input-group-addon {
			background: black;
			font-size: 16px;
			color: #FFFFFF;
		}
		
		#apwd {
			margin-left: 140px;
		}
		
		.chbox {
			position: absolute;
			top: 0%;
		}
		
		.span-pwd {
			margin-left: 10px;
			color: #000000;
		}
		
		.bs-example {
			margin-top: 179px;
			margin-left: 98px;
		}
		
		body{
			background-image: url(static/img/denglu.png);
			background-repeat: no-repeat;
			background-attachment: fixed;
			background-size: 100% 100%;
		}
		
		.tba{
			margin-left: -38px;
		}
		
	</style>

	<body style="height: 100%;overflow: hidden;">
		<!--logo-->
		<div class="tba"><img src="static/img/152386129635081.png"/></div>
			<!--form-->
			<div class="input-group" id="input-title">
				<form class="bs-example bs-example-form" role="form" action="login.do" method="post">
					<div class="input-group" id="input-tx">
						<span class="input-group-addon" >账号</span>
						<input required="required" type="text" class="form-control" name="name" placeholder="输入账号">
					</div>
					<br>
					<br>
					<div class="input-group">
						<span class="input-group-addon" >密码</span>
						<input required="required" type="text" class="form-control" name="pwd" placeholder="输入密码">
					</div>
					<div class="input-group" id="input-top">
						<button type="submit" class="sub">登录</button>
					</div>
					<div class="input-group" id="input-top">
						<input type="checkbox" class="chbox" />&nbsp;<span class="span-pwd">记住密码 </span>
						<a id="apwd" href="">忘记密码</a>
					</div>
				</form>
			</div>	
	</body>

</html>