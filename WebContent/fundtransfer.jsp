<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@ include file="banner.html"%>
	<div class="container-fluid">
		<div class="row topnav" id="nav">

			<div class="col-lg-4 horizon">You are logged in as: ${ User.email}</div>

			<div class="col-lg-4 horizon" id="date">Date:</div>
			
			<div class="col-lg-4 horizon">
				<a class="list_link" href="">Logout</a>
			</div>

		</div>
	</div>

	<div class="container-fluid">
		<div class="row">

			<div class="col-lg-3">
				<ul>
					<li><a class="list_link" href="profile.jsp">Profile</a></li>
					<li><a class="list_link" href="startpage.jsp">Account Statement</a></li>
					<li><a class="list_link" href="">Add Beneficiary</a></li>
					<li><a class="list_link" href="interbankfundtransfer.jsp">Inter Bank Fund Transfer</a></li>
					<li><a class="list_link" href="">Intra Bank Fund Transfer</a></li>
					<li><a class="list_link" href="">Change Password</a></li>
				</ul>
			</div>

			<div class="col-lg-9">
				<h1 style="text-align: center; position: relative; top: 60px;">Fund Transfer</h1>

				<form action="fundTransfer.bank" method="post">
				<div style= "color:red">${fund} ${accountIncorrect} ${success}</div>
				<table style="position: relative; top: 100px; left: 280px;">
				
				<tr>
				   <td>Account From</td>
				   <td>${ User.getAccountNo() }</td>
				</tr>
				
				<tr>
				   <td>Account To</td>
				   <td><input type="text" name="accountTo"></td>
				</tr>
				
				<tr>
				   <td>Amount</td>
				   <td><input type="text" name="amount"></td>
				</tr>
				
				</table>
				
				<input class="button" type="submit" value="Submit">
				</form>
				<div style="text-align: center; position: relative; top: 120px;">
					
				</div>

			</div>

		</div>

	</div>
</body>
</html>