<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="sandeep.bean.User" scope="session"></jsp:useBean>

<% /**
<jsp:setProperty property="firstName" name="user" value="Satyadeep"/>
<jsp:setProperty property="lastName" name="user" value="Gupta"/>
values have been set

**/%>

<form action="getProperty.jsp" method="post">
First Name: <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>'><br/>
Last Name: <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'><br/>
<input type= "submit" value = "submit">
</form>
</body>
</html>