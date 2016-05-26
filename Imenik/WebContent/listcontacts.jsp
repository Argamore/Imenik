<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>eeMenik | Kontakt lista</title>
    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css'>

 </head>
 <jsp:include page="header.jsp"></jsp:include>
 <body>
<div class="container">
		<h1>Kontakt lista</h1>

		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Ime</th>
					<th>Prezime</th>
					<th>Email</th>
					<th>Telefon</th>
					<th>Uredi</th>
					<th>Obrisati</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${contacts}" var="contact" varStatus="counter">
					<tr>
						<td>${counter.count}</td>
						<td>${contact.name}</td>
						<td>${contact.lastname}</td>
						<td>${contact.email}</td>
						<td>${contact.phone}</td>
						<td><a href="edit?id=${contact.contactId}">Uredi kontakt</a></td>
						<td><a href="delete?id=${contact.contactId}">Obrisati</a></td>
						<td></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
		</div>
</body>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<script src="js/index.js"></script>
</html>
