package com.example.controlleur;

import com.example.dao.GestionFavorisImpl;
import com.example.dao.GestionMembreImpl;
import com.example.dao.GestionNoteImpl;
import com.example.dao.RechercheFilmImpl;
import com.example.entity.Favoris;
import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletGestionFavoris", value = "/ServletGestionFavoris")
public class ServletGestionFavoris extends HttpServlet {

    RechercheFilmImpl rechercheFilmDao;

    GestionFavorisImpl gestionFavorisDao;

    @Override
    public void init() {
        rechercheFilmDao = new RechercheFilmImpl();
        gestionFavorisDao = new GestionFavorisImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String param = request.getParameter("param");
        String url = "";
        HttpSession session = request.getSession();
        Membre membre = (Membre) session.getAttribute("membre");
        if (membre != null) {
            if (param.equals("ajout")) {
                String idFilm = request.getParameter("idFilm");
                Film film = rechercheFilmDao.rechercherFilmParId(Integer.parseInt(idFilm));

                Favoris favoris = new Favoris(membre, film);
                boolean favorisAjoute = gestionFavorisDao.ajouterFavoris(favoris);
                url = "ServletAffichageFilm?param=4&idFilm=" + idFilm;

            } else if (param.equals("affichage")) {
                List<Favoris> listFavoris = membre.getFavorisList();
                List<Film> listFilm = new ArrayList<>();
                for(Favoris tmp : listFavoris){
                    listFilm.add(tmp.getFilm());
                }
                request.setAttribute("listFilm",listFilm);
                url = "/favoris.jsp";
            }
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
