package com.example.dao;

import com.example.entity.Membre;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GestionMembreImplTest {
    private  GestionMembreImpl gestionMembre;

    @BeforeEach
    void setUp() {
        gestionMembre = new GestionMembreImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAjouteMembreRetourneTrue() {
        System.out.println("testAjouteMembreRetourneTrue");
        Membre membre = new Membre("AlainFlouflou","1234","Flouflou","Alain","alainflouflou@gmail.com","03/06/1998","Membre",new Date());
        membre.setNbNote(0);
        membre.setNbCommentaire(0);
        boolean membreAjouter = gestionMembre.ajouteMembre(membre);
        Assert.assertTrue(membreAjouter);

    }

    @Test
    void testModifierMembreretourneTrue() {
        System.out.println("testModifierMembreretourneTrue");
        Membre membre = new Membre("AlainFlouflou","5678","Flouflou","Alain","alainflouflou@gmail.com","03/06/1998","Membre",new Date());
        membre.setNbNote(0);
        membre.setNbCommentaire(0);
        boolean membreModifier = gestionMembre.modifierMembre(1, membre);
        Assert.assertTrue(membreModifier);

    }

    @Test
    void testSupprimerMembreRetourneTrue() {
        System.out.println("testSupprimerMembreRetourneTrue");
        boolean MembreSupprimer = gestionMembre.supprimerMembre(2);
        Assert.assertTrue(MembreSupprimer);
    }

    @Test
    void testModifierMdpRetourneTrue() {
        System.out.println("testModifierMdpRetourneTrue");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        boolean MPModifier = gestionMembre.modifierMdp(membre,"4444", "03/06/1998");
        Assert.assertTrue(MPModifier);
    }

    @Test
    void testRechercherMembreRetounerMembreNotNull() {
        System.out.println("testRechercherMembreRetounerMembreNotNull");
        Membre membre = gestionMembre.rechercherMembre("AlainFlouflou");
        Assert.assertNotNull(membre);

    }
}