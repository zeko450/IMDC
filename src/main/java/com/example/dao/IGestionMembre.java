package com.example.dao;

import com.example.entity.Membre;

import java.util.List;

public interface IGestionMembre {

    boolean ajouteMembre (Membre membre);

    boolean modifierMembre (int id, Membre membre);

    boolean supprimerMembre (int id);

    boolean modifierMdp (Membre membre, String nouveauMP, String dateNaissance);

    Membre  rechercherMembre (String nomUtilisateur);
}
