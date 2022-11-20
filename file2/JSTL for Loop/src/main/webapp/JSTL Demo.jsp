<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>s
</head>
<body>

<c:forEach  var ="i" begin="0" end="29" step ="3">
${i }
<br>
</c:forEach>

</body>
</html>