<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="user" class = "sandeep.bean.User" scope="application"></jsp:useBean>

First Name : <jsp:getProperty property="firstName" name="user"/>
Last Name:<jsp:getProperty property="lastName" name="user"/>

</body>
</html>