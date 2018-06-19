<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Redagavimas</title>
</head>
<body>

	<#include "templates/header.ftl">

	<form name="user" action="/EgzaminoAplikacija/updateUser" method="post">
		<input placeholder="ID" type="text" name="id" value="${user.id}"> <br><br>
		<input placeholder="Patiekalo Grupe" type="text" name="patiekaloGrupe" value="${user.patiekaloGrupe}"> <br><br>
		<input placeholder="Patiekalo Pavadinias" type="text" name="patiekaloPav" value="${user.patiekaloPav}"> <br><br>
		<input placeholder="Kaloriju Skaicius" type="text" name="kalorijuS" value="${user.kalorijuSk}"> <br><br>
		<input placeholder="kaina" type="text" name="kaina" value="${user.kaina}"> <br><br>
		<input type="submit" value="Redaguoti" class="btn btn-primary">
	</form>
</body>
</html>