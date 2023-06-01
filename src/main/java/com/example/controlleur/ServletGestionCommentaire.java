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

@WebServlet(name = "ServletGestionCommentaire", value = "/ServletGestionCommentaire")
public class ServletGestionCommentaire extends HttpServlet {

    RechercheFilmImpl rechercheFilmDao;
    GestionCommentaireImpl gestionCommentaireDao;
    GestionMembreImpl gestionMembreDao;


    @Override
    public void init() {
        rechercheFilmDao = new RechercheFilmImpl();
        gestionMembreDao = new GestionMembreImpl();
        gestionCommentaireDao = new GestionCommentaireImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idFilm = Integer.parseInt(request.getParameter("idFilm"));
        Film film = rechercheFilmDao.rechercherFilmParId(idFilm);
        Membre membre = gestionMembreDao.rechercherMembre("AlainFlouflou");


        if (request.getParameter("message") != null) {
            String messageSaisi = request.getParameter("message");
            Commentaire nouveauCommentaire = new Commentaire(messageSaisi,membre,film);
            boolean commentaireAjoute = gestionCommentaireDao.ajouterCommentaire(nouveauCommentaire);
        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ServletAffichageFilm?param=4&idFilm="+idFilm);
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
