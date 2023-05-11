package com.example.dao;

import com.example.entity.Note;

public class GestionNoteImpl implements IGestionNote{

    DataManager dataManager = null;

    public GestionNoteImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public boolean ajouterNote(Note note) {
        return false;
    }
}
