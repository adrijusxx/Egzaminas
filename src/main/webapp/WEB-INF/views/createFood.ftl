<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Naujas irasas</title>
</head>
<body>

	<#include "templates/header.ftl">

	<@spring.bind "user"/>
	<#if noErrors??>
		Data <br>
		Patiekalo grupe:  ${user.patiekaloGrupe} <br>
		Patiekalo pavadinimas:  ${user.patiekaloPav} <br>
		Kaloriju skaicius:  ${user.kalorijuSk} <br>
		Kaina:  ${user.kaina} <br>
		
		<a class="btn btn-primary" href="/EgzaminoAplikacija/" role="button">Rodyti maista</a>
	<#else>
		<form name="user" action="/EgzaminoAplikacija/addFood" method="post">
		<div class="form">
			Patiekalo Grupe: <br>
				<@spring.formInput "user.patiekaloGrupe"/>
				<@spring.showErrors "<br>"/><p>
	  <br>  Patiekalo Pavadinimas: <br>
				<@spring.formInput "user.patiekaloPav"/>
				<@spring.showErrors "<br>"/><p>
	  		Kaloriju Skaicius: <br>
				<@spring.formInput "user.kalorijuSk"/>
				<@spring.showErrors "<br>"/><p>
			Kaina: <br>
				<@spring.formInput "user.kaina"/>
				<@spring.showErrors "<br>"/><p>
			<input type="submit" value="Add" class="btn btn-primary">
		</div>
		</form>
	</#if>

</body>
</html>