<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
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

			<div class="col-lg-4 horizon">You are logged in as: ${ userName.name}</div>

			<div class="col-lg-4 horizon">
				Date:<%
				DateFormat df = new SimpleDateFormat("dd/MM/yy");
				String formattedDate = df.format(new Date());
				out.println(formattedDate);
			%>
			</div>

			<div class="col-lg-4 horizon">
				<a class="list_link" href="Signout.bank">Logout</a>
			</div>

		</div>
	</div>

	<div class="container-fluid">
		<div class="row">

			<div class="col-lg-3">
				<ul>
					<li><a class="list_link" href="">Profile</a></li>
					<li><a class="list_link">Account Statement </a></li>
					<li><a class="list_link" href="txndetails.bank"> Mini
							Statement </a></li>
					<li><a class="list_link" href="">Add Beneficiary </a></li>
					<li><a class="list_link" href="">Inter Bank Fund Transfer</a></li>
					<li><a class="list_link" href="fundtransfer.jsp">Intra
							Bank Fund Transfer</a></li>
					<li><a class="list_link" href="">Change Password</a></li>
				</ul>
			</div>

			<div class="col-lg-9">
				<h1 style="text-align: center; position: relative; top: 60px;">Account
					summary</h1>

				<table style="position: relative; top: 100px; left: 100px;">
					<tr>
						<td>Account Number : ${User.accountNo}</td>
						<td>Name : ${userName.name}</td>
						<td>Available Balance :${User.currentBalance}</td>
					</tr>

				</table>

				<div style="text-align: center; position: relative; top: 120px;">
					<a href="nominations.jsp">View Nomination And PAN Details</a>
				</div>

			</div>

		</div>

	</div>
</body>
</html>