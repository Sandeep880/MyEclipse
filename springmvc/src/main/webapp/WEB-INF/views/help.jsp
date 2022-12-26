<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored ="false" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

<h1>This is our Help Page</h1>
<h2>Contacting this Number on this Number for the Help</h2>

<%
   /*  String name=(String)request.getAttribute("name");
	Integer id =(Integer)request.getAttribute("ghar");	
    LocalDateTime time= (LocalDateTime)request.getAttribute("time"); */
    

%>

<h1>My Name is 
           <%--  <%=name %> --%>
           ${name}
</h1>
<h1>My Id Is 
              <%-- <%=id %> --%>
              ${ghar}
</h1>
<h1>Today date and Time is 
                 <%-- <%=time.toString() %> --%>
                 ${time }

</h1>
<hr>
<%-- ${marks } --%>

<c:forEach var = "item" items="${marks }">
 <%-- <h1>${item }</h1> --%>
          <h1><c:out value="${item }"></c:out> </h1> 
</c:forEach>


</body>
</html>