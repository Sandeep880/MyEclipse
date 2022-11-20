<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Name: <%= request.getParameter("name") %><br/>
Gender: <%= request.getParameter("gender") %><br/>
Langauge Known:
 <%
 String[] languages= request.getParameterValues("language");
 if(languages != null)
 {
	 for(int i=0;i<languages.length;i++){
		 out.print("<br/>");
		 out.print(languages[i]);
	 }
 }
 else
 {
	 out.print("None Selected");
 }
 
 %><br/>
Country: <%= request.getParameter("country") %><br/>

</body>
</html>