<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>

 <h3 class="text-center">${Header}</h3>
           <p>${des }</p>
           <p style="color:green">${msg }</p>

<h1>Welcome , ${user.username }</h1>

<h1>Your Email Id is  ${user.email }</h1>

<h1>Your Password is  ${user.password } try to make strong which is secure</h1>


</body>
</html>