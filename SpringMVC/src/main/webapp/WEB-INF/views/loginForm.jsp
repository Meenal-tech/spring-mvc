<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yayy!</title>
</head>
<body>

<font color = "red">${wrong_pass}</font> 
<form action="/login" method="post"> Enter your name
<input type="text" name="name"/> 
Enter password <input type="password" name="password"/> 
Submit <input type="submit" value="Login" />
</form>
</body>
</html>