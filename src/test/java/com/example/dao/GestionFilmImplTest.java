package com.example.dao;

import com.example.entity.Film;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionFilmImplTest {

    private GestionFilmImpl gestionFilm;

    @BeforeEach
    void setUp() {
        gestionFilm = new GestionFilmImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAjouterFilmRetourneTrue() {
        System.out.println("testAjouterFilmRetourneTrue");
        //Création d'un nouveau film
        Film film = new Film("A la poursuite de demain",
                " Casey, une adolescente brillante et optimiste, douée d’une grande curiosité scientifique et Frank, un homme qui fut autrefois un jeune inventeur de génie avant de perdre ses illusions, s’embarquent pour une périlleuse mission. Leur but : découvrir les secrets d’un lieu mystérieux du nom de Tomorrowland, un endroit situé quelque part dans le temps et l’espace, qui ne semble exister que dans leur mémoire commune... Ce qu’ils y feront changera à jamais la face du monde… et leur propre destin ",
                "2015",
                "https://www.bing.com/ck/a?!&&p=26b0f6844f3bad56JmltdHM9MTY4Mzc2MzIwMCZpZ3VpZD0xNjgyOWU2My1lZDI2LTYyNTMtMTcxZS04YzlmZWMxZDYzMWEmaW5zaWQ9NTQ4OA&ptn=3&hsh=3&fclid=16829e63-ed26-6253-171e-8c9fec1d631a&u=a1L3ZpZGVvcy9zZWFyY2g_cT10b21vcnJvdytsYW5kK3RyYWlsZXImdmlldz1kZXRhaWwmbWlkPUI4QjlGMEY1QjdEQzRCRjY3N0U4QjhCOUYwRjVCN0RDNEJGNjc3RTgmRk9STT1WSVJF&ntb=1",
                "https://www.bing.com/images/search?view=detailV2&ccid=7su1wuzP&id=D43C268FAE69F456F09ED2D9A66A668F108C3D06&thid=OIP.7su1wuzPqFSlT_A8FrYGPQHaLH&mediaurl=https%3a%2f%2fimage.tmdb.org%2ft%2fp%2foriginal%2fiHh0nVGVODAFduF6Q6njdSSCEfX.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.eecbb5c2eccfa854a54ff03c16b6063d%3frik%3dBj2MEI9maqbZ0g%26pid%3dImgRaw%26r%3d0&exph=3000&expw=2000&q=tomorrow+land+2015&simid=608050099811008178&FORM=IRPRST&ck=80A583FA3100BF882D56DB11B28382CE&selectedIndex=0",
                "2h 10",
                "Brad Bird",
                "action,aventure,sci-fi");
        //Ajout du film dans la BD
        boolean filmAjoute = gestionFilm.ajouterFilm(film);
        Assert.assertTrue(filmAjoute);
    }

    @Test
    void testModifierFilmRetourneTrue() {
        System.out.println("testModifierFilmRetourneTrue");
        //Création d'un nouveau film
        Film film = new Film("A la poursuite de demain",
                " Casey, une adolescente brillante et optimiste, douée d’une grande curiosité scientifique et Frank, un homme qui fut autrefois un jeune inventeur de génie avant de perdre ses illusions, s’embarquent pour une périlleuse mission. Leur but : découvrir les secrets d’un lieu mystérieux du nom de Tomorrowland, un endroit situé quelque part dans le temps et l’espace, qui ne semble exister que dans leur mémoire commune... Ce qu’ils y feront changera à jamais la face du monde… et leur propre destin ",
                "2017",
                "https://www.bing.com/ck/a?!&&p=26b0f6844f3bad56JmltdHM9MTY4Mzc2MzIwMCZpZ3VpZD0xNjgyOWU2My1lZDI2LTYyNTMtMTcxZS04YzlmZWMxZDYzMWEmaW5zaWQ9NTQ4OA&ptn=3&hsh=3&fclid=16829e63-ed26-6253-171e-8c9fec1d631a&u=a1L3ZpZGVvcy9zZWFyY2g_cT10b21vcnJvdytsYW5kK3RyYWlsZXImdmlldz1kZXRhaWwmbWlkPUI4QjlGMEY1QjdEQzRCRjY3N0U4QjhCOUYwRjVCN0RDNEJGNjc3RTgmRk9STT1WSVJF&ntb=1",
                "https://www.bing.com/images/search?view=detailV2&ccid=7su1wuzP&id=D43C268FAE69F456F09ED2D9A66A668F108C3D06&thid=OIP.7su1wuzPqFSlT_A8FrYGPQHaLH&mediaurl=https%3a%2f%2fimage.tmdb.org%2ft%2fp%2foriginal%2fiHh0nVGVODAFduF6Q6njdSSCEfX.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.eecbb5c2eccfa854a54ff03c16b6063d%3frik%3dBj2MEI9maqbZ0g%26pid%3dImgRaw%26r%3d0&exph=3000&expw=2000&q=tomorrow+land+2015&simid=608050099811008178&FORM=IRPRST&ck=80A583FA3100BF882D56DB11B28382CE&selectedIndex=0",
                "2h 10",
                "Brad Bird",
                "action,aventure,sci-fi");
        //Modifier le film existant avec le nouveau film crée
        boolean filmModifie = gestionFilm.modifierFilm(1,film);
        Assert.assertTrue(filmModifie);
    }

    @Test
    void supprimerFilm() {
    }
}