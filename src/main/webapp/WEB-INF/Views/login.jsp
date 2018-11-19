
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>




<form action = "/login.do" method="post"> 

Email <input type = "text" name = "email"/>
<br>
Password <input type = "text" name = "password"/> <input type = "submit" value="Login"/>
</form>

<p><font color="red"> ${Error}</font></p>


<br>

</body>
</html>
