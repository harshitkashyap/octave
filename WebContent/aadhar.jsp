<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- making imports for javascript, jquery, bootstrap -->
<script type="text/javascript"
	src="scripts/jquery-3.3.1.min.js"></script>
	<script type="text/javascript"
	src="scripts/aadhar_validation.js"></script>

<link rel="stylesheet" type="text/css"
	href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="css/main.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OPEN A DIGITAL BANK ACCOUNT</title>
</head>
<body>
<%@ include file="banner.html"%>
<form action="doAadharRegister.bank" method="post">
	<div style= "color:red">${invalid} ${existing}</div>
	<br><br>
  <label class="control-label col-sm-12"> AADHAR CARD : <input type="text" id="adar" maxlength="12" name="aadharNo"><br>
  </label>
  <br> <br>
  <label class="control-label col-sm-12">
  <input type="submit" value="NEXT">
  </label>
  
</form>
</body>
</html>