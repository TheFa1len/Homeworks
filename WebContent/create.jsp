<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create news form</title>
</head>
<body>
	<center>
<td>You are logged as <%=session.getAttribute("name")%></td>
		<form action="CreateServlet" method="post">
			<fieldset style="width: 400px">
				<center>
					<legend> Creating News </legend>
					<table>
						<tr>
							<td>Write Header</td>
							<td><input type="text" name="headtext" required="required" /></td>
						</tr>
						<tr>
							<td>Write Annotation</td>
							<td><input type="text" name="annotation" required="required" /></td>
						</tr>
						<tr>
							<td>Write genre</td>
							 <td><select name="genre">
							 <option disabled>Choose genre</option>
							<c:forEach items="${genres}" var="g">
										<option value="${g.id_categories}">${g.genre}</option>
									</c:forEach></select></td>
						</tr>
						<tr>
							<td>Write main text</td>
							<td><input type="text" name="maintext" required="required" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Confirm" /></td>
						</tr>
					</table>
				</center>
			</fieldset>
		</form>
	</center>
</body>
</html>
