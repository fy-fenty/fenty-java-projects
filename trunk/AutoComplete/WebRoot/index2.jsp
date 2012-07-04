<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="js/JQuery-1.7.2-dep.js"></script>
		<link rel="stylesheet" type="text/css" href="css/my.css">
		<link rel="stylesheet" type="text/css" href="css/jquery.autocomplete.css">
		<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
		<!--
			<link rel="stylesheet" type="text/css" href="css/jquery-ui-1.8.21.custom.css">
			<script type="text/javascript" src="js/jquery-ui-1.8.21.custom.js"></script>
		-->
		<script type="text/javascript" src="js/mm.js"></script>
	</head>
	<body>
		<div>
			<div><input /></div>
			<div></div>
		</div>
	</body>
</html>
