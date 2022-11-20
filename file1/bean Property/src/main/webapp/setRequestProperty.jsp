<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="user" class="sandeep.bean.User" scope="request"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Satyadeep"/>
<jsp:setProperty property="lastName" name="user" value="Gupta"/>

values have been set

<%
request.getRequestDispatcher("getRequestProperty.jsp").forward(request,response);
%>


</body>
</html>