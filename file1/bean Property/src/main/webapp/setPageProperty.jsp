<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="user" class="sandeep.bean.User" scope="page"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Satyadeep"/>
<jsp:setProperty property="lastName" name="user" value="Gupta"/>
<br/>
values have been set

First Name : <jsp:getProperty property="firstName" name="user"/>
Last Name:<jsp:getProperty property="lastName" name="user"/>

</body>
</html>