<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELLO JSP</title>
</head>
<body>
<h1>Hello JSP</h1>
<h2>Hello Sandeep </h2>

<%! int a; %>
<% a =5;
 for(int i=0;i<a;i++)
 {
	 out.print(a);
 }

%>


</body>
</html>