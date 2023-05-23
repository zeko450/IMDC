package com.example.controlleur;

import com.example.dao.RechercheFilmImpl;
import com.example.entity.Film;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletGestionRechercheFilm", value = "/ServletGestionRechercheFilm")
public class ServletGestionRechercheFilm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RechercheFilmImpl rechercheFilmDao = new RechercheFilmImpl();
        List<Film> listFilm = new ArrayList<>();

        String filtre = request.getParameter("filtres");
        String motClef = request.getParameter("motClef");

        System.out.println(filtre);

        if(filtre.equals("titre")){
            listFilm = rechercheFilmDao.rechercherFilmParTitre(motClef);
        }else if(filtre.equals("année")){
            listFilm = rechercheFilmDao.rechercherFilmParAnnee(motClef);
        }else if(filtre.equals("catégorie")){
            listFilm = rechercheFilmDao.rechercherFilmParCategorie(motClef);
        }



        request.setAttribute("listFilm", listFilm);

        RequestDispatcher disp = getServletContext().getRequestDispatcher("/films.jsp");
        disp.forward(request,response);
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
