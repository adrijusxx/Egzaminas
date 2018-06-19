<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Paredaguota informacija</title>
</head>
<body class="container">
	
	<#include "templates/header.ftl">
	
	<p>Paredaguota informacija</p>
	<div class="table-responsive">
	<table class="table table-sm">
		<tr>
			<td><b>Patiekalo Grupe:</b></td>
			<td>${user.patiekaloGrupe}</td>
		</tr>
		<tr>
			<td><b>Patiekalo Pavadinimas:</b></td>
			<td>${user.patiekaloPav}</td>
		</tr>
		<tr>
			<td><b>Kaloriju Skaicius:</b></td>
			<td>${user.kalorijuSk}</td>
		</tr>
		<tr>
			<td><b>Kaina:</b></td>
			<td>${user.kaina}</td>
		</tr>
	</table>
	</div>
	
	<br>
	<a class="btn btn-primary" href="/EgzaminoAplikacija/" role="button">Grizti</a>
	
</body>
</html>