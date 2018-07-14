<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal details</title>
</head>
<body>
<%@ include file="banner.html"%>
<br><br>
	<center>
		<form action="doPanRegister.bank" method="post"
			class="table table-bordered">
			<table class="table table-hover" border="2">
				<tr>
					<td>Pan Card Number</td>
					<td><input type="text" id="obj" name="panNo" maxlength="10" pattern ="[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}" required /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required /></td>
				</tr>
				
			</table>
			<br>
			<br>
			<div>
             <label class="control-label col-sm-12">
				<input type="Submit" value="Next" align="bottom">
				</label>
			</div>
			</form>
</body>
</html>