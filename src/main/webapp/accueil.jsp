<%--
  Created by IntelliJ IDEA.
  User: Ayoub
  Date: 2023-05-17
  Time: 15:28
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
<div>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-6">
                <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="imgcarousel" src="images/carousel1.jpg"  alt="...">
                        </div>
                        <div class="carousel-item">
                            <img class="imgcarousel" src="images/carousel2.jpg"  alt="...">
                        </div>
                        <div class="carousel-item">
                            <img class="imgcarousel" src="images/carousel3.jpg" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </div>
            <div class="col-6"></div>
        </div>
        <br>
        <span class="nouveautes"> Nos nouveautés</span> <br>
        <c:forEach var="item" items="${requestScope.list5DerniersFilm}">
            <img src="${item.urlImage}" class="img-thumbnail" style="height: 300px;width: 200px" alt="${item.titre}">
        </c:forEach>
        <br> <br> <br>

    </div>
</div>
</body>

</html>
