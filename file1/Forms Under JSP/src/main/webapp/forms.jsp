<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forms</title>
</head>
<body>

<form action="s<%= request.getContextPath()%>/controller" method ="get">

Full Name: <input type="text" name="name" required/><br/>
Gender   : <input type ="radio" name ="gender" value="male" checked="checked">Male
           <input type= "radio" name ="gender" value="female">Female<br/>
Langauge Known: <input type="checkbox"  name = "language" value= "Hindi"> Hindi
                <input type ="checkbox" name = "language" value ="English"> English
                <input type ="checkbox" name=  "language" value="Bhojpuri"> Bhojpuri<br/>
Country: <select name ="country">
         <option value="India">India</option>
         <option value = "Pakistan">Pakistan</option>
         <option value = "SriLanka">SriLanka</option>
         <option value = "Bangaladesh">Bangladesh</option>
         <option value = "Bhutan">Bhutan</option>
         </select><br/>
         <input type="submit" value="submit">
         

</form>

</body>
</html>