package com.example.dao;

import com.example.entity.Film;

public interface IGestionFilm {

    boolean ajouterFilm(Film film);

    boolean modifierFilm(int id, Film film);

    boolean supprimerFilm(int id);
}
