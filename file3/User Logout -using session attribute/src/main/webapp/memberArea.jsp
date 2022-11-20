<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Area</title>
</head>
<body>
<%
String username=null,sessionID=null;
Cookie cookies[] = request.getCookies();
if(cookies !=null){
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("username")){
			username= cookie.getValue();
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionID=cookie.getValue();
		}
	}
	
}
if(username ==null || sessionID == null){
  response.sendRedirect("login.jsp");
}

%>


UserName  : <%= username %><br/> Current Session : 
SessionID : <%= sessionID %><br/>

This is member Area !!. 

<form action="<%= request.getContextPath() %>/memberController"  method ="get">
<input type ="hidden" name="action" value ="destroy">
<input type ="submit" value="Logout">
</form>





</body>
</html>