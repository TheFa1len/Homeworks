<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome ${name}</title>
</head>
<body>

	<table border="1">


		<tr>
			<th><b>headtext</b></th>
			<th><b>annotation<b></b></th>
			<th><b>author</b></th>
			<th><b>release</b></th>
			<th><b>maintext</b></th>
		</tr>
		<c:forEach var="r" items="${result}">

			<tr>
				<td>${r.headtext}</td>
				<td>${r.annotation}</td>
				<td>${r.author}</td>
				<td>${r.date}</td>
				<td>${r.maintext}</td>
		</c:forEach>


	</table>

	<form action="NewsView" method="post">
		<td><input type="submit" value="Create Form" /></td>
	</form>

</body>
</html>