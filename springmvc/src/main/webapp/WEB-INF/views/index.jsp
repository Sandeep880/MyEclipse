<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>This Is Our Home Page</h1>

<%
   String name=(String)request.getAttribute("name");
   Integer id=(Integer)request.getAttribute("id");
   List<String> list=(List<String>)request.getAttribute("nameList");
   
   
%>

<h1>Name is <%=name%></h1>
<h1>Id is <%=id %></h1>

<%
   for(String s:list){
	  
%>

<h1><%=s %></h1>
<% } %>

</body>
</html>