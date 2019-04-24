<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- demande à la jsp d'importer les tag lib  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="ServletCreer">

		<fieldset>
			<legend>Creation Clients</legend>
			<p />
			Nom : <input type="text" name="nom" placeholder="Entrez votre nom" />
			<!-- 				recupere placeholder par value  -->
			<p />
			Prénom : <input type="text" name="prenom"
				placeholder="Entrez votre prénom" />
			<p />
			Adresse : <input type="text" name="adresse"
				placeholder="Entrez votre adresse" />
			<p />
			Email : <input type="email" name="email"
				placeholder="Entrez votre email" />

			
		</fieldset>

		<input type="reset" value="Annuler" /> 
		<input type="submit" value="Valider" /> 

	</form>


</body>
</html>