<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="bg-light">
	<div class="container d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
		<h1 class="text-primary"><c:out value="${dojo.name}"/> Location Ninjas</h1>
 		<table class="table table-bordered table-striped table-dark">
 			<thead>
				<tr>
 					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
 				</tr>
 			</thead>
			<tbody>
 				<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
 					<td class=""><c:out value="${ninja.firstName}"/></td>
 					<td class=""><c:out value="${ninja.lastName}"/></td>
					<td class=""><c:out value="${ninja.age}" /></td>
 				</tr>
 				</c:forEach>
 			</tbody>
 		</table>
	</div>
</body>
</html>