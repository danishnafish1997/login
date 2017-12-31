<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <% 
   String str=session.getAttribute("username").toString();
   if(str.equals("Null"))
   {
	   response.sendRedirect("login.html");
   }
   else
	   out.print("Welcome " + str);
   Cookie [] cookie =  request.getCookies(); 
  %>
  <br>
  <iframe width="560" height="315" src="https://www.youtube.com/embed/AZuwWOURi2Y" frameborder="0" allowfullscreen></iframe><br>
  <form action="SecondServlet">
    <input type ="submit" value="Logout">   
  </form>
</body>
</html>