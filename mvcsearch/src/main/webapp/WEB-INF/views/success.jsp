<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Output Page</title>
</head>
<body>

<h1>Name is  ${  student.name } </h1>
<h1>Student Id is  ${  student.id } </h1>
<h1>Student date of Birth ${  student.date } </h1>
<h1>Courses is  ${  student.courses } </h1>
<h1>Student Gender is ${  student.gender } </h1>
<h1>Student Type is  ${  student.type } </h1>
<hr>
<h1>Address Street is  ${  student.address.street } </h1>
<h1>Address City is  ${  student.address.city } </h1>


</body>
</html>