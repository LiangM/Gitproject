<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" %>

<html>
<head>
<title>MVC TEST Page</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/css/D_riskcode.css" />">
</head>

<body>
	<h1>DB List</h1>
<form action="<c:url value="/hiber"/>" method="POST">
  <input type="submit" value="Submit" />
</form>	<table border="1">
		<tr>
			<th>POLICYKEY</th>
			<th>POLICYNO</th>
			<th>MAINRISK</th>
			<th>LOAD_DATE</th>
		</tr>
		<c:forEach items="${risks}" var="risk">
			<tr>
				<td>${risk.policykey}</td>
				<td>${risk.policyno}</td>
				<td>${risk.mainrisk}</td>
				<td>${risk.loaddate}</td>
			<tr />
		</c:forEach>
	</table>
</body>
</html>
