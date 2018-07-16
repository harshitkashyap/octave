<%@page import="lti.octave.bean.TransactionBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<%
		List<TransactionBean> recomends = (List) session.getAttribute("Txn");
	%>

	<table class="table table-hover" border="1">

		<c:forEach items="${Txn}" var="trans">
			<tr>
				<%-- <td>Transaction ID: <c:out value="${trans.txnId}" /></td> --%>
				<td>Transaction Date: <c:out value="${trans.txnDate}" /></td>
				<td>Transaction Amount: <c:out value="${trans.amount}" /></td>
				<td>Transaction Current Balance: <c:out value="${trans.currentBalance}" /></td>
				<td>Transaction Type: <c:out value="${trans.type}" /></td>

			</tr>
		</c:forEach>

	</table>
	</form>
	

</body>
</html>