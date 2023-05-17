<%--
  Created by IntelliJ IDEA.
  User: Ayoub
  Date: 2023-05-17
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <img src="images/imdc.png" alt="" style="width: 10%;">
        </div>
        <div col-8>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Accueil</a>
                            </li>
                            <li class="nav-item ms-5 ps-1 pt-1 pb-1 bg-dark">
                                <select id="filtres" class="form-select">
                                    <option value="titre" selected>Titre</option>
                                    <option value="année">Année</option>
                                    <option value="catégorie">Catégorie</option>
                                </select>
                            </li>
                            <form class="d-flex me-5 pe-1 py-1 bg-dark">
                                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                <button class="btn btn-warning" type="submit">Search</button>
                            </form>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Films</a>
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
</div>
</body>

</html>
