package com.example.entity;

import jakarta.persistence.*;
import org.hibernate.Length;

import java.util.List;

@Entity
public class Film {

    //Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFilm;
    private String titre;
    @Column(length=2500)
    private String description;
    private String anneeSortie;
    @Column(length=2500)
    private String urlBandeAnnonce;
    @Column(length=2500)
    private String urlImage;
    private String duree;
    private String realisateurs;
    private String categorie;

    @OneToMany(mappedBy = "film")
    private List<Favoris> favorisList;

    @OneToMany(mappedBy = "film")
    private List<Commentaire> commentaireList;

    @OneToMany(mappedBy = "film")
    private List<Note> noteList;

    //Constructeurs
    public Film() {
    }

    public Film(String titre, String description, String anneeSortie, String urlBandeAnnonce, String urlImage, String duree, String realisateurs, String categorie) {
        this.titre = titre;
        this.description = description;
        this.anneeSortie = anneeSortie;
        this.urlBandeAnnonce = urlBandeAnnonce;
        this.urlImage = urlImage;
        this.duree = duree;
        this.realisateurs = realisateurs;
        this.categorie = categorie;
    }

    public Film(int idFilm, String titre, String description, String anneeSortie, String urlBandeAnnonce, String urlImage, String duree, String realisateurs, String categorie) {
        this.idFilm = idFilm;
        this.titre = titre;
        this.description = description;
        this.anneeSortie = anneeSortie;
        this.urlBandeAnnonce = urlBandeAnnonce;
        this.urlImage = urlImage;
        this.duree = duree;
        this.realisateurs = realisateurs;
        this.categorie = categorie;
    }

    //Getter and setter
    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public String getUrlBandeAnnonce() {
        return urlBandeAnnonce;
    }

    public void setUrlBandeAnnonce(String urlBandeAnnonce) {
        this.urlBandeAnnonce = urlBandeAnnonce;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(String realisateurs) {
        this.realisateurs = realisateurs;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Favoris> getFavorisList() {
        return favorisList;
    }

    public void setFavorisList(List<Favoris> favorisList) {
        this.favorisList = favorisList;
    }

    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    //ToString
    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", anneeSortie='" + anneeSortie + '\'' +
                ", urlBandeAnnonce='" + urlBandeAnnonce + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", duree='" + duree + '\'' +
                ", realisateurs='" + realisateurs + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
