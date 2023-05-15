package com.example.dao;

import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionNoteImplTest {

    private GestionNoteImpl gestionNote;

    private GestionMembreImpl gestionMembre;

    private RechercheFilmImpl rechercheFilm;

    @BeforeEach
    void setUp() {
        gestionNote = new GestionNoteImpl();
        gestionMembre = new GestionMembreImpl();
        rechercheFilm = new RechercheFilmImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ajouterNoteRetourneTrue() {
        System.out.println("ajouterNoteRetourneTrue");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        Film film = rechercheFilm.rechercherFilmParId(2);
        Note note = new Note(4,membre,film);
        boolean noteAjoute = gestionNote.ajouterNote(note);
        Assert.assertTrue(noteAjoute);
    }
}