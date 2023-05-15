package com.example.dao;

import com.example.entity.Favoris;
import com.example.entity.Film;
import com.example.entity.Membre;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionFavorisImplTest {

    private GestionFavorisImpl gestionFavoris;

    private GestionMembreImpl gestionMembre;

    private RechercheFilmImpl rechercheFilm;


    @BeforeEach
    void setUp() {
       gestionFavoris = new GestionFavorisImpl();
        gestionMembre = new GestionMembreImpl();
        rechercheFilm = new RechercheFilmImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ajouterFavorisretourneTrue() {
        System.out.println("ajouterFavorisretourneTrue");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        Film film = rechercheFilm.rechercherFilmParId(2);
        Favoris favoris = new Favoris(membre,film);
        boolean favorisAjouter = gestionFavoris.ajouterFavoris(favoris);
        Assert.assertTrue(favorisAjouter);
    }

    @Test
    void retirerFavorisRetourneTrue() {
        System.out.println("retirerFavorisRetourneTrue");
        boolean favorisSupprimer = gestionFavoris.retirerFavoris(1);
        Assert.assertTrue(favorisSupprimer);
    }
}