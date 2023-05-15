package com.example.dao;

import com.example.entity.Favoris;

public interface IGestionFavoris {

    boolean ajouterFavoris(Favoris favoris);

    boolean retirerFavoris(int id);

}
