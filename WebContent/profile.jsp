<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">

</head>
<body>
	<%@ include file="banner.html"%>
	<div class="container-fluid">
		<div class="row" id="nav">

			<div class="col-lg-4 horizon">You are logged in as:</div>

			<div class="col-lg-4 horizon">Date:</div>

			<div class="col-lg-4 horizon">
				<a class="list_link" href="">Logout</a>
			</div>

		</div>
	</div>

	<div class="container-fluid">
		<div class="row">

			<div class="col-lg-3">
				<ul>
					<li><a class="list_link" href="">Profile</a></li>
					<li><a class="list_link">Account Statement </a></li>
					<li><a class="list_link" href="">Add Beneficiary </a></li>
					<li><a class="list_link" href="">Inter Bank Fund Transfer</a></li>
					<li><a class="list_link" href="">Intra Bank Fund Transfer</a></li>
					<li><a class="list_link" href="">Change Password</a></li>
				</ul>
			</div>

			<div class="col-lg-9">
				<h1 style="text-align: center; position: relative; top: 60px;">Account
					summary</h1>

				<table style="position: relative; top: 100px; left: 100px;">
					<tr>
						<td>Account Name</td>
						<td>Name</td>
						<td>Available Balance</td>
						<td>Transaction</td>
					</tr>

					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td><a href="">Click here for 10 transactions</a></td>
					</tr>

				</table>

				<div style="text-align: center; position: relative; top: 120px;">
					<a href="pan.jsp">View Nomination And PAN Details</a>
				</div>

			</div>

		</div>

	</div>
</body>
</html>