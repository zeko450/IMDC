package com.example.dao;

import com.example.entity.Film;

import java.util.List;

public class RechercheFilmImpl implements IRechercheFilm{

    DataManager dataManager = null;

    public RechercheFilmImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public List<Film> rechercherFilmParNom(String nom) {
        return null;
    }

    @Override
    public List<Film> rechercherFilmParAnnee(int annee) {
        return null;
    }

    @Override
    public List<Film> rechercherFilmParCategorie(String categorie) {
        return null;
    }
}
