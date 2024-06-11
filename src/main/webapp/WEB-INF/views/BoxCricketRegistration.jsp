<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Royal Box Cricket Registration</title>
</head>
<body>

	<h1>Box Cricket Registration</h1>

	<form method="post" action="BoxCricketRegistration">

		<label for="name">Name</label>
		<input type="text" id="name" name="name">
			<span style="color:red">${message.name}</span><br>
		<br>
		<br> <label for="email">Email</label> <input type="email"
			id="email" name="email">
			<span style="color:red">${message.email}</span><br>
			<br>
		<br>

		<p>Playing Role</p>
		<select name="role" id="role">
			<option value="Batsman">Batsman</option>
			<option value="Bowler">Bowler</option>
			<option value="Allrounder">Allrounder</option>
		</select>
			<span style="color:red">${message.role}</span><br>
		<br>
		<br>

		<p>Select refreshment(s)</p>
		<input type="checkbox" id="tea" name="refreshments" value="Tea">
		<label for="tea">Tea</label> <input type="checkbox" id="coffee"
			name="refreshments" value="Coffee"> <label for="coffee">Coffee</label>
		<input type="checkbox" id="redbull" name="refreshments"
			value="RedBull"> <label for="redbull">RedBull</label> <input
			type="checkbox" id="water" name="refreshments" value="Water">
		<label for="water">Water</label><br>
		<br> <input type="submit" value="Register">
	</form>

</body>
</html>
