<%--
  Created by IntelliJ IDEA.
  User: Ayoub
  Date: 2023-05-23
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Films</title>
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
            <img src="images/imdc.png" alt="" style="width: 10%;">
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
                                <a class="nav-link" href='#'>Favoris</a>
                            </li>

                        </ul>
                        <a href="nav-link" href="#">Se connecter</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <c:forEach var="item" items="${requestScope.listFilm}">
        <div class="row my-3">
            <div class="col-3">
                <img src="${item.urlImage}" class="img-thumbnail" style="height: 100%; width: 100%" alt="${item.titre}">
            </div>
            <div class="col-6" style="background:rgba(299,299,299)">
                <div class="row">
                    <a href="ServletAffichageFilm?param=4&idFilm=${item.idFilm}"><h1>${item.titre}</h1></a>
                </div>
                <div class="row">
                    <p style="margin-bottom: 0px;">Durée: ${item.duree}</p>
                </div>
                <div class="row">
                    <p class="fs-5">${item.description}</p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
