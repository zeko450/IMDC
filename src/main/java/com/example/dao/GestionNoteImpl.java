package com.example.dao;

import com.example.entity.Note;
import jakarta.persistence.EntityTransaction;

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
}
