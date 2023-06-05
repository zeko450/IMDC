<%--
  Created by IntelliJ IDEA.
  User: Mouad
  Date: 5/23/2023
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscription</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <div class="row mt-5">
        <div col-2>
        </div>
        <div col-8>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="ServletAffichageFilm?param=1">Accueil</a>
                            </li>
                            <li class="nav-item mx-3">
                                <form action="ServletAffichageFilm">
                                    <div class="input-group mb-3 px-1 py-1 bg-dark">
                                        <select id="filtres" name="filtres" class="form-select">
                                            <option value="titre">Titre</option>
                                            <option value="année">Année</option>
                                            <option value="catégorie">Catégorie</option>
                                        </select>
                                        <input class="form-control me-2" type="search" placeholder="Search"
                                               aria-label="Search" name="motClef">
                                        <input type="hidden" name="param" value="2">
                                        <button class="btn btn-warning" type="submit">Search</button>
                                    </div>
                                </form>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="ServletAffichageFilm?param=3">Films</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href='ServletGestionFavoris/param=affichage'>Favoris</a>
                            </li>

                        </ul>
                        <a href="login.jsp">Se connecter</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="row mt-5 containerConnectionInscription">
        <form action="inscriptionMembre" method="POST" class="formConnectionInscription">
            <label for="nomUtilisateur" class="labelConnectionInscription">Nom d'utilisateur:</label>
            <input type="text" id="nomUtilisateur" name="nomUtilisateur" class="inputTextConnectionInscription"
                   required>

            <label for="motDePasse" class="labelConnectionInscription">Mot de passe:</label>
            <input type="password" id="motDePasse" name="motDePasse" class="inputTextConnectionInscription" required>

            <label for="nom" class="labelConnectionInscription">Nom:</label>
            <input type="text" id="nom" name="nom" class="inputTextConnectionInscription" required>

            <label for="prenom" class="labelConnectionInscription">Prénom:</label>
            <input type="text" id="prenom" name="prenom" class="inputTextConnectionInscription" required>

            <label for="email" class="labelConnectionInscription">Email:</label>
            <input type="text" id="email" name="email" class="inputTextConnectionInscription" required>

            <label for="dateNaissance" class="labelConnectionInscription">Date de naissance:</label>
            <input type="date" id="dateNaissance" name="dateNaissance" class="inputTextConnectionInscription"
                   required>

            <input type="submit" value="S'inscrire" class="submitConnectionInscription">
        </form>
    </div>
</div>
</body>
</html>
