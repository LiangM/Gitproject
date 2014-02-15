<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html" %>

<head>
<title>Getting Started: Handing Form Submission</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="<c:url value="/css/D_riskcode.css" />" rel="stylesheet">
</head>
<body>
	<h1>Result</h1>
	${testhiber.id}
	<br> ${testhiber.value}
	<br>
	<a href=<c:url value="/insert"/>>Submit another message</a>
</body>
</html>
