package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Note {

    //Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNote;
    private int note;

    @ManyToOne
    @JoinColumn(name = "membre_id_FK")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "film_id_FK")
    private Film film;

    //Constructeurs
    public Note() {
    }

    public Note(int idNote, int note) {
        this.idNote = idNote;
        this.note = note;
    }

    public Note(int idNote, int note, Membre membre, Film film) {
        this.idNote = idNote;
        this.note = note;
        this.membre = membre;
        this.film = film;
    }

    public Note(int note, Membre membre, Film film) {
        this.note = note;
        this.membre = membre;
        this.film = film;
    }

    //Getter and setter
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
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
        return "Note{" +
                "idNote=" + idNote +
                ", note=" + note +
                '}';
    }
}
