<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="scripts/checkbox_validation.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<body>
    
	<%@ include file="banner.html"%>
	<center>
		<form action="Details.bank" modelAttribute="register" method="post"
			class="table table-bordered">
			<table class="table table-hover" border="1">
				<tr>
					<td>NAME</td>
					<td>${ Aadhar.name }</td>
				</tr>
				<tr>
					<td>ADDRESS</td>
					<td>${ Aadhar.address }</td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td>${ Aadhar.gender }</td>
				</tr>
				<tr>
					<td>DATE OF BIRTH</td>
					<td>${ Aadhar.dob }</td>
				</tr>
				<br />
				<tr>
					<td>CONTACT NUMBER</td>
					<td>${ Aadhar.mobileNo }</td>
				</tr>
				<tr>
					<td>CITY</td>
					<td>${ Aadhar.city }</td>
				</tr>
				
				<tr>
					<td>STATE</td>
					<td>${ Aadhar.state }</td>
				</tr>
				
				<tr>
					<td>COUNTRY</td>
					<td>${ Aadhar.country }</td>
				</tr>

			</table>
			I AGREE TO TERMS AND CONDITIONS <input type="checkbox" id="myCheck" onclick="myFunction()" required>

			<p id="text" style="display: none">By selecting this , you agree to share your information with Octave Bank</p>
			<br>
			<br>
			<div>

				<input type="Submit" value="Next" align="bottom">
			</div>
		</form>
</body>
</html>