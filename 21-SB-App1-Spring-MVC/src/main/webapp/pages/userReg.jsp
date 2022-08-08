<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form style=" width: 50vw; margin-left : 40vw;" action="saveUser"    method="Post">

 <h2>User Registration Form</h2>
		<table >
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"  /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phno" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register" /></td>

			</tr>
			
			
		</table>
	</form>
</body>
</html>