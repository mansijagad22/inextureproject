<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model and view</title>
</head>
<body>
	<h1>My name is Mansi</h1>
	<%
/* 	String m = (String) request.getAttribute("name");
	Integer n = (Integer) request.getAttribute("rollnumber"); */
	
	/* ========== use EL =================== */
	%>

	<h4>
		name is
		<%-- 		<%=m%>--%>
		and roll number is
		<%--	<%=n%> --%>
		${name} ${rollnumber}
	</h4>

	<hr>

	${marks}

	<hr>
	<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>