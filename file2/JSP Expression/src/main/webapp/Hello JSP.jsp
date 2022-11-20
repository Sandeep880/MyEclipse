<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> HEllO JSP EXPRESSION</h1>

<%! public int x=22; %>  <!Decleration LINE>
<%= x %>                 <!Expression Line>

<%= new Integer(25) %>
<br>
<%= new String("Sandeep") %>
<br>
<%= new java.util.Date() %>
<br>
<%
int x=1000;
out.print(x);
%>
<br>
<br>
<% 
int y=3;
if(y>25)
{
   out.print("y is greater than 25");
}
else
{
  out.print("y is not greater than 25");
}

%>






</body> 
</html>