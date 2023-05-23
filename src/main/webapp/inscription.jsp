<%--
  Created by IntelliJ IDEA.
  User: Mouad
  Date: 5/23/2023
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inscription</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<header>
    <h1>Inscription</h1>
</header>
<div class="container">
    <form action="registration.jsp" method="POST">
        <label for="nomUtilisateur">Nom d'utilisateur:</label>
        <input type="text" id="nomUtilisateur" name="nomUtilisateur" required><br><br>

        <label for="motDePasse">Mot de passe:</label>
        <div class="password-input">
            <input type="motDePasse" id="motDePasse" name="motDePasse" required>
            <button type="button" class="toggle-password" onclick="togglePasswordVisibility()"></button>
        </div><br><br>

        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required><br><br>

        <label for="prenom">Prénom:</label>
        <input type="text" id="prenom" name="prenom" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="dateNaissance">Date de naissance:</label>
        <input type="date" id="dateNaissance" name="dateNaissance" required><br><br>

        <input type="submit" value="Register">
    </form>
</div>
<footer>
    <p>&copy; 2023 IMDC. All rights reserved.</p>
</footer>
</body>
</html>
