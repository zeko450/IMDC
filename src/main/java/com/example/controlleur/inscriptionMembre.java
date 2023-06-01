package com.example.controlleur;

import com.example.dao.GestionMembreImpl;
import com.example.entity.Membre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "inscriptionMembre", value = "/inscriptionMembre")
public class inscriptionMembre extends HttpServlet {

    GestionMembreImpl gestionMembreDao = new GestionMembreImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

        try {
            gestionMembreDao.ajouteMembre(membre);
        } catch (Exception e){
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("membreCreer.jsp");
        dispatcher.forward(request, response);
    }
}
