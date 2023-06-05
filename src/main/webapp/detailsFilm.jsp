<%--
  Created by IntelliJ IDEA.
  User: mmena
  Date: 2023-05-31
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil</title>
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
                                <a class="nav-link" href='ServletGestionFavoris?param=affichage'>Favoris</a>
                            </li>

                        </ul>
                        <a href="login.jsp">Se connecter</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
<div class="container textresumefilm">
    <div class="row mt-5 pt-5">
        <div class="col-2"></div>
        <div class="col-3 ">
            <img src="${film.urlImage}" alt="Image" style="height: 300px;width: 200px">
            <br>
            <img class="icone" src="images/play-circle.png" alt="icone">
            <a href="${film.urlBandeAnnonce}">Bande-annonce</a>
            <br>
            <img class="icone" src="images/ajouter.png" alt="icone">
            <a href='ServletGestionFavoris?param=ajout&idFilm=${film.idFilm}'>Ajouter-favoris</a>
        </div>
        <div class="col-5">
            <h3>${film.titre}</h3>
            <p>${film.description}</p>
            <h5>Realisateur : ${film.realisateurs}</h5>
            <h5>${film.categorie}</h5>
            <h5>Durée : ${film.duree}</h5>
            <h5>Note moyenne : ${moyenne}</h5>
        </div>
        <div class="col-2"></div>
    </div>
    <div class="row mt-3">
        <div class="col-2"></div>
        <div class="col-4">
            <form action="ServletGestionNote">
                <div class="rating2">
                    <input type="radio" id="star5" name="rating" value="5"/>
                    <label for="star5">&#9733;</label>
                    <input type="radio" id="star4" name="rating" value="4"/>
                    <label for="star4">&#9733;</label>
                    <input type="radio" id="star3" name="rating" value="3"/>
                    <label for="star3">&#9733;</label>
                    <input type="radio" id="star2" name="rating" value="2"/>
                    <label for="star2">&#9733;</label>
                    <input type="radio" id="star1" name="rating" value="1"/>
                    <label for="star1">&#9733;</label>
                </div>
                <input type="hidden" name="idFilm" value="${film.idFilm}">
                <button class="btn btn-primary" type="submit"> Soumettre Note</button>
            </form>
        </div>
        <div class="col-6"></div>
    </div>
    <div class="row mt-5">
        <div class="col-2"></div>
        <div class="col-8">
            <h3>COMMENTAIRES</h3>
                <c:forEach var="commentaire" items="${film.commentaireList}">
                    <div class="container border my-2">
                    <div class="row">
                        <h5>${commentaire.membre.nom} ${commentaire.membre.prenom}</h5>
                    </div>
                    <div class="row">
                        ${commentaire.commentaire}
                    </div>
                    </div>
                </c:forEach>
            <div>
                <form action="ServletGestionCommentaire">
                    <div class="form-floating">
                        <textarea id="message" name="message" class="form-control" placeholder="Leave a comment here" style="height: 100px"></textarea>
                        <label for="message">Saisissez votre commentaire ici</label>
                    </div>
                    <input type="hidden" name="idFilm" value="${film.idFilm}">
                    <button class="btn btn-primary mt-2" type="submit"> Soumettre Commentaire</button>
                </form>
            </div>
        </div>
        <div class="col-2"></div>
    </div>
</div>

</body>

</html>
