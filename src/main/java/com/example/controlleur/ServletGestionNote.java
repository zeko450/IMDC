package com.example.controlleur;

import com.example.dao.GestionCommentaireImpl;
import com.example.dao.GestionMembreImpl;
import com.example.dao.GestionNoteImpl;
import com.example.dao.RechercheFilmImpl;
import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletGestionNote", value = "/ServletGestionNote")
public class ServletGestionNote extends HttpServlet {


    RechercheFilmImpl rechercheFilmDao;
    GestionNoteImpl gestionNoteDao;
    GestionMembreImpl gestionMembreDao;


    @Override
    public void init() {
        rechercheFilmDao = new RechercheFilmImpl();
        gestionNoteDao = new GestionNoteImpl();
        gestionMembreDao = new GestionMembreImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idFilm = Integer.parseInt(request.getParameter("idFilm"));
        Film film = rechercheFilmDao.rechercherFilmParId(idFilm);
        HttpSession session = request.getSession();
        Membre membre = (Membre) session.getAttribute("membre");

        if(membre != null) {
            System.out.println("le membre: " + membre);
            Note note = gestionNoteDao.chercherNote(film, membre);

            if (request.getParameter("rating") != null) {
                int noteSaisie = Integer.parseInt(request.getParameter("rating"));

                if (note == null) {
                    Note noteNouvelle = new Note(noteSaisie, membre, film);
                    boolean noteAjouté = gestionNoteDao.ajouterNote(noteNouvelle);
                } else {
                    boolean noteModifié = gestionNoteDao.modifierNote(note.getIdNote(), noteSaisie);
                }
            }
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
