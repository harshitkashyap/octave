<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.html"%>
	<br>
	<br>
	<center>
		<form action="doPanRegister.bank" method="post"
			class="table table-bordered">
			<table class="table table-hover" border="2">
				<tr>
					<td>Pan Card Number</td>
					<td>${User.panNo }</td>
				</tr>
				<tr>
					<td>Aadhar Card Number</td>
					<td>${userName.aadharNo}</td>
				</tr>
				<tr>
				</tr>
			</table>
		</form>
	</center>


</body>
</html>