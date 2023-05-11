package com.example.entity;

import jakarta.persistence.*;

@MappedSuperclass
public class Personne {

    //Attributs
    @Id
    @GeneratedValue()
    private Integer idPersonne;

    private String nomUtilisateur;
    private String motDePasse;
    private String nom;
    private String prenom;

    @Column(unique = true)
    private String email;
    private String dateNaissance;
    private String typeCompte;

    //Constructeurs
    public Personne() {
    }

    public Personne(Integer idPersonne, String nomUtilisateur, String motDePasse, String nom, String prenom, String email, String dateNaissance, String typeCompte) {
        this.idPersonne = idPersonne;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.typeCompte = typeCompte;
    }

    //Getter and Setter
    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    //ToString
    @Override
    public String toString() {
        return "Personne{" +
                "idPersonne=" + idPersonne +
                ", nomUtilisateur='" + nomUtilisateur + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", typeCompte='" + typeCompte + '\'' +
                '}';
    }
}
