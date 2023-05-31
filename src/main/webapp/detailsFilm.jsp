<%--
  Created by IntelliJ IDEA.
  User: mmena
  Date: 2023-05-31
  Time: 09:44
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
                <input class="form-control me-2" type="search" placeholder="Search"
                       aria-label="Search">
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
<div class="container">
  <div class="row mt-5 ">
    <div class="col-1"></div>
    <div class="col-4 textresumefilm">
      <img src="images/ALaPoursuiteDeDemain.jpg" alt="Image">
      <br>
      <img class="icone1" src="icones/play-circle.png" alt="icone">
      <a href="">Bande-annonce</a>
      <br>
      <h6 class="mx-2"> Realisateur : Brad Bird</h6>
      <h6 class="mx-2"> Acteurs : George Clooney-Britt Robertson-Hugh Laurie</h6>
      <img class="icone2" src="icones/ajouter.png" alt="icone">
      <a href="">Ajouter-favoris</a>
      <h6 class="mx-2"> Note moyenne : <div class="rating1">
        <input type="radio" id="star5" name="rating" value="5" />
        <label for="star5">&#9733;</label>
        <input type="radio" id="star4" name="rating" value="4" />
        <label for="star4">&#9733;</label>
        <input type="radio" id="star3" name="rating" value="3" />
        <label for="star3">&#9733;</label>
        <input type="radio" id="star2" name="rating" value="2" />
        <label for="star2">&#9733;</label>
        <input type="radio" id="star1" name="rating" value="1" />
        <label for="star1">&#9733;</label>
      </div>
      </h6>
      <h6 class="mx-2"> Vous avez vu ce film? vous pouvez laissez votre avis !</h6>
      <div class="rating2">
        <input type="radio" id="star5" name="rating" value="5" />
        <label for="star5">&#9733;</label>
        <input type="radio" id="star4" name="rating" value="4" />
        <label for="star4">&#9733;</label>
        <input type="radio" id="star3" name="rating" value="3" />
        <label for="star3">&#9733;</label>
        <input type="radio" id="star2" name="rating" value="2" />
        <label for="star2">&#9733;</label>
        <input type="radio" id="star1" name="rating" value="1" />
        <label for="star1">&#9733;</label>
      </div>
      <div>
        <textarea id="message" name="message" placeholder="Saisissez votre commentaire ici"></textarea>
      </div>
      <button class="btn btn-primary" type="submit">Soumettre</button>
      <h3>COMMENTAIRES</h3>
      <div>
                    <textarea id="message"
                              name="message"> MOHAMED:  sit amet consectetur adipisicing elit. Aliquam dolor officiis soluta nam beatae</textarea>
      </div>
      <div>
        <table  class="table table-borderless">
          <thead>
          <tr>
            <th>A propos</th>
            <th>Some text</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <th>Contact</th>
            <th>F.A.Q</th>
          </tr>
          <tr>
            <th>Vie privé</th>
            <th>Carrière</th>
          </tr>
          </tbody>
        </table>
      </div>
    </div>

    <div class="col-6 textresumefilm">
      <h3>Titre : A la poursuite de demain</h3>
      <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aliquam dolor officiis soluta nam beatae
        illum
        amet perferendis doloremque dolorum, et ad, aliquid culpa dolore? Fuga numquam deserunt nulla vero
        commodi.
        Lorem ipsum dolor sit amet consectetur adipisicing elit. In vitae tempore placeat itaque provident.
        Praesentium velit tenetur autem, minus aperiam dolor placeat, iure ut ipsum ea, dolorum quasi
        perspiciatis labore.
      </p>
      <h5>Genre : Action, Comedie, Sci-Fi</h5>
      <h5>Durée : 2h10</h5>
    </div>
  </div>
</div>

</body>

</html>
