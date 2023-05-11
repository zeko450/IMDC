package com.example.dao;

import com.example.entity.Film;

import java.util.List;

public interface IRechercheFilm {

    List<Film> rechercherFilmParNom(String nom);

    List<Film> rechercherFilmParAnnee(int annee);

    List<Film> rechercherFilmParCategorie(String categorie);

}
