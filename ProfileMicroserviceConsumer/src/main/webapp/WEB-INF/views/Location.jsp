<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>Storeaccount</title>
</head>

<body>
	<h1 style="color: red"></h1>
	<div class="container">
		<div class="row">
			<h2>Location Details</h2>
			<ul>
				<c:forEach items="${loci}" var="l">
					<li>${l.location_id}----${l.location_name}</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>