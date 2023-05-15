package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Commentaire {

    //Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommentaire;
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "membre_id_FK")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "film_id_FK")
    private Film film;

    //Constructeurs
    public Commentaire() {
    }

    public Commentaire(int idCommentaire, String commentaire) {
        this.idCommentaire = idCommentaire;
        this.commentaire = commentaire;
    }

    public Commentaire(int idCommentaire, String commentaire, Membre membre, Film film) {
        this.idCommentaire = idCommentaire;
        this.commentaire = commentaire;
        this.membre = membre;
        this.film = film;
    }

    //Getter and setter
    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    //ToString
    @Override
    public String toString() {
        return "Commentaire{" +
                "idCommentaire=" + idCommentaire +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
