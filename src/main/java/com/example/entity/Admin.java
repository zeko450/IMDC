package com.example.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends Personne{

    //Attributs
    private String departement;

    //Constructeurs
    public Admin() {
    }

    public Admin(String departement) {
        this.departement = departement;
    }

    public Admin(Integer idPersonne, String nomUtilisateur, String motDePasse, String nom, String prenom, String email, String dateNaissance, String typeCompte, String departement) {
        super(idPersonne, nomUtilisateur, motDePasse, nom, prenom, email, dateNaissance, typeCompte);
        this.departement = departement;
    }

    //Getter and setter
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    //Tostring
    @Override
    public String toString() {
        return "Admin{" +
                super.toString() + "departement='" + departement + '\'' +
                '}';
    }
}
