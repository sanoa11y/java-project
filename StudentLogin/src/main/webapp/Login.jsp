<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentLogin</title>
</head>
<body>
	<h1 align="center">Student Login Form</h1>
	<form action="Login" method="post">
		<div align="center">
			<label>User Name:<input type="text" id="UserName"
				name="UserName" placeholder="Enter username"></label>
		</div>
		<br>
		<div align="center">
			<label>User Password:<input type="password" id="password"
				name="password" placeholder="Enter password"></label>
		</div>
		<br>
		<div align="center">
			<input type="submit" value="Login">
		</div>
	</form>
</body>
</html>