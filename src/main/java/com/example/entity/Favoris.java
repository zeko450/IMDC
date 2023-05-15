package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Favoris {

    //Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFavoris;

    @ManyToOne
    @JoinColumn(name = "membre_id_fk")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "film_id_fk")
    private Film film;

    //Constructeurs
    public Favoris() {
    }

    //Getter and setter
    public int getIdFavoris() {
        return idFavoris;
    }

    public void setIdFavoris(int idFavoris) {
        this.idFavoris = idFavoris;
    }

    public Favoris(int idFavoris, Membre membre, Film film) {
        this.idFavoris = idFavoris;
        this.membre = membre;
        this.film = film;
    }

    public Favoris(Membre membre, Film film) {
        this.membre = membre;
        this.film = film;
    }

    //ToString
    @Override
    public String toString() {
        return "Favoris{" +
                "idFavoris=" + idFavoris +
                ", membre=" + membre +
                ", film=" + film +
                '}';
    }
}
