package com.example.controlleur;

import com.example.dao.GestionCommentaireImpl;
import com.example.dao.GestionMembreImpl;
import com.example.dao.GestionNoteImpl;
import com.example.dao.RechercheFilmImpl;
import com.example.entity.Commentaire;
import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletAffichageFilm", value = "/ServletAffichageFilm")
public class ServletAffichageFilm extends HttpServlet {

    RechercheFilmImpl rechercheFilmDao;
    GestionNoteImpl gestionNoteDao;
    GestionCommentaireImpl gestionCommentaireDao;
    GestionMembreImpl gestionMembreDao;


    @Override
    public void init() {
        rechercheFilmDao = new RechercheFilmImpl();
        gestionNoteDao = new GestionNoteImpl();
        gestionMembreDao = new GestionMembreImpl();
        gestionCommentaireDao = new GestionCommentaireImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("param");
        String url = "";
        if (param == null || param.equals("1")) {
            List<Film> list5DerniersFilm = rechercheFilmDao.retourner5DerniersFilms();
            request.setAttribute("list5DerniersFilm", list5DerniersFilm);
            url = "/accueil.jsp";
        } else if (param.equals("2")) {
            List<Film> listFilm = new ArrayList<>();

            String filtre = request.getParameter("filtres");
            String motClef = request.getParameter("motClef");

            if (filtre.equals("titre")) {
                listFilm = rechercheFilmDao.rechercherFilmParTitre(motClef);
            } else if (filtre.equals("année")) {
                listFilm = rechercheFilmDao.rechercherFilmParAnnee(motClef);
            } else if (filtre.equals("catégorie")) {
                listFilm = rechercheFilmDao.rechercherFilmParCategorie(motClef);
            }

            request.setAttribute("listFilm", listFilm);
            url = "/films.jsp";

        } else if (param.equals("3")) {
            List<Film> listFilm = rechercheFilmDao.retournerListFilms();
            request.setAttribute("listFilm", listFilm);
            url = "/films.jsp";

        } else if (param.equals("4")) {

            //Recuperer Film
            int id = Integer.parseInt(request.getParameter("idFilm"));
            Film film = rechercheFilmDao.rechercherFilmParId(id);

            //Recuperer liste de commentaire
            //List<Commentaire> listCommentaire = film.getCommentaireList();

            //Calculer note moyenne
            double somme = 0;
            double moyenne = 0;

            if(film.getNoteList().size() > 0){
                for (Note tmp : film.getNoteList()) {
                    somme += tmp.getNote();
                }
                moyenne = somme / film.getNoteList().size();
            }


            //request.setAttribute("listCommentaire",listCommentaire);
            request.setAttribute("moyenne", moyenne);
            request.setAttribute("film", film);

            url = "/detailsFilm.jsp";
        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
