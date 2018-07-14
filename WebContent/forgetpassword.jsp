<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<body>
	<%@ include file="banner.html"%>
	<Center>
		<form action="forget.bank" method = "post">
			<table class="table table-hover" border="1">
				<tr>
					<th colspan="2">FORGET PASSWORD</th>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required></td>
				</tr>


				<tr>
					<td>Mobile Number</td>
					<td><input type="text" pattern ="[0-9]{10}" name="mobileNo" minlength="10" maxlength="10" required></td>
				</tr>

				<tr>
					<th colspan="2"><input type="submit" value="next"></th>
				</tr>
			</table>
		</form>
	</Center>
</body>
</html>