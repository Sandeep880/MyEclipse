<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:choose>
      <c:when test= "${param.lang == 'Java' }">
      Learning Java
      </c:when>
      <c:when test="${param.lang == 'Python' }">
      Learning Python
      </c:when>
      <c:when test="${param.lang == 'C++' }">
      Learning C++
      </c:when>
      <c:otherwise>
      Learning Something Good !!
      </c:otherwise>
      

</c:choose>

</body>
</html>