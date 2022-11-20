<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>

<%
      String[] names = new String[3];
      names[0]= "Sandeep";
      names[1]= "John";
      names[2]="Mandeep";

%>

<c:forEach items ="<%= names%>" var = "name">

     ${name }
     <br>
     

</c:forEach>


</body>
</html>