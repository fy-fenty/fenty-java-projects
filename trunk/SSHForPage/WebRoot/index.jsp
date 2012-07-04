<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<script type="text/javascript" src="JQuery-1.7.2-dep.js"></script>
	<script type="text/javascript" src="js.js"></script>
	<link rel="stylesheet" type="text/css" href="css.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body bgcolor="#CCCCCC">
    <div id="show" style="text-align: center; width: 400px; height: 300px;position: relative;margin: 0 auto;">
    	<div style="width: 100%;height: 100%;display: none;background-color: white;position: absolute;left: 0;right: 0;opacity:0.7;border: none;">
    		<img width="100%" height="100%" src="blank.gif" style="background: url('loading.gif') no-repeat scroll 50% 50% transparent">
    	</div>
    	<form action="">
    	<br />
    	<br />
    		<input name="unmae" type="text" /><br />
    	<br />
    		<input name="upwd" type="text" /><br />
    	<br />
    		<input type="submit" /><br />
    	</form>
    </div>
  </body>
</html>