<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- demande à la jsp d'importer les tag lib  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Connexion</title>
</head>
<body>

<h1>Bienvenue cher conseiller de ProxiBanque !</h1>
<h2>Vous pouvez vous connecter ci-dessous :</h2>

	<form method="post" action="ServletLogin">

		<fieldset>
			<legend>Connexion</legend>
			<p />
			Login : <input type="text" name="login"
				placeholder="Entrez votre login" />
			<p />
			Mot de passe : <input type="password" name="mdp"
				placeholder="Entrez votre mot de passe" />
			<p />
		</fieldset>
		
		<input type="submit" value="Envoyer" />

	</form>
	
</body>
</html>