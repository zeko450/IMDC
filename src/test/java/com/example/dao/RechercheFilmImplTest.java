package com.example.dao;

import com.example.entity.Film;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RechercheFilmImplTest {

    private RechercheFilmImpl rechercheFilm;

    @BeforeEach
    void setUp() {
        rechercheFilm = new RechercheFilmImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRetournerListFilmsRetourneListeTaille1() {
        System.out.println("testRetournerListFilmsRetourneListeTaille1");
        //Chercher la liste des films
        List<Film> filmList = rechercheFilm.retournerListFilms();
        Assert.assertEquals(1,filmList.size());
    }

    @Test
    void testRechercherFilmParTitreRetourneListeTaille1() {
        System.out.println("testRechercherFilmParTitreRetourneListeTaille1");
        //Chercher film par titre
        List<Film> filmList = rechercheFilm.rechercherFilmParTitre("A la poursuite de demain");
        Assert.assertEquals(1,filmList.size());
    }

    @Test
    void testRechercherFilmParAnneeRetourneListeTaille1() {
        System.out.println("testRechercherFilmParAnneeRetourneListeTaille1");
        //Chercher film par annee
        List<Film> filmList = rechercheFilm.rechercherFilmParAnnee("2015");
        Assert.assertEquals(1,filmList.size());
    }

    @Test
    void testRechercherFilmParCategorieRetourneListeTaille1() {
        System.out.println("testRechercherFilmParCategorieRetourneListeTaille1");
        //Chercher film par categorie
        List<Film> filmList = rechercheFilm.rechercherFilmParCategorie("aventure");
        Assert.assertEquals(1,filmList.size());
    }

    @Test
    void testRetourner5DerniersFilmsRetourneListeTaille5() {
        System.out.println("testRetourner5DerniersFilmsRetourneListeTaille5");
        //Chercher les films
        List<Film> filmList = rechercheFilm.retourner5DerniersFilms();
        Assert.assertEquals(5,filmList.size());
    }
}