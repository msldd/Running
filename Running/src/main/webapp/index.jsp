<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

	<head>
		<title>健身后台管理系统</title>
		 <meta http-equiv="X-UA-Compatible" content="IE=edge">
		 <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="static/css/pure-min.css" />
		<title>首页</title>
	</head>
	<style>
		#pur-nvg {
			background-color: #52beff;
		}
		
		#nav-padd {
			padding-right: 1060px;
		}
		
		#menuLink1 {
			color: black;
		}
		
		.pure-menu1 {
			border: 1px solid;
			margin-left: 120px;
			margin-top: -238px;
		}
		
		.panel {
			width: 12%;
		}
		
		.shop-ul {
			padding-left: 0px;
		}
		
		.shop-li {
			list-style: none;
			border-bottom: 1px solid;
		}
		
		.glyphicon{
			color: #545B62;
			font-size: 20px;
		}
		
		a:hover{
			TEXT-DECORATION:none;
			}
	
		.list-group-item:hover{
			background-color: #C6C8CA;
		}
		
		.glyphicon{
			font-size: 14px;
		}
		
		.zhjnr{
			border: solid #129FEA;
			position: fixed;
			left: 175px;
			top: 96px;
			width: 85%;			
			overflow-y:scroll ;
			height: 600px;
		}
		
	</style>
	
	<body>		
		<!--å¤´é¨-->
		<div class="pure-menu pure-menu-horizontal" id="pur-nvg">
			<ul class="pure-menu-list">
				<li class="pure-menu-item pure-menu-selected" id="nav-padd">
					<span class="pure-menu-heading"><img src="static/img/1.png" height="60"></span>
				</li>						
				<li class="pure-menu-item pure-menu-has-children pure-menu-allow-hover">
					<span>操作人：${Admin.name}</span>
					<a href="#" id="menuLink1" class="pure-menu-link">
						<span class="glyphicon glyphicon-cog"></span>&nbsp;系统设置</a>
						<ul class="pure-menu-children">
							<li class="pure-menu-item">
								<a id="cli" class="pure-menu-link">更换账号</a>
							</li>
							<li class="pure-menu-item">
								<a href="#" class="pure-menu-link">权限设置</a>
							</li>
							<li class="pure-menu-item">
								<a href="#" class="pure-menu-link">角色设置</a>
							</li>
							<li class="pure-menu-item">
								<a href="#" class="pure-menu-link">账号注销</a>
							</li>
						</ul>
						<!--éåºå¾æ -->
						<li class="pure-menu-item pure-menu-selected">
							<a href="login.jsp" class="pure-menu-link"><span class="glyphicon glyphicon-off"></span></a>
						</li>
				</li>
			</ul>
		</div>
		<!--å·¦ä¾§å¯¼èªæ -->
		<div class="panel-group" id="accordion">
			<!--åºæ¬æä½-->
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
							<span class="glyphicon glyphicon-cog"></span>&nbsp;基本设置</a>
					</h4>
				</div>
				<!--äºçº§å¯¼èª-->
				<div id="collapseOne" class="panel-collapse collapse in">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员卡设置</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;产品与服务设置</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;储物柜管理</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;课程管理</a>
							</li>
						</ul>
					</div>
				</div>				
			</div>
			<!--æ¥å¸¸æä½-->
			<div class="panel panel-success">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
							<span class="glyphicon glyphicon-time"></span>&nbsp;日常操作</a>
					</h4>
				</div>
				<!--äºçº§å¯¼èª-->
				<div id="collapseTwo" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;发行新卡</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员出入场</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员请假延迟到期时间</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员续费</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;客户消费</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员卡信息</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;积分处理</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;私教消费</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--ç»è®¡åæ-->
			<div class="panel panel-info">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
							<span class="	glyphicon glyphicon-list-alt"></span>&nbsp;统计分析</a>
					</h4>
				</div>
				<!--äºçº§å¯¼èª-->
				<div id="collapseThree" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员列表</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;充值明细查询</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;积分明细查询</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;会员出入场记录</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;消费流水明细</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;日报表</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;库存报表</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--BOOSçé¢-->
			<div class="panel panel-warning">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#collapseFour">
							<span class="glyphicon glyphicon-user"></span>&nbsp;BOSSçé¢</a>
					</h4>
				</div>
				<!--äºçº§å¯¼èª-->
				<div id="collapseFour" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;ç®¡çåææåè½å¯ä»¥æ¥ç</a>
							</li>
							<li class="list-group-item">
								<a data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-folder-close	"></span>&nbsp;åå·¥æä½</a>
							</li>
						</ul>
					</div>
				</div>
			</div>			
		</div>			
		<!--å­æ¾åå®¹-->
		<div class="zhjnr" id="aa"></div>
		
	</body>
	<script type="text/javascript">
		$(function () { $('#collapseFour').collapse({
			toggle: false
		})});
		$(function () { $('#collapseOne').collapse('show')});
		$(function () { $('#collapseTwo').collapse('show')});
		$(function () { $('#collapseThree').collapse('hide')});
		$(function () { $('#collapseFour').collapse('hide')});
		/*ç¹å»é¡µé¢æ¾ç¤ºåå®¹*/
		$('#cli').click(function(){
			$('#aa').load('register.jsp')
		});
	</script>  
</html>