<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
</head>
<body>
<% String m = request.getParameter("username");
out.println("welcome "+m);
out.println();
String n = application.getInitParameter("uservalue");
out.println("welcome context " + n);
%>

</body>
</html>