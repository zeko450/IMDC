<%--
  Created by IntelliJ IDEA.
  User: Mouad
  Date: 5/23/2023
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<header>
    <h1>Login Form</h1>
</header>
<div class="container">
    <form action="loginDao.jsp" method="POST">
        <label for="nomUtilisateur">Nom d'utilisateur:</label>
        <input type="text" id="nomUtilisateur" name="nomUtilisateur" required><br><br>

        <label for="motDePasse">Mot de passe:</label>
        <div class="password-input">
            <input type="password" id="motDePasse" name="motDePasse" required>
        </div><br><br>

        <input type="submit" value="Login">
        <div><a href="forgot-password.jsp" class="forgot-password">Mot de passe oublié?</a></div>
    </form>
</div>
<footer>
    <p>&copy; 2023 IMDC. All rights reserved.</p>
</footer>
</body>
</html>

