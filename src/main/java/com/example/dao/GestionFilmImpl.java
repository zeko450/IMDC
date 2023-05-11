package com.example.dao;

import com.example.entity.Film;
import jakarta.persistence.EntityTransaction;

public class GestionFilmImpl implements IGestionFilm{

    DataManager dataManager = null;

    public GestionFilmImpl() {this.dataManager = DataManager.getInstanceManager();}


    @Override
    public boolean ajouterFilm(Film film) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            dataManager.manager.persist(film);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean modifierFilm(int id, Film film) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();


        try{
            Film filmExistant = dataManager.manager.find(Film.class,id);
            filmExistant = film;
            transaction.commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean supprimerFilm(int id) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            Film film = dataManager.manager.find(Film.class, id);
            dataManager.manager.remove(film);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }
}
