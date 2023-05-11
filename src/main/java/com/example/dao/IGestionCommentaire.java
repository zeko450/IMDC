package com.example.dao;

import com.example.entity.Commentaire;

public interface IGestionCommentaire {

    boolean ajouterCommentaire(Commentaire commentaire);

    boolean modifierCommentaire(int id, Commentaire commentaire);

    boolean supprimerCommentaire(int id);
}
