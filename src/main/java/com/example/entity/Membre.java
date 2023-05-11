package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Membre extends Personne {

    //Attributs
    private int nbNote;
    private int nbCommentaire;
    private Date dateCreation;

    @OneToMany(mappedBy = "membre")
    private List<Favoris> favorisList;

    @OneToMany(mappedBy = "membre")
    private List<Commentaire> commentairesList;

    @OneToMany(mappedBy = "membre")
    private List<Note> noteList;

    //Constructeurs
    public Membre() {
    }

    public Membre(int nbNote, int nbCommentaire, Date dateCreation) {
        this.nbNote = nbNote;
        this.nbCommentaire = nbCommentaire;
        this.dateCreation = dateCreation;
    }

    public Membre(Integer idPersonne, String nomUtilisateur, String motDePasse, String nom, String prenom, String email, String dateNaissance, String typeCompte, int nbNote, int nbCommentaire, Date dateCreation) {
        super(idPersonne, nomUtilisateur, motDePasse, nom, prenom, email, dateNaissance, typeCompte);
        this.nbNote = nbNote;
        this.nbCommentaire = nbCommentaire;
        this.dateCreation = dateCreation;
    }

    //Getter and setter
    public int getNbNote() {
        return nbNote;
    }

    public void setNbNote(int nbNote) {
        this.nbNote = nbNote;
    }

    public int getNbCommentaire() {
        return nbCommentaire;
    }

    public void setNbCommentaire(int nbCommentaire) {
        this.nbCommentaire = nbCommentaire;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Favoris> getFavorisList() {
        return favorisList;
    }

    public void setFavorisList(List<Favoris> favorisList) {
        this.favorisList = favorisList;
    }

    public List<Commentaire> getCommentairesList() {
        return commentairesList;
    }

    public void setCommentairesList(List<Commentaire> commentairesList) {
        this.commentairesList = commentairesList;
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
        return "Membre{" +
                super.toString() + "nbNote=" + nbNote +
                ", nbCommentaire=" + nbCommentaire +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
