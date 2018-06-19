<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users list</title>
</head>
<body>

	<#include "css/style.css">
	<#include "templates/header.ftl">
	
	
	<div class="table-responsive">
	<table class="table table-hover">
		<tr>
			<th>Id</th>
			<th>Patiekalo Grupe</th>
			<th>Patiekalo Pavadinimas</th>
			<th>Kaloriju skaicius</th>
			<th>Kaina</th>
		</tr>
		<#list users as user>
			<tr>
				<td><a href="/EgzaminoAplikacija/user/${user.id}">${user.id}</a></td>
				<td>${user.patiekaloGrupe}</td>
				<td>${user.patiekaloPav}</td>
				<td>${user.kalorijuSk}</td>
				<td>${user.kaina}</td>
				<td><a href="/EgzaminoAplikacija/delete/${user.id}">Istrinti</a></td>
				<td><a href="/EgzaminoAplikacija/update/${user.id}">Redaguoti</a></td>
			</tr>
		</#list>
	</table>
	</div>
	
	<a class="btn" href="/EgzaminoAplikacija/addFood" role="button" id="buttonas">Prideti</a>
</body>
</html>