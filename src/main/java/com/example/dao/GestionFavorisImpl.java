package com.example.dao;

import com.example.entity.Favoris;

public class GestionFavorisImpl implements IGestionFavoris{

    DataManager dataManager = null;

    public GestionFavorisImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public boolean ajouterFavoris(Favoris favoris) {
        return false;
    }

    @Override
    public boolean retirerFavoris(int id) {
        return false;
    }
}
