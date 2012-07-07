<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="css/normal.css">
		<link rel="stylesheet" type="text/css" href="css/login.css">
		<script type="text/javascript" src="js/jquery-1.7.2-dev.js"></script>
		<script type="text/javascript" src="js/login.js"></script>
	</head>
	<body>
		<div class="llogo">
			<div><img alt="" src="img/logo.gif"></div>
		</div>
		<div class="llogin">
			<lc1 class="ltitle">
				<lc1></lc1>
				<h8>用户登录</h8>
				<lc1></lc1>
			</lc1>
			<div class="llc">
				<div>
					<form action="<%=path%>/muser-login.action">
						<div>
							<span>用户名：</span>
							<div>
								<input name="loginVo.muname" type="text">
								<label></label>
								<span class="lclr"></span>
								<label></label>
							</div>
						</div>
						<div>
							<span>密码：</span>
							<div>
								<input name="loginVo.mupwd" type="text">
								<a>忘记密码?</a>
								<span class="lclr"></span>
								<label></label>
							</div>
						</div>
						<div class="lck">
							<span>&nbsp;</span>
							<label><input type="checkbox" />记住会员名</label>
							<label><input type="checkbox" />自动登录</label>
						</div>
						<div>
							<span>&nbsp;</span>
							<input type="submit" value="登录">
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>