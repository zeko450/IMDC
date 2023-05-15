package com.example.dao;

import com.example.entity.Film;

import java.util.List;

public interface IRechercheFilm {

    List<Film> retournerListFilms();
    List<Film> rechercherFilmParTitre(String titre);

    List<Film> rechercherFilmParAnnee(String annee);

    List<Film> rechercherFilmParCategorie(String categorie);

}
