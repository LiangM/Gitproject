<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html"%>

<html>
<head>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/D_riskcode.css" />">
<title>Getting Started: Handing Form Submission</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Form</h1>
	<form:form commandName="testhiber" method="POST">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Id:</td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="error" /></td>
			<tr>
				<td>Value:</td>
				<td><form:input path="value" /></td>
				<td><form:errors path="value" cssClass="error" /></td>
			<tr>
				<td><input type="submit" value="submit" /></td>
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>

