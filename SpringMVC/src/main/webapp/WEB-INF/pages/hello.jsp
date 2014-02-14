<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/D_riskcode.css" />">
</head>
<body>
	<h1>Car List</h1>
 
	<c:forEach items="${cars}" var="car">
		${car.brand} ${car.model}: ${car.price}
		<br />
	</c:forEach>
 
 </body>
</html>