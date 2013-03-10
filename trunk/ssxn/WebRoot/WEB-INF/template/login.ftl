<html>
<head>

<title>My JSP 'index.jsp' starting page</title>
<meta content="text/html;charset=UTF-8" http-equiv="Content-Type">
<link rel="stylesheet" type="text/css" href="resource/css/normal.css">
<link rel="stylesheet" type="text/css" href="resource/css/login.css">
</head>

<body>
	<div class="bg">
		<div class="container">
			<div class="lg_left"><img alt="" src="resource/img/login_left.gif"></div>
			<form class="lg_mid" action="login!check" method="post">
				<div class="msg"><#if err?exists>${err}</#if></div>
				<div class="uname text"><input name="lv.uname" title="用户名" type="text" /><label>用户名</label></div>
				<div class="upwd text"><input name="lv.upwd" title="密码" type="password" /><label>密码</label></div>
				<input class="submit" type="submit" value="登录">
			</form>
			<div class="lg_right"><img alt="" src="resource/img/login_right.gif"></div>
			<div class="clr"></div>
		</div>
	</div>
	<script type="text/javascript" src="resource/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="resource/js/login.js"></script>
</body>
</html>