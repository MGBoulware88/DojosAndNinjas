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
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="bg-light">
	<div class="container d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
		<div class="container card bg-dark text-light col-6 d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
			<h1 class="text-primary text-center">New Ninja</h1>
		
			<form:form action="/ninjas/create" method="POST" modelAttribute="ninja">
				<div class="p-2 d-flex flex-column bg-dark text-light justify-content-start gap-1">
					<div class="d-flex flex-column gap-2 ps-2">
						<form:label path="dojo">Dojo</form:label>
						<form:errors class="text-danger fw-bold fst-italic" path="dojo"/>
						<form:select path="dojo">
							<c:forEach var="dojo" items="${allDojos}">
								<form:option  value="${dojo}"><c:out value="${dojo.name}"/></form:option>
							
							</c:forEach>
						</form:select>
					</div>
					<div class="d-flex flex-column gap-2 ps-2">
						<form:label path="firstName">First Name</form:label>
						<form:errors class="text-danger fw-bold fst-italic" path="firstName"/>
						<form:input class="form-control" type="text" path="firstName" />
					</div>
					<div class="d-flex flex-column gap-2 ps-2">
						<form:label path="lastName">Last Name</form:label>
						<form:errors class="text-danger fw-bold fst-italic" path="lastName"/>
						<form:input class="form-control" type="text" path="lastName" />
					</div>
					<div class="d-flex flex-column gap-2 ps-2">
						<form:label path="age">Age</form:label>
						<form:errors class="text-danger fw-bold fst-italic" path="age"/>
						<form:input class="form-control" type="number" path="age" />
					</div>
				</div>
				<div class="text-end pe-2">
					<button class="btn btn-primary" type="submit">Submit</button>						
				</div>
			</form:form>
			
		</div>
	</div>
</body>
</html>