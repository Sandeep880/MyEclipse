<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP FILE</title>
</head>
<body>

<! ---- For Adding static content --->
<%@ include file="file1.txt"%>

<br>

<! ---- For Adding Dynamic content --->
<jsp:include page="file2.txt"></jsp:include>

</body>
</html>