package dao;

import com.example.dao.IRechercheFilm;
import com.example.dao.RechercheFilmImpl;
import com.example.entity.Film;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RechercheFilmImplTest {

    private  IRechercheFilm dao;

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
        dao = new RechercheFilmImpl();
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @Test
    void ajouterFilmNonExistant(){

    }
}
