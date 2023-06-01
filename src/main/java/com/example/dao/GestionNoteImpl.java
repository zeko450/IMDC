package com.example.dao;

import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class GestionNoteImpl implements IGestionNote {

    DataManager dataManager = null;

    public GestionNoteImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public boolean ajouterNote(Note note) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            dataManager.manager.persist(note);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public Note chercherNote(Film film, Membre membre) {
        try {
            Query query = dataManager.manager.createQuery("SELECT N FROM Note N WHERE N.film = :film and N.membre = :membre");
            query.setParameter("film",film);
            query.setParameter("membre",membre);
            Note note = (Note) query.getSingleResult();
            return note;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean modifierNote(int idNote, int note) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();

        try{
            Note noteExistante = dataManager.manager.find(Note.class,idNote);
            noteExistante.setNote(note);
            transaction.commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
            return false;
        }

    }
}
