<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+ request.getServerName()+":"+ request.getServerPort()+ path +"/"; 
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=path %>/styles/js/jquery-2.1.1.min.js"></script> 
<script src="<%=path %>/styles/layer/layer.js"></script> 
<title>登录界面</title>
<style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        .center0 {
			  position: fixed;
			  top: 50%;
			  left: 50%;
			  background-color: #3385FF;
			  width:50%;
			  height: 50%;
			  -webkit-transform: translateX(-50%) translateY(-50%);
		}
</style>
</head>
<body>
<div class="center0">
	<form action="login" id="loginForm" method="post" class="center0">
		<table style="margin-top: 10%;margin-left: 20%;">
		   	<tr>
		   		<td style="color: #FFFFFF;">用户名:</td>
		   		<td><input name="username" id="username" type="text" placeholder="请输入用户名"/></td>
		   	</tr>
		   	<tr>
		   		<td style="color: #FFFFFF;">密码:</td>
		   		<td><input name="password" id="password" type="password" placeholder="请输入密码"/></td>
		   	</tr>
		   	<tr>
		   		<td><input id="login" type="button" value="登录"/></td>
		   	</tr>
		</table>  
	</form>   
</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login").click(function(){
			var username = $("#username").val();
			var password = $("#password").val();
			if(username == null || username == "") {
				layer.alert("用户名不为空");
			}else if(password == null || password == "") {
				layer.alert("密码不为空");
			}else {
				$("#loginForm").submit();
			}
		}); 
	});
</script>
</html>