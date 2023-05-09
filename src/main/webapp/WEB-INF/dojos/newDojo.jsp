<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="bg-light">
	<div class="container d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
		<div class="container card bg-dark text-light col-6 d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
			<h1 class="text-primary text-center">New Dojo</h1>
		
			<form:form action="/dojos/create" method="POST" modelAttribute="dojo">
				<div class="d-flex flex-column gap-2 ps-2">
					<form:label path="name">Name: </form:label>
					<form:errors class="text-danger fw-bold fst-italic" path="name"/>
					<form:input class="form-control" type="text" path="name" />
				</div>
				<div class="text-end my-2">
					<button class="btn btn-primary" type="submit">Create</button>						
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>