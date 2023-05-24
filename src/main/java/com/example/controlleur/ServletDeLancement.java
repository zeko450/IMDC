package com.example.controlleur;

import com.example.dao.RechercheFilmImpl;
import com.example.entity.Film;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletDeLancement", value = "/ServletDeLancement")
public class ServletDeLancement extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RechercheFilmImpl rechercheFilmDao = new RechercheFilmImpl();
        List<Film> list5DerniersFilm = rechercheFilmDao.retourner5DerniersFilms();

        request.setAttribute("list5DerniersFilm", list5DerniersFilm);

        RequestDispatcher disp = getServletContext().getRequestDispatcher("/accueil.jsp");
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
