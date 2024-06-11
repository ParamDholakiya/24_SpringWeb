<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up </title>
</head>
<body>
	<h1>Sign up</h1>
	
	<form action="saveUser" method="post">
	<!-- First Name -->
	<label for="firstName">First Name:</label>
	<input type="text" id="firstName" name="firstName" required><br><br>
	
	<!-- E-Mail -->
	<label for="email">E-Mail:</label>
	<input type="email" id="email" name="email" required><br><br>
	
	<!-- Password -->
	<label for="password">Password:</label>
	<input type="password" id="password" name="password" required><br><br>
	
	<button type="submit">Sign up</button>
	</form>
	
</body>
</html>