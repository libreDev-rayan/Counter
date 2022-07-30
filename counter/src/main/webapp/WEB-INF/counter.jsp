<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>

<div>
	<h1>you have visited 
		<a href="/your_server/"> http://your_server</a><c:out value="${count}"/> times
	</h1>
</div>

<div>
	<h1>
		<a href="/your_server/">Test another visit</a>
	</h1>
</div>

</body>
</html>