package com.example.dao;

import com.example.entity.Film;
import com.example.entity.Membre;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class RechercheFilmImpl implements IRechercheFilm {

    DataManager dataManager = null;

    public RechercheFilmImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public List<Film> retournerListFilms() {
        try {
            Query query = dataManager.manager.createQuery("SELECT F FROM Film F");
            List<Film> listeFilm= query.getResultList();
            return listeFilm;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Film> rechercherFilmParTitre(String titre) {
        try {
            Query query = dataManager.manager.createQuery("SELECT F FROM Film F WHERE F.titre = :titre");
            query.setParameter("titre",titre);
            List<Film> listeFilmParNom = query.getResultList();
            return listeFilmParNom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Film> rechercherFilmParAnnee(String annee) {
        try {
            Query query = dataManager.manager.createQuery("SELECT F FROM Film F WHERE F.anneeSortie = :annee");
            query.setParameter("annee",annee);
            List<Film> listeFilmParAnnee = query.getResultList();
            return listeFilmParAnnee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Film> rechercherFilmParCategorie(String categorie) {
        try {
            Query query = dataManager.manager.createQuery("SELECT F FROM Film F WHERE F.categorie like :categorie");
            query.setParameter("categorie","%" + categorie + "%");
            List<Film> listeFilmParCategorie = query.getResultList();
            return listeFilmParCategorie;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Film rechercherFilmParId(int id) {
        try {
            Query query = dataManager.manager.createQuery("SELECT F FROM Film F WHERE F.idFilm = :id");
            query.setParameter("id",id);
            Film film = (Film) query.getSingleResult();
            return film;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Film> retourner5DerniersFilms() {
        try {
            Query query = dataManager.manager.createNativeQuery("SELECT * FROM Film order by idFilm desc");
            query.setMaxResults(5);
            List<Film> listeFilm= query.getResultList();
            return listeFilm;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
