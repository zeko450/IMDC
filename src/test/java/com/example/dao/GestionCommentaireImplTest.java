package com.example.dao;

import com.example.entity.Commentaire;
import com.example.entity.Film;
import com.example.entity.Membre;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class GestionCommentaireImplTest {

    private GestionCommentaireImpl gestionCommentaire;
    private GestionMembreImpl gestionMembre;
    private RechercheFilmImpl rechercheFilm;


    @BeforeEach
    void setUp() {
        gestionCommentaire = new GestionCommentaireImpl();
        gestionMembre = new GestionMembreImpl();
        rechercheFilm = new RechercheFilmImpl();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void ajouterCommentairereturnTrue() {
        System.out.println("ajouterCommentairereturnTrue");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        Film film = rechercheFilm.rechercherFilmParId(2);
        Commentaire commentaire = new Commentaire( "Excellent film", membre, film);
        boolean commentaireAjouter = gestionCommentaire.ajouterCommentaire(commentaire);
        Assert.assertTrue(commentaireAjouter);
    }

    @Test
    void modifierCommentairereturnTrue() {
        System.out.println("modifierCommentairereturnTrue");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        Film film = rechercheFilm.rechercherFilmParId(2);
        Commentaire commentaire = new Commentaire("Merveilleux film", membre, film);
        boolean commentaireModifier = gestionCommentaire.modifierCommentaire(3, commentaire);
        Assert.assertTrue(commentaireModifier);
    }

    @Test
    void supprimerCommentairereturnTrue() {
        System.out.println("supprimerCommentairereturnTrue");
        boolean commentaireSupprimer = gestionCommentaire.supprimerCommentaire(1);
        Assert.assertTrue(commentaireSupprimer);
    }
}