package com.example.controlleur;

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
import java.util.Date;

@WebServlet(name = "inscriptionMembre", value = "/inscriptionMembre")
public class ServletInscriptionMembre extends HttpServlet {

    GestionMembreImpl gestionMembreDao;

    @Override
    public void init() {
        gestionMembreDao = new GestionMembreImpl();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomUtilisateur = request.getParameter("nomUtilisateur");
        String motDePasse = request.getParameter("motDePasse");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String dateNaissance = request.getParameter("dateNaissance");

        Membre membre = new Membre();
        membre.setNomUtilisateur(nomUtilisateur);
        membre.setMotDePasse(motDePasse);
        membre.setNom(nom);
        membre.setPrenom(prenom);
        membre.setEmail(email);
        membre.setDateNaissance(dateNaissance);
        membre.setDateCreation(new Date());
        membre.setTypeCompte("membre");

        try {
            gestionMembreDao.ajouteMembre(membre);
        } catch (Exception e){
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("membreCreer.jsp");
        dispatcher.forward(request, response);

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
