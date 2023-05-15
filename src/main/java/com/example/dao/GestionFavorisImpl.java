package com.example.dao;

import com.example.entity.Favoris;
import jakarta.persistence.EntityTransaction;

public class GestionFavorisImpl implements IGestionFavoris {

    DataManager dataManager = null;

    public GestionFavorisImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public boolean ajouterFavoris(Favoris favoris) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            dataManager.manager.persist(favoris);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean retirerFavoris(int id) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            Favoris favoris = dataManager.manager.find(Favoris.class, id);
            dataManager.manager.remove(favoris);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }
}
