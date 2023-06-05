package com.example.controlleur;

import com.example.dao.GestionMembreImpl;
import com.example.entity.Membre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {


    GestionMembreImpl gestionMembreDao;

    @Override
    public void init() {
        gestionMembreDao = new GestionMembreImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomUtilisateur = request.getParameter("nomUtilisateur");
        String mdp = request.getParameter("motDePasse");
        String url = "";
        String messageErreur = "";
        HttpSession session = request.getSession();

        Membre membre = gestionMembreDao.rechercherMembre(nomUtilisateur);

        if(membre != null){
            if(membre.getMotDePasse().equals(mdp)){
                url = "/ServletAffichageFilm?param=1";
                session.setAttribute("membre",membre);
            }else{
                url = "/login.jsp";
            }
        }else{
            url = "/login.jsp";
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
