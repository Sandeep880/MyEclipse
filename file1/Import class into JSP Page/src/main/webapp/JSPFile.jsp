<%@ page import = "java.util.Date,Sandeep.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP FILE</title>
</head>
<body>
<!
<%@ page import = "java.util.Date,Sandeep.UserDefined" %>
>


<%= new Date() %>
<br>

<% out.print(new java.util.Date()); %>

<br>
<!
<%@ page import ="Sandeep.UserDefined" %>
>
<% out.print(new UserDefined().Demo()); %>

</body>
</html>