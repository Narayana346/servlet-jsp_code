<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container">
		<div>
			<h2>Registration Form</h2>
		</div>
		<div class="formcontainer">
			<form action="regForm" method="post">

				<div class="inputLabel">Name</div>
				<input type="text" placeholder="Please Enter Your Name" name="name1"
					class="inputValue">


				<div class="inputLabel">Email-id</div>
				<input type="email" placeholder="Please Enter Your Email-id"
					name="email1" class="inputValue">


				<div class="inputLabel">Password</div>
				<input type="password" placeholder="Please Enter Your Password"
					name="pass1" class="inputValue">


				<div class="inputLabel">City</div>
				<select name="city1">
					<option>select your city</option>
					<option>Delhi</option>
					<option>Mumbai</option>
					<option>Pune</option>
					<option>Bengaluru</option>
				</select>

				<div class="gender">Gender</div>
				<input type="radio" name="gender1" value="male" 				class="gen">Male&nbsp;&nbsp;&nbsp;
				<input type="radio" name="gender1" value="female" class="gen">Female

				<div class="inputLabel">
					<input type="submit" value="Register" class="btn" />
				</div>

			</form>
		</div>
	</div>
</body>
</html>