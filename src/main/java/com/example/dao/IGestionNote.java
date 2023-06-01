package com.example.dao;

import com.example.entity.Film;
import com.example.entity.Membre;
import com.example.entity.Note;

public interface IGestionNote {

 boolean ajouterNote (Note note);

 Note chercherNote(Film film, Membre membre);

 boolean modifierNote(int idNote, int note);
}
