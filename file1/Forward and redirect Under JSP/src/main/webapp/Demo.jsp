<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo</title>
</head>
<body>

It's from the Original page
 <jsp:forward page ="forward.jsp"></jsp:forward> 

<br>

<%

  //request.getRequestDispatcher("forward.jsp").forward(request,response);
  response.sendRedirect("redirect.jsp");

%>

</body>
</html>