<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student Form</h3>
	<form:form action="saveStudent" method="POST" modelAttribute="student">
	 	<table >
			<tr>
				<td>Student Id:</td>
				<td><form:input path="sid"/></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><form:input path="sname"/></td>
			</tr>
			<tr>
				<td>Student Email:</td>
				<td><form:input path="semail"/></td>
			</tr>
			<tr>
				<td>Phone No:</td>
				<td><form:input path="phno"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>