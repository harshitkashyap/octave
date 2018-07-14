<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="banner.html"%>
<title>Login</title>
</head>
<body>
<div>
	<Center>
		<form action="Signin.bank" method="post">
			<table  class="table table-hover" border="1">
				<%
					if (request.getParameter("invalid") != null) {
				%>
				<tr>
					<th colspan="2">Invalid User Id / Password</th>
				</tr>
				<%
					}
				%>
				
				<tr>
					<td><center>Email Id</center></td>
					<td><center>
							<input type="email" name="email" style="width: 100%" pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" required>
						</center></td>
				</tr>
				<tr>
					<td><center>Password</center></td>
					<td><center>
							<input type="password" name="password" style="width: 100%"
								required>
						</center></td>
				</tr>
				
					
			</table>
			<center>
			<label class="control-label col-sm-12">
			<input type="submit" value="login">
			</label>
			
			</center>
		</form>
		<form action="forget.bank" method="post">
		<label class="control-label col-sm-12">
			<input type="submit" value="Forget Password">
			</label>
			</form>
	</Center>
	</div>
</body>
</html>