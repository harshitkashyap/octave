<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Password</title>
</head>
<body>
	<%@ include file="banner.html"%>
	<center>
		<form action="newPasssword.bank" method = "post">
			<table class="table table-hover" border="1">
				<tr>
					<th colspan="2">CHANGE PASSWORD</th>
				</tr>
				<tr>
					<td>NEW PASSWORD</td>
					<td><input type="password" name="password" minlength="8" maxlength="12" required></td>
				</tr>

				<tr>
					<th colspan="2"><input type="submit" value="Change Password"></th>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>